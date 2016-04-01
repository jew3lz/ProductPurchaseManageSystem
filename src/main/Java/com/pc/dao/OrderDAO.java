package com.pc.dao;

import com.pc.domain.dataobject.EmployeeDO;
import com.pc.domain.dataobject.OrderCountDO;
import com.pc.domain.dataobject.OrderDO;
import com.pc.query.OrderQuery;

import java.util.List;

/**
 * Created by 吴振武 on 29/2/2016.
 */
public interface OrderDAO {

    List<OrderDO> queryOrder(OrderQuery query);

    void deleteOrder(String id);

    void insertOrder(OrderDO orderDO);

    void updateOrder(OrderDO orderDO);

    List<EmployeeDO> selectEmployee(OrderQuery query);

    List<OrderCountDO> query30DaysOrderCount(OrderQuery query);

}
