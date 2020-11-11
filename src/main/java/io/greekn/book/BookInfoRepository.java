package io.greekn.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-11 14:03
 * @package io.greekn.book
 * @modified Greekn
 * @description
 */
@Repository
public interface BookInfoRepository extends JpaRepository<BookInfoEntity, Integer> {
}
