package com.xieyy.sso.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xieyyt
 * @date 2019/12/19 17:40
 */
@Data
public class LoginVO implements Serializable {

    private String username;
    private String password;
}
