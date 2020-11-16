package io.greekn.kind;

import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-13 0:32
 * @package: io.greekn.kind
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Data
public class KindInfoDto {
    private String kindName;
    private String tags;
    private Integer kind;
    private String url;
    private Integer chapter;
    private Integer status;
}
