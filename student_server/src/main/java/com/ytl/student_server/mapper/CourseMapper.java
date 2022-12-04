package com.ytl.student_server.mapper;

import com.ytl.student_server.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: yyy
 * @Date: 2022.11
 * @Description: CourseMapper
 */

@Repository
@Mapper
public interface CourseMapper {
//    select
    public List<Course> findBySearch(@Param("cid") Integer cid,
                                     @Param("cname") String cname, @Param("fuzzy") Integer fuzzy,
                                     @Param("lowBound") Integer lowBound, @Param("highBound") Integer highBound);

//    insert
    public boolean insertCourse(@Param("course") Course course);

//    update
    public boolean updateById(@Param("course") Course course);

//    delete
    public boolean deleteById(@Param("cid") Integer cid);
}
