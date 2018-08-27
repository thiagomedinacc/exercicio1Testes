package com.motoserra.testesExercicio1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Pessoa p1 = new Pessoa ("t", "aluno");
        Pessoa p2 = new Pessoa ("a", "professor");
        
        venda v1 = new venda (3, p2);
        System.out.println(v1.getValor());
        
    }
}
