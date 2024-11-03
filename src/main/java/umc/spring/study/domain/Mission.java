package umc.spring.study.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.mapping.UserMission;

import java.math.BigInteger;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missionName;

    private String description;

    private Integer point;

    //외래키
    private BigInteger storeId;

    //외래키
    private BigInteger locationId;

    private String missionSpec;


    // mission-usermission
    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<UserMission> userMissions;
}
