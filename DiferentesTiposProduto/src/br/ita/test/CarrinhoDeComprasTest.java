package br.ita.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ita.model.CarrinhoDeCompras;
import br.ita.model.Produto;

public class CarrinhoDeComprasTest {

	CarrinhoDeCompras cc;
	
	@Before
	public void test() {
		cc = new CarrinhoDeCompras();
	}
	
	@Test
	public void testAdicionaNovoProduto(){
		Produto p = new Produto();
		p.setNome("Chocolate");
		cc.adicionaProduto(p, 3);
		assertEquals(new Integer(3), cc.getCarrinho().get(p));
	}

	@Test
	public void testAdicionaProdutoJaCadastrado(){
		Produto p = new Produto();
		p.setNome("Chocolate");
		cc.adicionaProduto(p, 3);
		cc.adicionaProduto(p, 4);
		assertEquals(new Integer(7), cc.getCarrinho().get(p));
	}
	
	@Test
	public void testRemoveProdutoNaoCadastrado(){
		Produto p = new Produto();
		p.setNome("Chocolate");
		cc.removeProduto(p, 5);
		assertEquals(null, cc.getCarrinho().get(p));
	}
	
	@Test
	public void testRemoveProdutoQuantidadeMaior(){
		Produto p = new Produto();
		p.setNome("Chocolate");
		cc.adicionaProduto(p, 5);
		cc.removeProduto(p, 7);
		assertEquals(new Integer(5), cc.getCarrinho().get(p));
	}
	
	@Test
	public void testRemoveProduto(){
		Produto p = new Produto();
		p.setNome("Chocolate");
		cc.adicionaProduto(p, 7);
		cc.removeProduto(p, 5);
		assertEquals(new Integer(2), cc.getCarrinho().get(p));
	}
}
