package io.greekn.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-09 9:01
 * @package io.greekn.base.exception
 * @modified Greekn
 * @description
 */
@RestControllerAdvice
@Slf4j
public class GoExceptionHandler {
    @ExceptionHandler
    public void goExceptionHandler(GoException e, HttpServletResponse response) throws IOException {
        response.sendError(400, e.getLocalizedMessage());
    }
}
