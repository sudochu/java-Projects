package test1;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/win2")
public class window2 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("张三已到柜台2");
        if(req.getAttribute("key").equals("柜台1章"))
            System.out.println("流程结束！");
        else System.out.println("缺1章！流程无效！");
    }
}
