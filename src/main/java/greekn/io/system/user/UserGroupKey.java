package greekn.io.system.user;

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
 * @date 2020-08-13 21:09
 * @package: greekn.io.system.user
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Embeddable
@Data
public class UserGroupKey implements Serializable {

    private Integer userId;

    private Integer groupId;

}
