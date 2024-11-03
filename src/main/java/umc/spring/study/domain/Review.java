package umc.spring.study.domain;

import umc.spring.study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.ArrayList;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    // nn +
    private BigInteger userId;

    //nn +
    private BigInteger storeId;

    // nn
    private Float rating;
}

// review도 다른 테이블들과 다 관계에 있어 mapping에 있어야 하지 않을지