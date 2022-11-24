package com.jnu.controller;

import com.jnu.model.IPersonalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//声明当前类是一个控制器
@Controller
//@RequestMapping("/login")
public class PersonalController
{
    //自动装配JavaBean
    @Autowired
    private IPersonalModel model = null;

    @RequestMapping("/doPersonal")
    public void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;utf8");
        response.setCharacterEncoding("utf8");

        //接收用户名和密码
        String now_userName = request.getParameter("now_userName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String sno = request.getParameter("sno");
        String gender = request.getParameter("gender");
        String per_class = request.getParameter("class");
        String IDnumber = request.getParameter("IDnumber");
        String age = request.getParameter("age");
        String addr = request.getParameter("addr");
        String mor_up = request.getParameter("mor_up");
        String eve_sleep = request.getParameter("eve_sleep");
        String bestfood = request.getParameter("bestfood");
        String fav_place = request.getParameter("fav_place");
        String fav_idol = request.getParameter("fav_idol");
        String fav_book = request.getParameter("fav_book");
        String hobby = request.getParameter("hobby");
        System.out.println(now_userName);
        System.out.println("-----------------");
        boolean loginState = model.update(now_userName, userName, password, name, sno, gender, per_class, IDnumber, age, addr, mor_up, eve_sleep, bestfood, fav_place, fav_idol, fav_book, hobby);

//        request.setAttribute("loginState", message);
        System.out.println(userName);
        System.out.println(loginState);
//        System.out.println(message);

        //获取虚拟目录
        String contextPath = request.getContextPath();

        //自行添加的登陆错误提示信息
        PrintWriter writer = response.getWriter();

        String message = "修改成功！";
        if (loginState) {
//            return "index.jsp";
//            response.sendRedirect(contextPath + "/jsp/personal.jsp");
            writer.println("<script>alert('" + message + "')</script>");
//        }else {
//            writer.println("<script>alert('" + message + "');location.href='" + contextPath + "/jsp/login.jsp'</script>");
////            response.sendRedirect(contextPath + "/jsp/login.jsp");
////            return "/jsp/login.jsp";
//        }
        }else {
            message = "修改失败！";
            writer.println("<script>alert('" + message + "')</script>");
        }
    }
}
