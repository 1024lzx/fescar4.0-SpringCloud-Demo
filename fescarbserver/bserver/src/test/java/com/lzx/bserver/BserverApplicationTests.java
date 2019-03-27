package com.lzx.bserver;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BserverApplicationTests {
    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void contextLoads() {
        System.out.println(encryptor.encrypt("root"));
        System.out.println(encryptor.encrypt("1994"));
    }

}
