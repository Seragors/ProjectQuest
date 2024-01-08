package servlet;

import service.CapitanService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/capitan")
public class CapitanServlet extends HttpServlet {

    private CapitanService capitanService = new CapitanService();
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String answer = capitanService.call(request.getParameter("choice"));

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(answer).forward(request, response);
    }
}