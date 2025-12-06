package wecode;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = "/hello")
public class HelloServlet<jsp> extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        out.println(request.getParameter("tarefa"));
        out.println(request.getParameter("descricao"));
        out.close();
    }
    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        out.println(request.getParameter("tarefa"));
        out.println(request.getParameter("descricao"));
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String tarefa = request.getParameter("tarefa");
        String descricao = request.getParameter("descricao");
      
        out.print("<html><body>");
        out.print("<h1>Tarefa adicionada com sucesso!</h1>");
        out.print("<h2>Detalhes da Tarefa:</h2>");
        out.print("<p>Tarefa: " + tarefa + "</p>");
        out.print("<p>Descrição: " + descricao + "</p>");
        out.println("<a href=\"index.jsp\">Voltar para a página inicial</a>");
        out.print("</body></html>");
        out.println();
       
    }
}
