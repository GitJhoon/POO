package com.mycompany.jogoperguntas1;

public class Pergunta {
    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private char respostaCorreta;
    
    public Pergunta(String pergunta, String opcaoA, String opcaoB, String opcaoC, char respostaCorreta){
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.respostaCorreta = respostaCorreta;
    }
    
    public String getPergunta(){
        return pergunta;
    }
    
    public void exibirPergunta(){
        System.out.println(pergunta);
        System.out.println("opção A: " + opcaoA);
        System.out.println("opção B: " + opcaoB);
        System.out.println("opção C: " + opcaoC);
    }
    
    public boolean verificarResposta(char resposta){
        return respostaCorreta == resposta;
    }
    
    public char getRespostaCorreta(){
        return respostaCorreta;
    }
}
