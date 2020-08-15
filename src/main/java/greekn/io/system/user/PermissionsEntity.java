package greekn.io.system.user;

import greekn.io.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-15 18:53
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sys_permissions")
public class PermissionsEntity extends BaseEntity {

    private String name;

    private Integer type;

    private String url;

    private String permission;

    private String method;

    private Integer sort;

    private Integer parentId;

}
