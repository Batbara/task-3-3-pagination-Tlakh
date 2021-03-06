package by.tr.web.controller;

import by.tr.web.controller.command.Command;
import by.tr.web.controller.util.ControllerParameter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {
    private CommandProvider commandProvider = new CommandProvider();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(ControllerParameter.TEXT_HTML_CONTENT_TYPE);
        String commandName = request.getParameter(ControllerParameter.COMMAND);

        Command command = commandProvider.getCommand(commandName);
        command.execute(request, response);
    }


}
