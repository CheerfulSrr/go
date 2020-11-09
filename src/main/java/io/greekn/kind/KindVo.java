package io.greekn.kind;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-09 20:41
 * @package: io.greekn.kind
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Data
public class KindVo implements Serializable {
    private Integer id;
    private String kindName;
    private String aliasName;
}
