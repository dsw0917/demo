package com.example.service.impl;

import com.example.entity.Classes;
import com.example.mapper.ClassesMapper;
import com.example.service.IClassesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ellen
 * @since 2018-10-25
 */
@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements IClassesService {
    @Autowired
    ClassesMapper classesMapper;

    @Override
    public Page<Classes> list() {
       Page<Classes> page = (Page<Classes>) classesMapper.getPageList();
       return page;
    }
}
