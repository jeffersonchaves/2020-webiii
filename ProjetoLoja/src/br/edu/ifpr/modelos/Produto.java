package br.edu.ifpr.modelos;

import java.util.Date;

public class Produto {

	private Integer id;
	private String nome;
	private Double preco;
	private Date dataCadastro;
	
	public Produto() {}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		this.dataCadastro = new Date();
	}
	
	public Produto(Integer id, String nome, Double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataCadastro = new Date();
	}

	public Produto(Integer id, String nome, Double preco, Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataCadastro = dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", dataCadastro=" + dataCadastro + "]";
	}
}
