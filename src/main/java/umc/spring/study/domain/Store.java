package umc.spring.study.domain;

import umc.spring.study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

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

    // nn
    private String address;

    // Column(precision =10, scale = 8)
    private BigDecimal latitude;

    // 외래키 ? 다른데랑 연결
    private BigInteger categoryId;

    // 외래키? 다른데랑 연결
    private BigInteger locationId;
}
