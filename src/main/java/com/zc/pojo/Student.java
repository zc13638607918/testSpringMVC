package com.zc.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 周超
 * @Date 2020/3/26 20:39
 * @Version 1.0
 **/
@Component
@Data
public class Student {
    int id;
    String name;
    int age;
}
