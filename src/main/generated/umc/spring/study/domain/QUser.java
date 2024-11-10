package umc.spring.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 610669650L;

    public static final QUser user = new QUser("user");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    public final DatePath<java.time.LocalDate> birth = createDate("birth", java.time.LocalDate.class);

    public final ListPath<umc.spring.study.domain.mapping.Category, umc.spring.study.domain.mapping.QCategory> categories = this.<umc.spring.study.domain.mapping.Category, umc.spring.study.domain.mapping.QCategory>createList("categories", umc.spring.study.domain.mapping.Category.class, umc.spring.study.domain.mapping.QCategory.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<umc.spring.study.domain.enums.Gender> gender = createEnum("gender", umc.spring.study.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> phoneNumber = createNumber("phoneNumber", Integer.class);

    public final StringPath specAddr = createString("specAddr");

    public final NumberPath<Integer> totalPoints = createNumber("totalPoints", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final ListPath<umc.spring.study.domain.mapping.UserMission, umc.spring.study.domain.mapping.QUserMission> userMissions = this.<umc.spring.study.domain.mapping.UserMission, umc.spring.study.domain.mapping.QUserMission>createList("userMissions", umc.spring.study.domain.mapping.UserMission.class, umc.spring.study.domain.mapping.QUserMission.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

