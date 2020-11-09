package io.greekn.base.exception;

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
public class GoException extends RuntimeException {
    public GoException() {
    }

    public GoException(String message) {
        super(message);
    }

    public GoException(String message, Throwable cause) {
        super(message, cause);
    }

    public GoException(Throwable cause) {
        super(cause);
    }

    public GoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
