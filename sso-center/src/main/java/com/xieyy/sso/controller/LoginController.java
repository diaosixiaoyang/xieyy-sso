package com.xieyy.sso.controller;

import com.xieyy.sso.vo.LoginVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyyt
 * @date 2019/12/19 17:38
 */
@RestController
@Slf4j
public class LoginController {

    @PostMapping("/login")
    public String login(LoginVO loginVo) {
        log.info("进入登录接口,用户信息为：{}", loginVo.toString());
        return "success";
    }

}
