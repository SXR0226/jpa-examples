package com.example.jpaexamples.examples01.test;

import com.example.jpaexamples.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAddressTest {
    @Autowired
    private UserRepository ur;
    @Test
    public void test(){
        ur.addUserAddress();
    }

}
