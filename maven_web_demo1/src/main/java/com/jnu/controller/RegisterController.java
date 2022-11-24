package com.jnu.controller;

import com.jnu.model.IRegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
//类级别请求（/register/自请求）
//@RequestMapping("/register")
public class RegisterController {
    //自动装配JavaBean
    @Autowired
    private IRegisterModel model = null;

    //二级请求
    @RequestMapping(value = "/doRegister")
//    return ModelAndView;
    public void doRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;utf8");
        response.setCharacterEncoding("utf8");

        //接收用户名和密码
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String idpassword = request.getParameter("idpassword");
        boolean registerState = model.register(userName, password, idpassword);
        System.out.println("用户名：" + userName + "密码：" + password + "确认密码" + idpassword);
        String message = registerState ? "注册成功！" : "注册失败！请重新输入";

        request.setAttribute("registerState", message);
        System.out.println(registerState);
        System.out.println(message);

        //获取虚拟目录
        String contextPath = request.getContextPath();

        //自行添加的注册错误提示信息
        PrintWriter writer = response.getWriter();

        if (registerState) {
            //注册成功
//            return "/jsp/regs.jsp";
            response.sendRedirect(contextPath + "/jsp/login.jsp");
        }else {
            //注册失败
            writer.println("<script>alert('" + message + "');location.href='" + contextPath + "/jsp/regs.jsp'</script>");
//            response.sendRedirect(contextPath + "/jsp/login.jsp");
        }
    }
}
