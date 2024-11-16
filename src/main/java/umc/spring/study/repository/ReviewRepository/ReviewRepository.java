package umc.spring.study.repository.ReviewRepository;

import umc.spring.study.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    Page<Review> findByStoreId(Long storeId, Pageable pageable);
}
