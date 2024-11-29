package umc.spring.study.repository.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.User;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
