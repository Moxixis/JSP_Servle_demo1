package com.jnu.controller;

import com.jnu.model.ILoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//声明当前类是一个控制器
@Controller
//@RequestMapping("/login")
public class LoginController
{
    //自动装配JavaBean
    @Autowired
    private ILoginModel model = null;

    @RequestMapping("/doLogin")
    public void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;utf8");
        response.setCharacterEncoding("utf8");

        //接收用户名和密码
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        boolean loginState = model.login(userName, password);
        System.out.println("用户名：" + userName + "密码：" + password);
        String message = loginState ? "登陆成功！" : "登陆失败！请重新输入";

        request.setAttribute("loginState", message);
        System.out.println(loginState);
        System.out.println(message);

        //获取虚拟目录
        String contextPath = request.getContextPath();

        //自行添加的登陆错误提示信息
        PrintWriter writer = response.getWriter();

        if (loginState) {
//            return "index.jsp";
            request.setAttribute("now_userName", userName);
            request.getRequestDispatcher("/jsp/personal.jsp").forward(request, response);
//            response.sendRedirect(contextPath + "/jsp/personal.jsp");
        }else {
            writer.println("<script>alert('" + message + "');location.href='" + contextPath + "/jsp/login.jsp'</script>");
//            response.sendRedirect(contextPath + "/jsp/login.jsp");
//            return "/jsp/login.jsp";
        }
    }
}
