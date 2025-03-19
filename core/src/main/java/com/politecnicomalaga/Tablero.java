package com.politecnicomalaga;

public class Tablero {
   private final int PROBNACIMIENTO = 50;


    //Atributos
    private int filas;
    private int columnas;
    private int numGeneraciones;
    private int generacionActual;
    private Celula celulas [][];
    public EstadoJuego estadoJuego;


    public Tablero(int filas, int columnas, int numGeneraciones, int generacionActual) {
        this.filas = filas;
        this.columnas = columnas;
        this.numGeneraciones = numGeneraciones;
        this.generacionActual = generacionActual;
        Celula [][] celulas = new Celula [filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getNumGeneraciones() {
        return numGeneraciones;
    }

    public void setNumGeneraciones(int numGeneraciones) {
        this.numGeneraciones = numGeneraciones;
    }

    public int getGeneracionActual() {
        return generacionActual;
    }

    public void setGeneracionActual(int generacionActual) {
        this.generacionActual = generacionActual;
    }



    public void iniciar ()    {
        int naceono = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; i++) {
                naceono = (int) (Math.random() * 100);
                if (naceono < PROBNACIMIENTO) {
                    celulas[i][j] = new Celula();
                }
            }
        }
    }
}
