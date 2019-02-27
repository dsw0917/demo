package com.example.mapper;

import com.example.entity.Classes;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ellen
 * @since 2018-10-25
 */
public interface ClassesMapper extends BaseMapper<Classes> {
    List<Classes> getPageList();
}
