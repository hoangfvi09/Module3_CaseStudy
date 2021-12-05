package controller;

import model.User;
import service.implement.UserService;
import service.serviceInterface.IUserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserService();
    private RequestDispatcher requestDispatcher = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                default:
                    showAllUser(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create_user.jsp");
        dispatcher.forward(request, response);
    }

    private void showAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<User> userList = userService.findAll();
        request.setAttribute("userList", userList);
        requestDispatcher = request.getRequestDispatcher("user/list_user.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertUser(request, response);
                    break;
            }
        } catch (SQLException e) {
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User newUser = new User(name, email, password);
        userService.save(newUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create_user.jsp");
        dispatcher.forward(request, response);
    }
}
