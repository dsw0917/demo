package com.example.service.impl;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import com.example.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
