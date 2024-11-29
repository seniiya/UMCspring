package umc.spring.study.repository.UserMissionRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.UserMission;
import umc.spring.study.domain.mapping.QUserMission;
import umc.spring.study.domain.QStore;
import umc.spring.study.domain.QMission;
import com.querydsl.core.types.dsl.CaseBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMissionRepositoryImpl implements UserMissionRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public UserMissionRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public List<UserMission> findMissionsByUserId(Long userId, int limit, int offset) {
        QUserMission userMission = QUserMission.userMission;
        QMission mission = QMission.mission;
        QStore store = QStore.store;

        return queryFactory
                .select(userMission)
                .from(userMission)
                .join(userMission.mission, mission)
                .join(mission.store, store)
                .where(userMission.user.id.eq(userId))
                .orderBy(
                        new CaseBuilder()
                                .when(userMission.status.eq(MissionStatus.ACTIVE)).then(1)
                                .when(userMission.status.eq(MissionStatus.INACTIVE)).then(2)
                                .when(userMission.status.eq(MissionStatus.COMPLETE)).then(3)
                                .otherwise(4).asc(),
                        userMission.updatedAt.desc()
                )
                .limit(3) // 조회할 때 최대 개수 제한
                .offset(12) // 조회할 시작 위치 설정하여 페이지 지정
                .fetch();
    }

}
