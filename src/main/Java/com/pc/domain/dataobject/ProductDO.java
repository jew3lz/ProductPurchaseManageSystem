package com.pc.domain.dataobject;

/**
 * Created by 吴振武 on 29/2/2016.
 */
public class ProductDO {

    private String id;

    private Double price;

    private String usage;

    private String orderId;

    private String name;

    private Long count;

    public String getId() {
        return id;
    }

    public ProductDO setId(String id) {
        this.id = id;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ProductDO setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getUsage() {
        return usage;
    }

    public ProductDO setUsage(String usage) {
        this.usage = usage;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public ProductDO setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDO setName(String name) {
        this.name = name;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public ProductDO setCount(Long count) {
        this.count = count;
        return this;
    }
}
