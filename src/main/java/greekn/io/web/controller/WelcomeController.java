package greekn.io.web.controller;

import greekn.io.web.entity.TestEntity;
import greekn.io.web.repository.TestRepository;
import greekn.io.web.vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-07-26 13:35
 * @package: greekn.io.welcome
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Controller
public class WelcomeController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/i")
    public String index() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("t");
        testRepository.save(testEntity);
        return "index";
    }

    @PostMapping("/t1")
    public void t1(Test o) {
        System.out.println(o);
    }

}
