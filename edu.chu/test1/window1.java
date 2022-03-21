package test1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//案例需求，张三去两个柜台办事，先1柜台，拿1柜台的章，再2柜台，检查1章，结束。
@WebServlet("/win1")
public class window1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("张三已到柜台1");
        req.setAttribute("key","柜台1章");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/win2");
        requestDispatcher.forward(req,resp);
    }
}
