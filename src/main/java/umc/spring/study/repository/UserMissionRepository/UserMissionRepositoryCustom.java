package umc.spring.study.repository.UserMissionRepository;

import umc.spring.study.domain.mapping.UserMission;
import java.util.List;


public interface UserMissionRepositoryCustom {
    List<UserMission> findMissionsByUserId(Long userId, int limit, int offset);
}
