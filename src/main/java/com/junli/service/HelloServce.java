package com.junli.service;

import com.junli.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author lijun
 * @time 2018-01-16 15:26
 */

@RequestMapping("refactor")
public interface HelloServce {


    @GetMapping("/hello4")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);


    @PostMapping("/hello6")
    String hello(@RequestBody User user);
}
