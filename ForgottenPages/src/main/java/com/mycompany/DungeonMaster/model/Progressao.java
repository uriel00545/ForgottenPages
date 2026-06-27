/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DungeonMaster.model;

/**
 *
 * @author jaeau
 */
public class Progressao {
    private int pontos;

    private int vidaNivel = 0;
    private int danoNivel = 0;
    private int clashNivel = 0;

    public void ganharPonto() {
        pontos++;
    }

    public boolean gastarPonto() {
        if (pontos <= 0) return false;
        pontos--;
        return true;
    }
    
    

    public int getPontos() {
        return pontos;
    }

    public Progressao(int pontos) {
        this.pontos = pontos;
    }

    public int getVidaNivel() {
        return vidaNivel;
    }

    public void setVidaNivel(int vidaNivel) {
        this.vidaNivel = vidaNivel;
    }

    public int getDanoNivel() {
        return danoNivel;
    }

    public void setDanoNivel(int danoNivel) {
        this.danoNivel = danoNivel;
    }

    public int getClashNivel() {
        return clashNivel;
    }

    public void setClashNivel(int clashNivel) {
        this.clashNivel = clashNivel;
    }
    
}





