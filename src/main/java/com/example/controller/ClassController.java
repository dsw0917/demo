package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.entity.Classes;
import com.example.page.PageInfo;
import com.example.service.IClassesService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 班级Controller
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
    private PageInfo list(){
        Page<Classes> page = PageHelper.startPage(1, 2);

        System.out.println(page.toString());

        //page = (Page<Classes>) classesService.selectList(new EntityWrapper<Classes>());
        page = (Page<Classes>) classesService.list();
        //Page<Classes> classes = (Page<Classes>) classesService.selectList(new EntityWrapper<Classes>());
        PageInfo<Classes> pageInfo = new PageInfo<>(page);
        return pageInfo;
    }
}
