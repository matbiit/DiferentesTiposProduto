package br.ita.model;

import java.util.HashMap;

public class CarrinhoDeCompras {

	private HashMap<Produto, Integer> carrinho;
	
	public CarrinhoDeCompras(){
		carrinho = new HashMap<Produto, Integer>();
	}
	
	public void adicionaProduto(Produto p, int quantidade){
		carrinho.put(p, carrinho.getOrDefault(p, 0) + quantidade);
	} 
	
	public void  removeProduto(Produto p, int quantidade){
		if(carrinho.containsKey(p)){
			if(carrinho.get(p) >= quantidade){
				carrinho.put(p, carrinho.get(p) - quantidade);
			} else {
				System.out.println("Quantidade a ser removida maior que a armazenada");
			}
		} else {
			System.out.println("Produto não encontrado");
		}
	}
	
	public HashMap<Produto, Integer> getCarrinho(){
		return this.carrinho;
	}
	
	public double getTotal(){
		double total = 0;
		for (Produto p : carrinho.keySet()) {
			total += p.getPreco() * carrinho.get(p);
		}
		return total;
	}
}
