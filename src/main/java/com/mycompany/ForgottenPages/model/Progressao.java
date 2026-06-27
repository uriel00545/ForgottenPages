/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ForgottenPages.model;

/**
 *
 * @author jaeau
 */
public class Progressao {
    private int pontos;
    private int vidaNivel;
    private int clashNivel;
    private int danoNivel;

    
    public void ganharPonto () {}
    
    public boolean gastarPonto(int quantidade) {

        if (pontos >= quantidade) {
            pontos -= quantidade;
            return true; // conseguiu gastar
        }

        return false; // não tinha pontos suficientes
    }
    
    public Progressao(int pontos) {
        this.pontos = pontos;
        this.vidaNivel = vidaNivel;
        this.clashNivel = clashNivel;
        this.danoNivel = danoNivel;
    }

    public int getDanoNivel() {
        return danoNivel;
    }

    public void setDanoNivel(int danoNivel) {
        this.danoNivel = danoNivel;
    }

    public int getVidaNivel() {
        return vidaNivel;
    }

    public void setVidaNivel(int vidaNivel) {
        this.vidaNivel = vidaNivel;
    }

    public int getClashNivel() {
        return clashNivel;
    }

    public void setClashNivel(int clashNivel) {
        this.clashNivel = clashNivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
}
