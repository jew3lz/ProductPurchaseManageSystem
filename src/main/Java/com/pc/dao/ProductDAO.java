package com.pc.dao;

import com.pc.domain.dataobject.ProductDO;

import java.util.List;

/**
 * Created by 吴振武 on 29/2/2016.
 */
public interface ProductDAO {

    List<ProductDO> queryProduct();

    void deleteProduct(String id);

    void insertProduct(ProductDO productDO);

    void updateProduct(ProductDO productDO);

}
