package com.example.service.impl;

import com.example.entity.Classes;
import com.example.mapper.ClassesMapper;
import com.example.service.IClassesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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

}
