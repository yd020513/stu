package com.ytl.student_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @Auther: yyy
 * @Date: 2022.11
 * @Description: Course
 */

@Data   //注在类上，提供类的get、set、equals、hashCode、toString等方法
@AllArgsConstructor //注在类上，提供类的全参构造
@NoArgsConstructor  //注在类上，提供类的无参构造
@Alias("Course")
public class Course {
    private Integer cid;
    private String cname;
    private Integer ccredit;
}
