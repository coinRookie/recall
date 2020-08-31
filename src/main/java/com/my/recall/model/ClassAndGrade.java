package com.my.recall.model;

import javax.persistence.*;

@Table(name = "class_and_grade")
public class
ClassAndGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private String pclass;

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return pclass
     */
    public String getPclass() {
        return pclass;
    }

    /**
     * @param pclass
     */
    public void setPclass(String pclass) {
        this.pclass = pclass;
    }
}