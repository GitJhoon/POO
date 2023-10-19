package com.mycompany.jogoperguntas1;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Jogo {
    private List<Pergunta> perguntas;
    
    public Jogo(){
        perguntas = new ArrayList<>();
        
        perguntas.add(new Pergunta("Qual o tipo de formação da Terra? ", "Rochosa", "Gasosa", "Nenhum dos dois", 'a'));
    }
    
    public void iniciarJogo(){
        
        Scanner sc = new Scanner(System.in);
        char resposta;
        
        System.out.println("Bem-vindo ao jogo de perguntas e respostas!\n");
        
        for(Pergunta pergunta : perguntas){
            
            pergunta.exibirPergunta();
            resposta = sc.nextLine().charAt(0);
            if(pergunta.verificarResposta(resposta)){
                System.out.println("Resposta Correta!");
            }else{
                System.out.println("Resposta errada! A resposta correta era: " + pergunta.getRespostaCorreta());
            }
        }
    }
}
