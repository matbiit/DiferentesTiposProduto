package br.ita.model;

public class Produto {

	private String nome;
	private int codigo;
	private double preco;
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
	        return false;
	    }
		if (!(obj instanceof Produto)) {
	        return false;
	    }
		Produto p = (Produto) obj;
		if(this.codigo != p.codigo){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 7;
		result = prime * result + codigo;
		return result;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
