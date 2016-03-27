package br.ita.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ita.model.Produto;

public class ProdutoTest {

	Produto p; 
	
	@Before
	public void inicializacao() {
		p = new Produto();
	}
	
	@Test
	public void testNome(){
		p.setNome("Nutella");
		assertEquals("Nutella", p.getNome());
	}
	
	@Test
	public void testCodigo(){
		p.setCodigo(123);
		assertEquals(123, p.getCodigo());
	}
	
	@Test
	public void testPreco(){
		p.setPreco(50.68);
		assertEquals(50.68, p.getPreco(), 2);
	}
	
	@Test
	public void testMesmoProduto(){
		Produto p1 = new Produto();
		p.setCodigo(123);
		p1.setCodigo(123);
		assertEquals(true, p.equals(p1));
	}
	
	@Test
	public void testProdutosDiferentesCodigos(){
		Produto p1 = new Produto();
		p.setCodigo(123);
		p1.setCodigo(321);
		assertEquals(false, p.equals(p1));
	}
	
	
	

}
