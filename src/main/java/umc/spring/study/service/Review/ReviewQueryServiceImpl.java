package umc.spring.study.service.Review;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.domain.QReview;
import umc.spring.study.domain.Review;
import umc.spring.study.repository.ReviewRepository.ReviewRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewQueryServiceImpl implements ReviewQueryService {

    private final ReviewRepository reviewRepository;
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Review> getReviewsByUser(Long userId, int page, int size) {
        return List.of();
    }

    @Override
    public List<Review> getReviewsByMinScore(Float minScore, int page, int size) {
        return List.of();
    }

    @Override
    public List<Review> getReviewsByStore(Long storeId, int page, int size) {
        QReview review = QReview.review;

        return queryFactory
                .selectFrom(review)
                .where(review.store.id.eq(storeId))
                .orderBy(review.createdAt.desc())
                .offset((long) page * size)
                .limit(size)
                .fetch();
    }
}