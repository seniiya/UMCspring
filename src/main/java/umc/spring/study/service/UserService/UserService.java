package umc.spring.study.service.UserService;

import umc.spring.study.domain.User;
import umc.spring.study.domain.mapping.UserMission;

import java.util.List;

public interface UserService {
    List<UserMission> getUserMissionStatus(Long userId, String status);
    User getUserPoints(Long userId);
    List<UserMission> getUserMissionsByPoint(Long userId, Integer point);
}
