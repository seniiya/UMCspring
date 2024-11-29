package umc.spring.study.domain;

import umc.spring.study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.mapping.Category;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // nn column (length = 100)
    private String name;

    private Float score;

    // nn
    private String address;

    //latitude 없앴는데 왜 SQL 테이블에서 안 없어지지

    @ManyToOne
    @JoinColumn(name = "category_id") // 테이블 생성시 이름
    private Category category; // 외래키

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    // Store와 Mission 간의 일대다 관계 설정
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mission> missionList = new ArrayList<>();

    // Store와 Review 간의 일대다 관계 설정
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviewList = new ArrayList<>();

    // 다대다 관계 - 가게를 삭제했을 때 해당 가게에 있던 리뷰나 미션들 모두
    // 삭제되어야 하기에 이를 설정해줘도 좋음

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", score=" + score +
                ", region=" + (location != null ? location.getRegionName() : "N/A") + // region의 이름 출력
                '}';
    }
}
