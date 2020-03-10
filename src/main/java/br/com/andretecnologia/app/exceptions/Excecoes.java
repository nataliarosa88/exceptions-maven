package br.com.andretecnologia.app.exceptions;

public class Excecoes {

    int a = 10;
    int b = 0;

    public void Somar(){
        int soma;
        soma = a+b;
        System.out.println(soma);
    }

    public void Dividir(){
        int divisao;
        try {
            divisao = a / b;
            System.out.println(divisao);
        }catch (Exception e){
            System.out.println("O sistema não pode dividir por zero");
        }
    }

    public void Texto(){
        System.out.println("Chegou nesse texto");
    }
}
