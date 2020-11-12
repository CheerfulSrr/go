package io.greekn.kind;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-08 15:47
 * @package io.greekn.kind
 * @modified Greekn
 * @description
 */
@Repository
public interface KindInfoRepository extends JpaRepository<KindInfoEntity, Integer> {
    KindInfoEntity findByKindNameAndKind(String kindName, Integer kind);
}
