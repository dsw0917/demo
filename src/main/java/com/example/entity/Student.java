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
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;
    @TableField("student_name")
    private String studentName;
    @TableField("class_id")
    private Integer classId;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
        "studentId=" + studentId +
        ", studentName=" + studentName +
        ", classId=" + classId +
        "}";
    }
}
