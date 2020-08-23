package greekn.io.system.user.key;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

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
@Data
public class RolePermissionsKey implements Serializable {

    private Integer id;

    private Integer roleId;

    private Integer permissionsId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolePermissionsKey that = (RolePermissionsKey) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(permissionsId, that.permissionsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, permissionsId);
    }
}
