package com.example.service;

import com.example.entity.Classes;
import com.baomidou.mybatisplus.service.IService;
import com.github.pagehelper.Page;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ellen
 * @since 2018-10-25
 */
public interface IClassesService extends IService<Classes> {
    public Page<Classes> list();
}
