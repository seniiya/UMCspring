package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.User;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.enums.MissionStatus;

import java.math.BigInteger;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //mission이랑 연계
    private Integer point;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // BigInteger는 Long 표현
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    //    @Enumerated(EnumType.STRING)
//    private UserMission status;
    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}
