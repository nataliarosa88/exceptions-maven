package br.com.andretecnologia.app.exceptions;

import org.junit.jupiter.api.Test;

public class ExcecoesTest {

    @Test
    public void TestaExcecoes(){
        Excecoes excecoes = new Excecoes();
        excecoes.Somar();
        excecoes.Dividir();
        excecoes.Texto();
    }

}
