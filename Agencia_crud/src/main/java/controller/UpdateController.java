package controller;

import java.io.IOException;

import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;
import model.Client;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		
		try {
			ClientDAO cDAO = new ClientDAO();
			Client client = cDAO.findClient(id);
			
			req.setAttribute("client", client);
			
			RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
			rd.forward(req, res);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			Client client = new Client();
			client.setId(Integer.parseInt(req.getParameter("id")));
			client.setNome(req.getParameter("nome"));
			client.setContato(req.getParameter("contato"));
			client.setEmail(req.getParameter("email"));
			client.setSenha(req.getParameter("senha"));
			client.setDataNasc(LocalDate.parse(req.getParameter("dataNasc")));
			
			
			ClientDAO cDAO = new ClientDAO();
			cDAO.updateClient(client);
			
			res.sendRedirect("ReadController");
		} catch (Exception e) {
			
		}
		
		
		
		
	}

}
