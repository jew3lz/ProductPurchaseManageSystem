package com.pc.domain.dataobject;

/**
 * Created by 吴振武 on 14/3/2016.
 */
public class EmployeeDO {

    String s_Id;

    String s_Name;

    Integer s_dept_Id;

    public String getS_Id() {
        return s_Id;
    }

    public EmployeeDO setS_Id(String s_Id) {
        this.s_Id = s_Id;
        return this;
    }

    public String getS_Name() {
        return s_Name;
    }

    public EmployeeDO setS_Name(String s_Name) {
        this.s_Name = s_Name;
        return this;
    }

    public Integer getS_dept_Id() {
        return s_dept_Id;
    }

    public EmployeeDO setS_dept_Id(Integer s_dept_Id) {
        this.s_dept_Id = s_dept_Id;
        return this;
    }
}
