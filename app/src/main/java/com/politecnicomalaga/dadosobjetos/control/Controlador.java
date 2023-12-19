package com.politecnicomalaga.dadosobjetos.control;

import com.politecnicomalaga.dadosobjetos.view.MainActivity;
import com.politecnicomalaga.dadosobjetos.model.Partida;

public class Controlador {
    private MainActivity miActivity;
    private Partida partida;
    private static Controlador singleton;

    private Controlador() {
        partida = new Partida();
    }

    public static Controlador getSingleton() {
        if (singleton == null) {
            singleton = new Controlador();
        }
        return singleton;
    }




    public String ganador() {
        if(partida!=null){
            partida.getJugador().get(0).renovarTiradas();
            partida.getJugador().get(1).renovarTiradas();
            partida.getJugador().get(2).renovarTiradas();
        }
        int ganador = partida.resutado();
        String[] texto = {"J1 Gana", "J2 Gana", "J3 Gana", "Empate"};
        if (ganador == 1) return texto[0];
        if (ganador == 2) return texto[1];
        if (ganador == 3) return texto[2];
        else {
            return texto[3];
        }
    }

    public String getD1J1() {
        return partida.getJugador().get(0).getTirada().getTiradas().get(0).toString();
    }

    public String getD2J1() {
        return partida.getJugador().get(0).getTirada().getTiradas().get(1).toString();
    }

    public String getD3J1() {
        return partida.getJugador().get(0).getTirada().getTiradas().get(2).toString();
    }

    public String getD1J2() {
        return partida.getJugador().get(1).getTirada().getTiradas().get(0).toString();
    }

    public String getD2J2() {
        return partida.getJugador().get(1).getTirada().getTiradas().get(1).toString();
    }

    public String getD3J2() {
        return partida.getJugador().get(1).getTirada().getTiradas().get(2).toString();
    }

    public String getD1J3() {
        return partida.getJugador().get(2).getTirada().getTiradas().get(0).toString();
    }

    public String getD2J3() {
        return partida.getJugador().get(2).getTirada().getTiradas().get(1).toString();
    }

    public String getD3J3() {
        return partida.getJugador().get(2).getTirada().getTiradas().get(2).toString();
    }

    public String getGanadaJ1() {
        return String.valueOf(partida.getJugador().get(0).getPartGanada());
    }

    public String getGanadaJ2() {
        return String.valueOf(partida.getJugador().get(1).getPartGanada());
    }

    public String getGanadaJ3() {
        return String.valueOf(partida.getJugador().get(2).getPartGanada());
    }

    public String getDerrotaJ1() {
        return String.valueOf(partida.getJugador().get(0).getPartPerdida());
    }

    public String getDerrotaJ2() {
        return String.valueOf(partida.getJugador().get(1).getPartPerdida());
    }

    public String getDerrotaJ3() {
        return String.valueOf(partida.getJugador().get(2).getPartPerdida());
    }

    public String getEmpateJ1() {
        return String.valueOf(partida.getJugador().get(0).getPartEmpate());
    }
    public String getEmpateJ2() {
        return String.valueOf(partida.getJugador().get(1).getPartEmpate());
    }
    public String getEmpateJ3() {
        return String.valueOf(partida.getJugador().get(2).getPartEmpate());
    }
}
