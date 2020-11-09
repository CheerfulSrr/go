package io.greekn.base;

import io.greekn.base.exception.GoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-09 12:57
 * @package io.greekn.base
 * @modified Greekn
 * @description
 */
public class ResponseFactory {
    public static ResponseEntity.BodyBuilder builder() {
        return ResponseEntity.status(HttpStatus.OK);
    }

    public static ResponseEntity.BodyBuilder builder(HttpStatus httpStatus) {
        return ResponseEntity.status(httpStatus);
    }

    public static <T> ResponseEntity<T> ok() {
        return builder().build();
    }

    public static <T> ResponseEntity<T> ok(T data) {
        return builder().body(data);
    }

    public static ResponseEntity<String> error(GoException e) {
        return builder(HttpStatus.BAD_REQUEST).body(e.getLocalizedMessage());
    }

}
