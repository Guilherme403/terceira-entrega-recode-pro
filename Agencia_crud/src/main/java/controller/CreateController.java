package controller;

import java.io.IOException;


import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.ClientDAO;
import model.Client;



@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Client client = new Client();
		
		client.setNome(req.getParameter("nome"));
		client.setContato(req.getParameter("contato"));
		client.setEmail(req.getParameter("email"));
		client.setSenha(req.getParameter("senha"));
		client.setDataNasc(LocalDate.parse(req.getParameter("dataNasc")));
		
		try {
			ClientDAO clienteDAO = new ClientDAO();
			clienteDAO.createClient(client);
			
			
			res.sendRedirect("ReadController");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}