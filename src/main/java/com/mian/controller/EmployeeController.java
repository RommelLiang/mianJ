package com.mian.controller;

import com.mian.request.PostionOrderRequest;
import com.mian.response.PaymentListResponse;
import com.mian.response.PositionOrderResponse;
import javafx.geometry.Pos;
import org.aspectj.weaver.Position;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaoxiong on 2016/11/14.
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    @RequestMapping(value = "/postJobPostion",method = RequestMethod.GET)//投递职位
    @ResponseBody
    String postJobPostion(@RequestParam("uuid")String uuid){
        String success = "";
        return success;
    }

    @RequestMapping(value = "/postionOrderList",method = RequestMethod.POST)//投递职位订单列表
    @ResponseBody
    PositionOrderResponse postionOrderList(@RequestParam("uuid")String uuid){
        PositionOrderResponse positionOrderResponse = new PositionOrderResponse();
        return positionOrderResponse;
    }

    @RequestMapping(value = "/refinePositionOrder",method = RequestMethod.POST)//查看通知，处理预约（接受或者拒绝求职顾问的的邀请），订单号
    @ResponseBody
    PositionOrderResponse refinePositionOrder(@RequestBody PostionOrderRequest postionOrderRequest){
        PositionOrderResponse positionOrderResponse = new PositionOrderResponse();
        return positionOrderResponse;
    }

    @RequestMapping(value = "/checkPaymentList",method = RequestMethod.POST)//获取收入列表
    @ResponseBody
    PaymentListResponse getPaymentlist(@RequestParam("uuid")String uuid){
        PaymentListResponse paymentListResponse = new PaymentListResponse();
        return paymentListResponse;
    }

    @RequestMapping(value = "/getherPayment",method = RequestMethod.GET)
    @ResponseBody
    String getherPayment(@RequestParam("uuid")String uuid){
        String success = null;
        //TODO alipay and wechat pay
        return success;
    }

    @RequestMapping(value = "/confirmation",method = RequestMethod.GET)//确认订单
    @ResponseBody
    String confirmation(@RequestParam("uuid")String uuid){
        String success = "";
        //todo repository
        return success;
    }

    @RequestMapping(value = "/ratingConsultant",method = RequestMethod.POST)
    @ResponseBody
    String ratingConsultant(@RequestParam("employeeUuid")String employeeUuid,@RequestParam("Uuid")String Uuid){
        String success = "";
        return success;
    }
}
