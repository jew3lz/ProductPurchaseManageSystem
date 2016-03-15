package com.pc.query;

import java.util.Date;

/**
 * Created by 吴振武 on 4/3/2016.
 */
public class OrderQuery {

    private String id;

    private String staffId;

    private Date start;

    private Date end;

    public String getId() {
        return id;
    }

    public OrderQuery setId(String id) {
        this.id = id;
        return this;
    }

    public String getStaffId() {
        return staffId;
    }

    public OrderQuery setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }

    public Date getStart() {
        return start;
    }

    public OrderQuery setStart(Date start) {
        this.start = start;
        return this;
    }

    public Date getEnd() {
        return end;
    }

    public OrderQuery setEnd(Date end) {
        this.end = end;
        return this;
    }
}
