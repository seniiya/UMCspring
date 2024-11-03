package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.study.domain.common.BaseEntity;

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

//    @Enumerated(EnumType.STRING)
//    private UserMission status;

    //mission이랑 연계
    private Integer point;

    //외래키
    private BigInteger userId;

    //외래키
    private BigInteger missionId;


}
