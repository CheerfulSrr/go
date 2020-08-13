package greekn.io.system.user;

import greekn.io.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-13 21:11
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sys_user_group")
public class UserGroupEntity extends BaseEntity {

    @EmbeddedId
    private UserGroupKey userGroupKey;

    @Enumerated
    private Role role;

}
