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
 * @date 2020-08-13 16:59
 * @package: greekn.io.system.group
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sys_group")
public class GroupEntity extends BaseEntity {

    public String name;

    public String description;

}
