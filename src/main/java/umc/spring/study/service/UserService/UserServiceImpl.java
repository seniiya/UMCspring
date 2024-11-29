package umc.spring.study.service.UserService;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.domain.User;
import umc.spring.study.domain.mapping.UserMission;
import umc.spring.study.repository.UserRepository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserMission> getUserMissionStatus(Long userId, String status) {
        return userRepository.findUserMissionsWithStatus(userId, status);
    }

    @Override
    public User getUserPoints(Long userId) {
        return userRepository.findUserWithTotalPoints(userId);
    }

    @Override
    public List<UserMission> getUserMissionsByPoint(Long userId, Integer point) {
        return userRepository.findUserMissionsByPoint(userId, point);
    }
}
