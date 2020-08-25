package greekn.io.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-18 15:18
 * @package: greekn.io.common
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class JsonUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 对象转字符串
     *
     * @param data
     * @return
     */
    public static String objectToStr(Object data) {
        try {
            return MAPPER.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException();
        }
    }

}
