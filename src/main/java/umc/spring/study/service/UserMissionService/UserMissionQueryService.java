package umc.spring.study.service.UserMissionService;

import umc.spring.study.domain.mapping.UserMission;
import java.util.List;

public interface UserMissionQueryService {
    List<UserMission> getUserMissions(Long userId, int limit, int offset);
}
