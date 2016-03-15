package com.pc.domain.dataobject;

import java.util.Date;

/**
 * Created by 吴振武 on 4/3/2016.
 */
public class OrderDO {

    private String id;

    private Date modified;

    private String proList;

    private String staffId;

    private Integer status;


    public Integer getStatus() {
        return status;
    }

    public OrderDO setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getId() {
        return id;
    }

    public OrderDO setId(String id) {
        this.id = id;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public OrderDO setModified(Date modified) {
        this.modified = modified;
        return this;
    }

    public String getProList() {
        return proList;
    }

    public OrderDO setProList(String proList) {
        this.proList = proList;
        return this;
    }

    public String getStaffId() {
        return staffId;
    }

    public OrderDO setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
}
