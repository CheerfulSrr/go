package greekn.io.system.user.key;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * <p>
 * union key
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-13 21:09
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Embeddable
@Data
public class UserGroupRoleKey implements Serializable {

    private Integer userId;

    private Integer groupId;

    private Integer roleId;

}
