package com.motoserra.testesExercicio1;

public class venda {
	private int qnt;
	private Pessoa comprador;
	private double valor;
	
	public venda(int qnt, Pessoa comprador) {
		this.qnt = qnt;
		this.comprador = comprador;
		valor = 0;
	}
	
	public double getValor() throws Exception {
		double desconto = 1;
		if (comprador.getTipo()== "professor" ||comprador.getTipo()== "funcionario" ) {
			desconto -= 0.1;
		}
		if (comprador.getTipo()== "aluno") {
			desconto -= 0.2;
		}
		if (qnt < 1) throw new Exception("Valor negativo");
		else if (qnt == 1 || qnt == 2) return 5 * qnt * desconto;
		else return 5 * qnt * (desconto-0.1);
	
		}
}
