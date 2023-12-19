package servlet;

import service.capitanService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/capitan")
public class capitanServlet extends HttpServlet {

    private capitanService capitanService = new capitanService();
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String answer = capitanService.call(request.getParameter("choice"));
        HttpSession session = request.getSession();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(String.valueOf(answer)).forward(request, response);
    }
}
