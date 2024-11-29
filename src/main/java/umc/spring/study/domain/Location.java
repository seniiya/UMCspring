package umc.spring.study.domain;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;
import umc.spring.study.domain.common.BaseEntity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Location extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // notnull varchar => string 타입
    private String regionName;

    // notnull
    private String districName;
}
