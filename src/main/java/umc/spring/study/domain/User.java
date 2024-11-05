package umc.spring.study.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.enums.Gender;
import umc.spring.study.domain.mapping.Category;
import umc.spring.study.domain.mapping.UserMission;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private LocalDate birth;

    private String specAddr;

    //enum
    @Enumerated(EnumType.STRING)
    private Gender gender;

    //소셜 로그인 고려 못 했는데 나중에 추가, 이미 가입된 계정인지 status 필요?

    private String email;

    private Integer totalPoints;

    private Integer phoneNumber;

    // user - usermission 일대다 관계
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserMission> userMissions;

    // Category
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Category> categories;

    // 유저 삭제 시 모든 리뷰도 삭제되도록 설정 => 이런거 추가해줘야하나? 급 고민
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Review> reviews;
}