package umc.spring.study.repository.StoreRepository;

import umc.spring.study.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
