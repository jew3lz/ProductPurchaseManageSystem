package com.pc.query;

import com.pc.domain.dataobject.ProductDO;

import java.util.List;

/**
 * Created by 吴振武 on 1/3/2016.
 */
public class ProductQuery {

    private String id;

    private String orderId;

    private String name;

    private List<ProductDO> queryResult;

    public String getId() {
        return id;
    }

    public ProductQuery setId(String id) {
        this.id = id;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public ProductQuery setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductQuery setName(String name) {
        this.name = name;
        return this;
    }

    public List<ProductDO> getQueryResult() {
        return queryResult;
    }

    public ProductQuery setQueryResult(List<ProductDO> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
}
