package greekn.io.system.user.key;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-15 18:56
 * @package: greekn.io.system.user.key
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Embeddable
@Data
public class RolePermissionsKey implements Serializable {

    private Integer roleId;

    private Integer permissionsId;

}
