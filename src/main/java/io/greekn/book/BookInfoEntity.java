package io.greekn.book;

import io.greekn.base.BaseEntity;
import io.greekn.schedule.BookScheduleEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-08 0:23
 * @package io.greekn.kind
 * @modified Greekn
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "book_info")
public class BookInfoEntity extends BaseEntity {
    /**
     * 书名
     */
    private String bookName;
    /**
     * 书类
     */
    private String tags;
    /**
     * 类型
     * 0: 实体书
     * 1: 电子书
     * 2: 博客
     * 3: 文档
     */
    private Integer kind;
    /**
     * 如果是电子书、博客、文档等网络资源, 这个字段为网络资源的地址
     */
    private String url;
    /**
     * 章节
     */
    private Integer chapter;
    /**
     * 是否完成
     * 0: 未完成
     * 1: 已完成. 当阅读计划全部完成时
     */
    private Integer status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookInfo")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Set<BookScheduleEntity> bookChapterInfo = new HashSet<>();
}
