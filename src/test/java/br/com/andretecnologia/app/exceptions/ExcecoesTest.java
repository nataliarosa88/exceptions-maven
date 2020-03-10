package br.com.andretecnologia.app.exceptions;

import org.junit.jupiter.api.Test;

public class ExcecoesTest {

    @Test
    public void TestaExcecoes() {
        Excecoes excecoes = new Excecoes();
        excecoes.Somar();
        try {
            excecoes.Dividir();
        }catch(Exception e){
            System.out.println("Sistema não pode dividir por zero");
        }
        excecoes.Texto();
    }

}
