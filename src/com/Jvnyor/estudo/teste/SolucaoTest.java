package com.Jvnyor.estudo.teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SolucaoTest {

	@Test
	public void challengeWorks2() {
		String input = "key: Matheus, value: 25; key: Henrique, value: 29; key: Glória, value: 21";
		Assert.assertEquals("2 Pessoa(s): Matheus, Glória", Solucao.findAge(input));
	}
}
