package com.john;

import com.john.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootApplicationTests {
    @Autowired
    Person person;

    @Test
    public void contextLoads(){
        System.out.println(person);
    };
}
