package com.my.recall.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    /**
     * 主键id
     */
    private Integer sId;

    /**
     * 学生名称
     */
    private String sName;

    /**
     * 学生性别
     */
    private String sSex;

    /**
     * 学生年龄
     */
    private Integer sAge;

}