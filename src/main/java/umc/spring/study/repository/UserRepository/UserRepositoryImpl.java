package umc.spring.study.repository.UserRepository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import umc.spring.study.domain.QUser;
import umc.spring.study.domain.User;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.QUserMission;
import umc.spring.study.domain.mapping.UserMission;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<UserMission> findUserMissionsWithStatus(Long userId, String status) {
        QUserMission userMission = QUserMission.userMission;

        return queryFactory
                .selectFrom(userMission)
                .where(userMission.user.id.eq(userId)
                        .and(userMission.status.stringValue().eq(status)))
                .orderBy(userMission.createdAt.desc())
                .fetch();
    }

    @Override
    public User findUserWithTotalPoints(Long userId) {
        QUser user = QUser.user;
        QUserMission userMission = QUserMission.userMission;

        return queryFactory
                .selectFrom(user)
                .leftJoin(user.userMissions, userMission)
                .where(user.id.eq(userId))
                .fetchOne();
    }

    @Override
    public List<UserMission> findUserMissionsByPoint(Long userId, Integer point) {
        QUserMission userMission = QUserMission.userMission;

        return queryFactory
                .selectFrom(userMission)
                .where(userMission.user.id.eq(userId)
                        .and(userMission.point.eq(point)))
                .orderBy(userMission.createdAt.desc())
                .fetch();
    }
}
