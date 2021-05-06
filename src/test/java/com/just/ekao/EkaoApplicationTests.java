package com.just.ekao;

import com.just.ekao.sys.login.dao.TUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EkaoApplicationTests {
@Autowired
    private TUserMapper dao;
    @Test
    void contextLoads() {
        System.out.println(dao.findByUserNameAndPwd("weizan.kong","eKao123"));

    }

}
