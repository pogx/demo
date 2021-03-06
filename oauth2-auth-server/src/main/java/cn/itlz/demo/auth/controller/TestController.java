package cn.itlz.demo.auth.controller;

import cn.itlz.demo.auth.dto.response.SimpleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liuzd QQ: 77822013
 * @since 2018/12/4 0004
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public SimpleResponse test() {
        return new SimpleResponse("SUCCESS");
    }
}
