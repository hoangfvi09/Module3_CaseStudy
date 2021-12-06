package controller;

import model.Product;
import service.implement.ProductService;
import service.serviceInterface.IProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            case "list":
                try {
                    showList(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "list-price-asc":
                showListPriceAsc(request,response);
                break;
            case "list-price-desc":
                showListPriceDesc(request,response);
                break;
            case "find":
                String info = request.getParameter("info");
                showResult(request,response);
                break;


        }

    }

    private void showResult(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String info = request.getParameter("info");
        List<Product>  listProduct = productService.find(info);
        request.setAttribute("productList", listProduct);
        request.setAttribute("listName", "Products Found" + info);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showListByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Product>  listProduct = productService.findByName(name);
        request.setAttribute("productList", listProduct);
        request.setAttribute("listName", "Product with name" + name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);

    }

    private void showListPriceDesc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product>  listProduct = productService.findAllPriceDesc();
        request.setAttribute("productList", listProduct);
        request.setAttribute("listName", "Product List with Descending Price");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showListPriceAsc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product>  listProduct = productService.findAllPriceAsc();
        request.setAttribute("productList", listProduct);
        request.setAttribute("listName", "Product List with Ascending Price");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Product>  listProduct = productService.findAll();
        request.setAttribute("productList", listProduct);
        request.setAttribute("listName", "Product List");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
