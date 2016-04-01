package com.pc.domain.dataobject;

import java.util.Date;

/**
 * Created by 吴振武 on 1/4/2016.
 */
public class OrderCountDO {

    private Date date;

    private Integer count;

    public Date getDate() {
        return date;
    }

    public OrderCountDO setDate(Date date) {
        this.date = date;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public OrderCountDO setCount(Integer count) {
        this.count = count;
        return this;
    }
}
