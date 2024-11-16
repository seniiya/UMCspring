package umc.spring.study.repository.UserRepository;

import umc.spring.study.domain.User;
import umc.spring.study.domain.mapping.UserMission;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserMission> findUserMissionsWithStatus(Long userId, String status);
    User findUserWithTotalPoints(Long userId);
    List<UserMission> findUserMissionsByPoint(Long userId, Integer point);
}
