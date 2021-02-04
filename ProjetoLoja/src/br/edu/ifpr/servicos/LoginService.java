package br.edu.ifpr.servicos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpr.modelos.Usuario;
import br.edu.ifpr.repositorio.LoginRepositorio;

public class LoginService {
	
	LoginRepositorio repositorio = new LoginRepositorio();
	
	public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession sessao = req.getSession();
				
		String login = req.getParameter("inputLogin");
		String senha = req.getParameter("inputSenha");
		
		try {
		
			Usuario usuario = repositorio.verificarLoginUsuario(login, senha);
			sessao.setAttribute("estaLogado", true);
			sessao.setAttribute("usuario", usuario);
			
			resp.sendRedirect("/app/admin");
		
		} catch (Exception e) {
			
			req.setAttribute("mensagemErro", "erro: " + e.getMessage());

			RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}

}
