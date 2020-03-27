package com.zc.mapper;

import com.zc.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author 周超
 * @Date 2020/3/27 11:55
 * @Version 1.0
 **/
@Repository
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student selByID(int id);

    @Insert("insert into student values(default,#{name},#{age})")
    int insertOne(Student student);
}
