package com.ylm.controller;

import com.ylm.pojo.DcSysOperateLog;
import com.ylm.service.DcSysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LogController {

    @Autowired
    private DcSysLogService dcSysLogService;

    @RequestMapping("/getLogs")
    @ResponseBody
    public List<DcSysOperateLog> getLogs(){
        List<DcSysOperateLog> result = new ArrayList<DcSysOperateLog>();
        try {
            result = dcSysLogService.selectByExample(null);
        }catch (Throwable t){
            t.printStackTrace();
        }
        return result;
    }
}
