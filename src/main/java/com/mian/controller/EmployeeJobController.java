package com.mian.controller;

import com.mian.bean.EmployeeJob;
import com.mian.bean.EmployerDemand;
import com.mian.repository.EmployeeJobRepository;
import com.mian.repository.EmployerDemandRepository;
import com.mian.request.PostionOrderRequest;
import com.mian.response.PaymentListResponse;
import com.mian.response.PositionOrderResponse;
import javafx.geometry.Pos;
import org.aspectj.weaver.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoxiong on 2016/11/14.
 */
@RestController
@RequestMapping("employee")
public class EmployeeJobController {
    @Autowired
    EmployeeJobRepository employeeJobRepository;

    @Autowired
    EmployerDemandRepository employerDemandRepository;

    @RequestMapping(value = "/postJobPostion",method = RequestMethod.GET)//投递职位
    @ResponseBody
    String postJobPostion(@RequestParam("userUuid")String userUuid,@RequestParam("positionUuid")String positionUuid){
        String success = "fail";
        EmployerDemand employerDemand = employerDemandRepository.findByDemandUuid(positionUuid);
        ArrayList<String> alreadyExist = employerDemand.getEmployeeUuid();

        if(alreadyExist.contains(userUuid)){
            success = "已投递过此职位";
            return success;
        }
        else {
            alreadyExist.add(userUuid);
            employerDemand.setEmployeeUuid(alreadyExist);

            EmployerDemand save = employerDemandRepository.save(employerDemand);


            if (save != null) success = "success";
            return success;
        }
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

    @RequestMapping(value = "/findByEmployeeJobAccountUuid",method = RequestMethod.POST)
    @ResponseBody
    EmployeeJob findByAccountUuid(@RequestParam("accountUUid") String accouontUuid) {
        EmployeeJob employeeJobs = employeeJobRepository.findByAccountUuid(accouontUuid);
        return employeeJobs;
    }
}
