package com.pc.controller;

import com.pc.dao.ProductDAO;
import com.pc.domain.dataobject.ProductDO;
import com.pc.manager.ProductManager;
import com.pc.query.ProductQuery;
import com.pc.result.MsgResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *
 * Created by 吴振武 on 1/3/2016.
 */
@Controller
@RequestMapping("/proPur/product")
public class ProductController {

    @Autowired
    private ProductManager productManager;

    @Autowired
    private ProductDAO productDAO;


    @RequestMapping("/list")
    public ResponseEntity<Object> listProduct(@RequestParam(required = false, value = "id") String id, @RequestParam(required = false, value = "orderId") String orderId, @RequestParam(required = false, value = "name") String name) {

        MsgResult<List<ProductDO>> msgResult = new MsgResult<List<ProductDO>>();

        ProductQuery query = new ProductQuery();
        query.setId(id);
        query.setName(name);
        query.setOrderId(orderId);

        List<ProductDO> productDOList = productManager.queryProduct(query);
        msgResult.setValue(productDOList);

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/delete")
    public ResponseEntity<Object> deleteProduct(@RequestParam(required = false, value = "id") String id) {

        productDAO.deleteProduct(id);

        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("删除成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/insert")
    public ResponseEntity<Object> insertProduct(@RequestParam(required = false, value = "id") String id, @RequestParam(required = false, value = "price") Double price, @RequestParam(required = false, value = "usage") String usage, @RequestParam(required = false, value = "orderId") String orderId, @RequestParam(required = false, value = "name") String name, @RequestParam(required = false, value = "count") Long count) {

        ProductDO productDO = new ProductDO();

        productDO.setId(id);
        productDO.setPrice(price);
        productDO.setUsage(usage);
        productDO.setOrderId(orderId);
        productDO.setName(name);
        productDO.setCount(count);

        productDAO.insertProduct(productDO);
        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("新增成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/update")
    public ResponseEntity<Object> updateProduct(@RequestParam(required = false, value = "id") String id, @RequestParam(required = false, value = "price") Double price, @RequestParam(required = false, value = "usage") String usage, @RequestParam(required = false, value = "orderId") String orderId, @RequestParam(required = false, value = "name") String name, @RequestParam(required = false, value = "count") Long count) {

        ProductDO productDO = new ProductDO();

        productDO.setId(id);
        productDO.setPrice(price);
        productDO.setUsage(usage);
        productDO.setOrderId(orderId);
        productDO.setName(name);
        productDO.setCount(count);

        productDAO.updateProduct(productDO);
        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("更新成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }
}
