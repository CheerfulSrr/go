package greekn.io;

import greekn.io.common.JsonUtils;
import greekn.io.system.user.vo.LoginRequest;
import org.junit.Test;
import org.springframework.http.MediaType;

import javax.servlet.http.Cookie;

import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-18 14:59
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestSecurity extends TestApplicationBase {

    @Test
    public void test1() throws Exception {
        String result = mvc.perform(get("/api/sys/test").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void testLogin() throws Exception {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setName("test1");
        loginRequest.setPassword("test1");
        mvc.perform(post("/api/sys/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JsonUtils.objectToStr(loginRequest))
        ).andExpect(status().isOk())
                .andDo(print());
    }

}
