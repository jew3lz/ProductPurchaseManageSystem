package com.pc.contants;

/**
 * Created by 吴振武 on 7/3/2016.
 */
public enum OrderStatusEnum {

    o_deleted(0, "已删除"),
    o_created(1, "已创建"),
    o_verification(2, "审核中"),
    o_permitted(3, "审核通过"),
    o_purchased(4, "已采购"),
    o_assigned(5, "已分配");


    private int code;

    private String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public OrderStatusEnum setCode(int code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public OrderStatusEnum setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
