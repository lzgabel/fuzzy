package cn.lzgabel.fuzzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能简述〉<br>
 * 〈HelloWrold〉
 *
 * @author lizhi
 * @date 2020-01-13
 * @since 1.0.0
 */

@RestController
@RequestMapping("/hello")
public class HelloWroldController {

    @GetMapping("/world")
    public String message() {
        return "Hello Wrold!";
    }

}
