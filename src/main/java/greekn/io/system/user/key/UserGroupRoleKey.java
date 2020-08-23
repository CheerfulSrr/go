package greekn.io.system.user.key;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.util.Objects;

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
@Data
public class UserGroupRoleKey implements Serializable {

    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer roleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserGroupRoleKey that = (UserGroupRoleKey) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, groupId, roleId);
    }
}
