package kr.fast.community.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.fast.community.entity.Like;
import java.util.List;


public interface LikeRepository extends JpaRepository<Like, Integer> {

	Like findByPostIdAndMemberId(int postId, String username);

}
