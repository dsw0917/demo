package com.example.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.entity.Classes;
import com.example.service.IClassesService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ellen
 * @version 1.0
 * @date 2018/10/25
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    IClassesService classesService;

    /**
     * 添加班级
     * @param className
     * @return
     */
    @RequestMapping("/add")
    public Classes add(String className){
        Classes classes = new Classes();
        classes.setClassName(className);
        classesService.insert(classes);

        return classes;
    }

    /**
     * 班级列表
     * @return
     */
    @RequestMapping("/list")
    public List<Classes> list(){
        Page<Classes> page = PageHelper.startPage(1, 2);
        List<Classes> classes = classesService.selectList(new EntityWrapper<Classes>());

        return classes;
    }

}
