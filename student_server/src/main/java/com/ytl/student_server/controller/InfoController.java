package com.ytl.student_server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yyy
 * @Date: 2022.11
 * @Description: InfoController
 */

@RestController
@RequestMapping("/info")
@CrossOrigin("*")
public class InfoController {
    private final String CURRENT_TERM = "欢迎您！";
    private final boolean FORBID_COURSE_SELECTION = false;

    @RequestMapping("/getCurrentTerm")
    public String getCurrentTerm() {
        return CURRENT_TERM;
    }

    @RequestMapping("/getForbidCourseSelection")
    public boolean getForbidCourseSelection() {
        return FORBID_COURSE_SELECTION;
    }
}
