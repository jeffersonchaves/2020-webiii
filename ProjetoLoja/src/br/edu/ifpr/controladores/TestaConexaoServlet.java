package br.edu.ifpr.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpr.modelos.Produto;
import br.edu.ifpr.repositorio.ProdutoRepositorio;

@WebServlet("/teste")
public class TestaConexaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3315559594910647128L;
	
	ProdutoRepositorio repositorio = new ProdutoRepositorio();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		Produto p = repositorio.buscarPorId(6);
		resp.getWriter().print(p);
		*/
		
		//repositorio.cadastrar(new Produto("TECLADO MECANICO", 200.00));
		
		List<Produto> produtos = repositorio.buscarTodos();
		
		for (Produto produto : produtos) {
			resp.getWriter().print(produto);
			resp.getWriter().print("<br />");
		}
	}

}
