package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.Consultant;
import com.mian.repository.AccountRepository;
import com.mian.repository.ConsultantRepository;
import com.mian.request.ConsultationRequest;
import com.mian.response.ConsultationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by victor on 11/11/2016.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/consultant")
public class ConsultationController {
    @Autowired
    private ConsultantRepository consultantRepository;
    @Autowired
    private AccountRepository accountRepository;
    @RequestMapping(value = "/information",method = RequestMethod.POST)
    public @ResponseBody
    String information(@RequestBody Consultant consultant){
        String success= "";

        return success;
    }

    @RequestMapping(value = "/getRequirments",method = RequestMethod.GET)
    public @ResponseBody
    ConsultationResponse getRequirments(@RequestParam("")String value){
        ConsultationResponse success= null;

        return success;
    }

    @RequestMapping(value = "/refineReuirments",method = RequestMethod.POST)
    public @ResponseBody
    ConsultationResponse refineReuirments(@RequestBody ConsultationRequest consultationRequest){
        ConsultationResponse success = null;
        return success;
    }

    @RequestMapping(value = "/becomeConsultant",method = RequestMethod.POST)
    public @ResponseBody
    boolean becomeConsultant(@RequestBody Consultant consultant) {
        String accountUuid = consultant.getAccountUuid();
        Account account = accountRepository.findByAccountUuid(accountUuid);
        Consultant save = consultantRepository.save(consultant);
        if (save != null) {
            account.setAccountUuid(accountUuid);
            accountRepository.save(account);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/findAllConsultant",method = RequestMethod.POST)
    public @ResponseBody
    Page<Consultant> findAllConsultant(@RequestParam("pageNow") int pageNow, @RequestParam("pageSize") int pageSize) {
        Pageable pageable = new PageRequest(pageNow - 1,pageSize);
        Page<Consultant> pages = consultantRepository.findAll(pageable);
        return pages;
    }

}
