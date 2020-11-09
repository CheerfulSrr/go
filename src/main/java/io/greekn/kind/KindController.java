package io.greekn.kind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static io.greekn.base.ResponseFactory.*;
import static io.greekn.util.ConvertUtils.*;


/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-08 15:43
 * @package io.greekn.kind
 * @modified Greekn
 * @description
 */
@RestController
@RequestMapping("/kind")
public class KindController {

    @Autowired
    private KindRepository kindRepository;

    @GetMapping("/create")
    public ResponseEntity createKind(@RequestParam("kind") String kind, @RequestParam("aliasName") String aliasName) {
        KindEntity kindEntity = new KindEntity();
        kindEntity.setKindName(kind);
        kindEntity.setAliasName(aliasName);
        KindEntity byKindName = kindRepository.findByKindName(kind);
        if (byKindName == null) {
            kindRepository.save(kindEntity);
        }
        return ok();
    }

    @GetMapping("/list")
    public ResponseEntity<List<KindVo>> list() {
        return ok(sourceToTarget(kindRepository.findAll(), KindVo.class));
    }

}