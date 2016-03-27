package br.ita.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ita.model.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	ProdutoComTamanho p; 
	
	@Before
	public void inicializacao() {
		p = new ProdutoComTamanho();
	}
	
	@Test
	public void testTamanho(){
		p.setTamanho("M");
		assertEquals("M", p.getTamanho());
	}

	@Test
	public void testMesmoProduto(){
		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p.setCodigo(123);
		p.setTamanho("G");
		p1.setCodigo(123);
		p1.setTamanho("G");
		assertEquals(true, p.equals(p1));
	}
	
	@Test
	public void testProdutosDiferentesCodigos(){
		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p.setCodigo(123);
		p.setTamanho("G");
		p1.setCodigo(321);
		p1.setTamanho("M");
		assertEquals(false, p.equals(p1));
	}
}
