package io.greekn.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.greekn.base.ResponseFactory.*;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-11 14:05
 * @package io.greekn.book
 * @modified Greekn
 * @description
 */
@RestController
@RequestMapping("/book")
public class BookInfoController {
    @PostMapping("/create")
    public ResponseEntity createBookInfo(@RequestBody BookInfoDto dto) {
        return ok();
    }
}
