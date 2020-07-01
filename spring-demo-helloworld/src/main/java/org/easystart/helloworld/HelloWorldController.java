package org.easystart.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiranlw
 */
@RestController
public class HelloWorldController {

    /**
     * 向浏览器返回 Hello World! 字符串
     * @return
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
