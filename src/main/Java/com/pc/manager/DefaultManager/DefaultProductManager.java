package com.pc.manager.DefaultManager;

import com.pc.dao.ProductDAO;
import com.pc.domain.dataobject.ProductDO;
import com.pc.manager.ProductManager;
import com.pc.query.ProductQuery;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 吴振武 on 1/3/2016.
 */
public class DefaultProductManager implements ProductManager{

    @Resource
    private ProductDAO productDAO;

    public List<ProductDO> queryProduct(ProductQuery query) {

        List<ProductDO> productDOList = productDAO.queryProduct();

        return productDOList;
    }
}
