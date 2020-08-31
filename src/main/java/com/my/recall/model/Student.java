package com.my.recall.model;

import javax.persistence.*;

public class Student {
    /**
     * 主键id
     */
    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sId;

    /**
     * 学生名称
     */
    @Column(name = "s_name")
    private String sName;

    /**
     * 学生性别
     */
    @Column(name = "s_sex")
    private String sSex;

    /**
     * 学生年龄
     */
    @Column(name = "s_age")
    private Integer sAge;

    /**
     * 获取主键id
     *
     * @return s_id - 主键id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * 设置主键id
     *
     * @param sId 主键id
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * 获取学生名称
     *
     * @return s_name - 学生名称
     */
    public String getsName() {
        return sName;
    }

    /**
     * 设置学生名称
     *
     * @param sName 学生名称
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * 获取学生性别
     *
     * @return s_sex - 学生性别
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * 设置学生性别
     *
     * @param sSex 学生性别
     */
    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    /**
     * 获取学生年龄
     *
     * @return s_age - 学生年龄
     */
    public Integer getsAge() {
        return sAge;
    }

    /**
     * 设置学生年龄
     *
     * @param sAge 学生年龄
     */
    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }
}