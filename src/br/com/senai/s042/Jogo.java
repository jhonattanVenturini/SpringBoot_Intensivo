package br.com.senai.s042;

import java.util.Random;

public class Jogo {
    Random rd = new Random();
    int tentativas;
    int numSorteado;

    public Jogo(){
        this.numSorteado = rd.nextInt(100);
        this.tentativas = 4;
    }


}
