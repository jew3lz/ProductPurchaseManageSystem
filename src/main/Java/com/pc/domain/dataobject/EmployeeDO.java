package com.pc.domain.dataobject;

/**
 * Created by 吴振武 on 14/3/2016.
 */
public class EmployeeDO {

    String id;

    String name;

    Integer deptId;

    public String getId() {
        return id;
    }

    public EmployeeDO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeDO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public EmployeeDO setDeptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }
}
