package umc.spring.study.domain;


import umc.spring.study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Alarm extends BaseEntity{

    // AI (AutoIncrement)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // nn 알람내용
    private String content;

    // 읽었는지 확인 TINYINT(1)
    private Boolean isRead;

}
