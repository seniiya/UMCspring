package umc.spring.study.domain.mapping;

// store 와도 연결되어있는데 이건 일 쪽임
import umc.spring.study.domain.FoodCategory;
import umc.spring.study.domain.User;
import umc.spring.study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Category extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //nn 외래키? onetomany / manytoone
    private BigInteger userId;

    // nn 외래키? onetomany / manytoone
//    private BigInteger foodCategoryId;
    @ManyToOne
    @JoinColumn(name = "foodCategoryId")
    private FoodCategory foodCategory;

}
