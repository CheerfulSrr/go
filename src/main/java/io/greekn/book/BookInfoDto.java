package io.greekn.book;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-11 14:04
 * @package io.greekn.book
 * @modified Greekn
 * @description
 */
@Data
public class BookInfoDto implements Serializable {
    private String bookName;
    private String tags;
    private Integer kind;
    private String url;
    private Integer chapter;
}
