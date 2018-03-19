package com.ylm.common;

import com.auth0.jwt.internal.org.bouncycastle.asn1.ocsp.ResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ylm.pojo.DcAdministrators;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        DcAdministrators admin = (DcAdministrators)session.getAttribute("user");
        if (admin!=null){
            return true;
        }else {
            httpServletResponse.setCharacterEncoding("UTF-8");
            BaseResult result = new BaseResult(true,"未登录",BaseResult.NOLOGIN);
            ObjectMapper mapper = new ObjectMapper();
            String str = mapper.writeValueAsString(result);
            httpServletResponse.setCharacterEncoding("UTF-8"); //设置编码格式
            httpServletResponse.setContentType("text/html");   //设置数据格式
            PrintWriter out = httpServletResponse.getWriter(); //获取写入对象
            out.print(str); //将json数据写入流中
            out.flush();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
