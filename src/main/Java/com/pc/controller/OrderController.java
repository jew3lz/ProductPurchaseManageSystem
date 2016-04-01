package com.pc.controller;

import com.pc.dao.OrderDAO;
import com.pc.domain.dataobject.EmployeeDO;
import com.pc.domain.dataobject.OrderCountDO;
import com.pc.domain.dataobject.OrderDO;
import com.pc.query.OrderQuery;
import com.pc.result.MsgResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by 吴振武 on 1/3/2016.
 */
@Controller
@RequestMapping("/proPur/order")
public class OrderController {

    @Autowired
    private OrderDAO orderDAO;

    static final Long ONE_DAY = 24 * 60 * 60 * 1000L;

    @RequestMapping("/query30days")
    public ResponseEntity<Object> query30days(@RequestParam(required = false, value = "end") Long end) {

        OrderQuery query = new OrderQuery();
        query.setEnd(new Date(end));
        query.setStart(new Date(end - 30 * ONE_DAY));

        List<OrderCountDO> resultList = orderDAO.query30DaysOrderCount(query);
        MsgResult<List<OrderCountDO>> result = new MsgResult<List<OrderCountDO>>();
        result.setValue(resultList);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @RequestMapping("/list")
    public ResponseEntity<Object> queryOrderList(@RequestParam(required = false, value = "id") String id, @RequestParam(required = false, value = "staffId") String staffId, @RequestParam(required = false, value = "time") Long time) {
        OrderQuery query = new OrderQuery();

        query.setId(id);
        query.setStaffId(staffId);
        query.setStart(new Date(time));

        List<OrderDO> resList = orderDAO.queryOrder(query);
        MsgResult<List> result = new MsgResult<List>();
        result.setValue(resList);

        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }


    @RequestMapping("/insert")
    public ResponseEntity<Object> insertOrder(@RequestParam(required = false, value = "id") String id,
                                              @RequestParam(required = false, value = "status") Integer status,
                                              @RequestParam(required = false, value = "proList") String proList,
                                              @RequestParam(required = false, value = "staffId") String staffId,
                                              @RequestParam(required = false, value = "modified") Long modified) {

        OrderDO orderDO = new OrderDO();
        orderDO.setId(id);
        orderDO.setStatus(status);
        orderDO.setStaffId(staffId);
        orderDO.setProList(proList);
        orderDO.setModified(new Date(getDayStartTime(modified)));


        //默认订单号为0
        orderDAO.insertOrder(orderDO);
        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("新增成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/delete")
    public ResponseEntity<Object> deleteOrder(@RequestParam(required = false, value = "id") String id) {

        orderDAO.deleteOrder(id);

        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("删除成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/update")
    public ResponseEntity<Object> updateOrder(@RequestParam(required = false, value = "id") String id, @RequestParam(required = false, value = "proList") String proList, @RequestParam(required = false, value = "staffId") String staffId, @RequestParam(required = false, value = "status") Integer status) {
        OrderDO orderDO = new OrderDO();
        orderDO.setId(id);
        orderDO.setStaffId(staffId);
        orderDO.setProList(proList);
        orderDO.setStatus(status);
        orderDO.setModified(new Date(getDayStartTime(System.currentTimeMillis())));

        orderDAO.updateOrder(orderDO);

        MsgResult<String> msgResult = new MsgResult<String>();
        msgResult.setValue("更新成功");

        return new ResponseEntity<Object>(msgResult, HttpStatus.OK);
    }

    @RequestMapping("/listEmployee")
    public ResponseEntity<Object> queryEmployeeList(@RequestParam(required = false, value = "id") String id) {
        OrderQuery query = new OrderQuery();
        query.setStaffId(id);
        List<EmployeeDO> employeeDOs = orderDAO.selectEmployee(query);

        MsgResult<List> result = new MsgResult<List>();
        result.setValue(employeeDOs);

        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    /**
     * 获取一天的开始时间
     *
     * @param time
     * @return
     */
    public static long getDayStartTime(Long time) {
        if (time == null)
            return 0;
        Date now = new Date(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        long start = calendar.getTimeInMillis();

        return start;
    }
}
