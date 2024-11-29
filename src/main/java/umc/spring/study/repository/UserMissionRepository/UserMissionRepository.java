package umc.spring.study.repository.UserMissionRepository;

import umc.spring.study.domain.mapping.UserMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMissionRepository extends JpaRepository<UserMission, Long>, UserMissionRepositoryCustom {
}
