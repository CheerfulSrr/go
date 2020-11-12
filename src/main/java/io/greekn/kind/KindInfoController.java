package io.greekn.kind;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class KindInfoController {

    @Autowired
    private KindInfoRepository kindInfoRepository;

    @GetMapping("/save")
    public ResponseEntity createKind(KindInfoDto kindInfoDto) {
        KindInfoEntity kindEntity = new KindInfoEntity();
        BeanUtils.copyProperties(kindInfoDto, kindEntity);
        KindInfoEntity infoEntity = kindInfoRepository.findByKindNameAndKind(kindEntity.getKindName(), kindEntity.getKind());
        if (infoEntity != null) {
            kindInfoRepository.save(kindEntity);
        }
        return ok();
    }

    @GetMapping("/list")
    public ResponseEntity<List<KindInfoVo>> list() {
        return ok(sourceToTarget(kindInfoRepository.findAll(), KindInfoVo.class));
    }

}