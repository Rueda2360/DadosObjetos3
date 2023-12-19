package com.politecnicomalaga.dadosobjetos.model;


public class Jugador {
    private String nombre;
    private int partGanada,partEmpate,partPerdida;

    private Tirada tirada;
    public Jugador(String nombre,int partGanada,int partPerdida,int partEmpate){
        this.nombre=nombre;
        this.partGanada=partGanada;
        this.partPerdida=partPerdida;
        this.partEmpate=partEmpate;
        renovarTiradas();
    }

    public void renovarTiradas(){
        tirada=new Tirada();
    }

    public void setPartEmpate(int partEmpate) {
        this.partEmpate = partEmpate;
    }

    public void setPartGanada(int partGanada) {
        this.partGanada = partGanada;
    }

    public void setPartPerdida(int partPerdida) {
        this.partPerdida = partPerdida;
    }

    public int getPartEmpate() {
        return partEmpate;
    }

    public int getPartGanada() {
        return partGanada;
    }

    public int getPartPerdida() {
        return partPerdida;
    }

    public String getNombre() {
        return nombre;
    }

    public Tirada getTirada() {
        return tirada;
    }
}
