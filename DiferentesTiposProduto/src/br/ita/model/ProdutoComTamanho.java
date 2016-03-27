package br.ita.model;

public class ProdutoComTamanho extends Produto {

	private String tamanho;
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
	        return false;
	    }
		if (!(obj instanceof ProdutoComTamanho)) {
	        return false;
	    }
		ProdutoComTamanho p = (ProdutoComTamanho) obj;
		if(this.getCodigo() != p.getCodigo()){
			return false;
		}
		if(!(this.tamanho.equals(p.tamanho))){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 7;
		result = prime * result + this.getCodigo();
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
	}
	

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
