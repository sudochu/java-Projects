package test1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//������������ȥ������̨���£���1��̨����1��̨���£���2��̨�����1�£�������
@WebServlet("/win1")
public class window1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("�����ѵ���̨1");
        req.setAttribute("key","��̨1��");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/win2");
        requestDispatcher.forward(req,resp);
    }
}
