package com.politecnicomalaga.dadosobjetos.model;

import java.util.ArrayList;
import java.util.Collections;


public class Tirada {

    ArrayList<Integer> tirar = new ArrayList<>();
    public Tirada(){
        tirar.clear();
        //tirar.add(new Dados().getValor());
        for(int i=0;i<3;i++){
            tirar.add(numeroAleatorio());
        }

    }

    public ArrayList<Integer> getTiradas(){
        return tirar;
    }

    private int numeroAleatorio(){
        int numeroAleatorio = (int) (Math.random() * 6) + 1;
        return numeroAleatorio;
    }
}
