package com.mycompany.jogoperguntas1;

public class Planeta {
    private String nome;
    private String tipoPlaneta;
    private String atmosfera;
    private int numeroDeLuas;
    
    public Planeta(String nome, String tipoPlaneta, String atmosfera, int numeroDeLuas){
        this.nome = nome;
        this.tipoPlaneta = tipoPlaneta;
        this.atmosfera = atmosfera;
        this.numeroDeLuas = numeroDeLuas;
    }
    
    public String ExibirPlaneta(){
        return "Nome:" + nome;
    }
}
