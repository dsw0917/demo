package com.example.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ellen
 * @since 2018-10-25
 */
public class Classes extends Model<Classes> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;
    @TableField("class_name")
    private String className;


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    protected Serializable pkVal() {
        return this.classId;
    }

    @Override
    public String toString() {
        return "Classes{" +
        "classId=" + classId +
        ", className=" + className +
        "}";
    }
}
