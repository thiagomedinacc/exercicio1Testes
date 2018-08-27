package com.motoserra.testesExercicio1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)

public class exercicio1Test {
	@Test
	  @Parameters({ "1,professor,4.5", "1,1", "2,1", "3,2", "4,3", "5,5", "6,8" }  )
	  public void exerTest(int qnt, String tipo, double esp) throws Exception {
		Pessoa p1 = new Pessoa ("a", "professor");
		venda v1 = new venda(1, p1);
	      double observed = v1.getValor();
	      assertEquals(observed,esp);
	  }

	

}
