# 헬스장에 등록된 회원 목록을 조회
select * from user; 

# 헬스장에 등록된 회원 수를 조회
select count(*) from user;

# 헬스장에 등록된 프로그램을 조회 
select * from program;

# 모닝 요가를 수강 신청 인원수를 조회
SELECT 
    COUNT(*) AS 모닝요가수강인원
FROM
    course
WHERE
    program_id = (SELECT
			id
		FROM
			program
		WHERE
			title = '모닝 요가');

# 프로그램별 수강인원을 조회
# outer join
# group by : course테이블에 program_id를 이용
# count()를 이용
SELECT 
    program.*, name,
    concat(COUNT(program_id), '명') as 수강인원 # concat은 이어붙이기, program_id를 카운트
FROM
    program
        LEFT JOIN # left에 위치한 program 테이블을 기준으로
    course ON program_id = program.id #on은 무엇을 기준으로 할지
		JOIN
	trainer ON trainer_id = trainer.id
GROUP BY program.id; # program.id를 기준으로 묶음

# 사물함을 조회
select * from locker;

# 사물함이 사용중이면 O, 아니면 X로 조회
# if(조건, 참, 거짓)
# where 컬럼 = null : X 
# where 컬럼 is null : O
select id 라커번호, if(user_id is null, 'X', 'O') as 사용중 from locker order by 라커번호;

# 라커를 이용중인 회원명을 조회
select
	locker.id as 라커번호,
	ifnull(user.name, '비어 있음') as 사용자명
from
	locker
		left join
	user on user_id = user.id
order by 라커번호;

# 프로그램별 현재 출석 인원수를 조회 
SELECT 
    program.*, count(att.id) as 출석인원수
FROM
    (SELECT 
        *
    FROM
        attendance
    WHERE
        date = CURDATE()) att
        RIGHT JOIN
    program ON program_id = program.id
GROUP BY program.id;