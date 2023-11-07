package controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;
import model.Client;

@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try {
			ClientDAO cDAO = new ClientDAO();
			List<Client> clients = cDAO.findClients();
			req.setAttribute("clients", clients);
			
			RequestDispatcher rd = req.getRequestDispatcher("clientes.jsp");
			rd.forward(req, res);

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
