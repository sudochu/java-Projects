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
        System.out.println("�����ѵ���̨2");
        if(req.getAttribute("key").equals("��̨1��"))
            System.out.println("���̽�����");
        else System.out.println("ȱ1�£�������Ч��");
    }
}
