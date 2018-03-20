package com.ylm.common;

import com.ylm.pojo.DcAdministrators;
import com.ylm.pojo.DcSysOperateLog;
import com.ylm.service.DcSysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class LogInterceptor implements HandlerInterceptor {

    @Autowired
    DcSysLogService dcSysLogService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        try {
            String uri = request.getRequestURI();
            if (uri.contains("delete")||uri.contains("Submit")){
                DcSysOperateLog log = new DcSysOperateLog();
                String id = request.getParameter("sessionId");
                DcAdministrators admin = JWT.unsign(id,DcAdministrators.class);
                if (admin!=null){
                    log.setAdminId(admin.getAdminId());
                }else {
                    log.setAdminId(-1);
                }
                //获取系统时间
                String time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());
                log.setOlAddDate(time);
                //获取IP
                String ip = request.getRemoteAddr();
                log.setOlIp(ip);
                //获取参数
                log.setOlContent(request.getQueryString());
                log.setOlModule(request.getRequestURI());
                if (uri.contains("delete")){
                    log.setOlType("删除");
                }else if (uri.contains("Submit")){
                    if (uri.contains("new")){
                        log.setOlType("新增");
                    }else {
                        log.setOlType("修改");
                    }
                }
                dcSysLogService.insert(log);
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
