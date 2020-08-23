package greekn.io.system.user;

import greekn.io.common.BaseEntity;
import greekn.io.system.user.key.RolePermissionsKey;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-15 18:56
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "sys_role_permissions")
@Entity
@IdClass(RolePermissionsKey.class)
public class RolePermissionsEntity extends BaseEntity {

    private Integer roleId;

    private Integer permissionsId;

}