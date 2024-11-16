package umc.spring.study.service.UserMissionService;

import umc.spring.study.domain.mapping.UserMission;
import umc.spring.study.repository.UserMissionRepository.UserMissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMissionQueryServiceImpl implements UserMissionQueryService {

    private final UserMissionRepository userMissionRepository;

    @Autowired
    public UserMissionQueryServiceImpl(UserMissionRepository userMissionRepository) {
        this.userMissionRepository = userMissionRepository;
    }

    @Override
    public List<UserMission> getUserMissions(Long userId, int limit, int offset) {
        return userMissionRepository.findMissionsByUserId(userId, limit, offset);
    }
}
