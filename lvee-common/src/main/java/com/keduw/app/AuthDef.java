package com.keduw.app;

/**
 * 接口鉴权
 *
 * @author hongshengfeng
 * @date 2020.02.03
 * @version 1.0.1
 */
public class AuthDef {

    public static final String ACCT = "voAdmin";     //用户名
    public static final String PASSWORD = "123456"; //密码

    public static String initInfo(){
        return ACCT + ":" + PASSWORD;
    }

}