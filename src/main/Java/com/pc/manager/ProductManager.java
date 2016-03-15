package com.pc.manager;

import com.pc.domain.dataobject.ProductDO;
import com.pc.query.ProductQuery;

import java.util.List;

/**
 * Created by 吴振武 on 1/3/2016.
 */
public interface ProductManager {

    List<ProductDO> queryProduct(ProductQuery query);

}
