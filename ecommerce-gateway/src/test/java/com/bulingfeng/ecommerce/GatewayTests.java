package com.bulingfeng.ecommerce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class GatewayTests {

    private List<String> list= Arrays.asList("zhangsan",
            "wangwu","lisi");
    @Test
    public void load(){

    }

    @Test
    public void testPredicateEqual(){
        Predicate<Object> predicate = Predicate.isEqual("zhangsan");
        list.stream().filter(name->{
            return predicate.test(name);
        }).forEach(System.out::println);
    }
}
