package com.politecnicomalaga.dadosobjetos.model;


import java.util.ArrayList;
import java.util.HashMap;

public class Partida {
    private ArrayList<Jugador> jugador;


    public Partida() {
        jugador = new ArrayList<>();
        jugador.add(new Jugador("J1", 0, 0, 0));
        jugador.add(new Jugador("J2", 0, 0, 0));
        jugador.add(new Jugador("J3", 0, 0, 0));
    }



    public int contarSeis() {
        int[] seises = {0,0,0};
        //Voy a recorrer todos los jugadores
        for (int i = 0; i < jugador.size(); i++) {

            //Numero de tiradas: por si en un futuro las tiradas son diferentes a 3
            int ntiradas = jugador.get(i).getTirada().getTiradas().size();


            //Jugador numero i, tirada numero 0 hasta todas las tiradas que haya hecho
            for (int j = 0; j < ntiradas; j++) {

                //recorremos todas las tiradas hechas por cada jugador

                if(jugador.get(i).getTirada().getTiradas().get(j)==6){
                    seises[i]+=1;
                }
                /*
                if (jugador.get(j).getTirada().getTiradas().get(j) == 6) {
                    numseis++;
                    seis.add(i, numseis);
                }
                */
            }

        }
        if(seises[0]>seises[1] && seises[0]>seises[2]) return 1;
        else if(seises[1]>seises[0] && seises[1]>seises[2]) return 2;
        else if(seises[2]>seises[1] && seises[2]>seises[0]) return 3;
        else{
            return comparar();
        }
    }

    public int comparar() {
        int[] sumador = {0,0,0};

        for (int i = 0; i < jugador.size(); i++) {

            int ntiradas = jugador.get(i).getTirada().getTiradas().size();

            for (int j = 0; j < ntiradas; j++) {
                sumador[i]+=jugador.get(i).getTirada().getTiradas().get(j);
            }
        }
        if(sumador[0]>sumador[1] && sumador[0]>sumador[2]) return 1;
        else if(sumador[1]>sumador[0] && sumador[1]>sumador[2]) return 2;
        else if(sumador[2]>sumador[1] && sumador[2]>sumador[0]) return 3;
        else{
            return 0;
        }

    }
    public int resutado(){
        int resutado=contarSeis();
        if(resutado==1){
            jugador.get(0).setPartGanada(jugador.get(0).getPartGanada()+1);
            jugador.get(1).setPartPerdida(jugador.get(1).getPartPerdida()+1);
            jugador.get(2).setPartPerdida(jugador.get(2).getPartPerdida()+1);
        }
        if(resutado==2){
            jugador.get(0).setPartPerdida(jugador.get(0).getPartPerdida()+1);
            jugador.get(1).setPartGanada(jugador.get(1).getPartGanada()+1);
            jugador.get(2).setPartPerdida(jugador.get(2).getPartPerdida()+1);
        }
        if(resutado==3) {
            jugador.get(0).setPartPerdida(jugador.get(0).getPartPerdida()+1);
            jugador.get(1).setPartPerdida(jugador.get(1).getPartPerdida()+1);
            jugador.get(2).setPartGanada(jugador.get(2).getPartGanada()+1);
        }
        if(resutado==0) {
            jugador.get(0).setPartEmpate(jugador.get(0).getPartEmpate()+1);
            jugador.get(1).setPartEmpate(jugador.get(1).getPartEmpate()+1);
            jugador.get(2).setPartEmpate(jugador.get(2).getPartEmpate()+1);
        }
        return resutado;
    }
    public ArrayList<Jugador> getJugador(){
        return jugador;
    }
}
