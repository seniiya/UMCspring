package umc.spring.study.service.Review;

import umc.spring.study.domain.Review;

import java.util.List;

public interface ReviewQueryService {

    /**
     * 특정 가게(storeId)의 리뷰를 페이징하여 가져오는 메서드
     * @param storeId 가게 ID
     * @param page 페이지 번호
     * @param size 페이지당 리뷰 수
     * @return List<Review> 해당 가게의 리뷰 목록
     */
    List<Review> getReviewsByUser(Long userId, int page, int size);
    List<Review> getReviewsByMinScore(Float minScore, int page, int size);
}

