package com.mycompany.DungeonMaster.model;

import java.util.ArrayList;
import java.util.List;

public class Ciclo {
    private int waveAtual = 1;

    public Ciclo() {}

    public boolean isBossWave() {
        return waveAtual % 5 == 0;
    }

    public Boss criaBoss() {
        int hp  = (int)(200 * Math.pow(1.30, (waveAtual / 5) - 1));
        int atk = (int)(15  * Math.pow(1.20, (waveAtual / 5) - 1));

        Skill ataque = new Skill("Golpe Pesado", atk, 5, 2, Skilltype.ATTACK,  DamageType.BLUNT);
        Skill defesa = new Skill("Barreira",       0, 3, 1, Skilltype.DEFENSE, DamageType.BLUNT);

        Boss boss = new Boss(new BasicAi(), "Boss - Wave " + waveAtual, hp, hp, 8);
        boss.getSkills().add(ataque);
        boss.getSkills().add(defesa);
        return boss;   // FIX: era 'return null'
    }

    public List<Inimigo> criaInimigos() {
        int count = 1 + (waveAtual / 3);
        List<Inimigo> lista = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int hp  = (int)(40 * Math.pow(1.10, waveAtual - 1));
            int atk = (int)(8  * Math.pow(1.08, waveAtual - 1));

            Skill ataque = new Skill("Ataque " + (i+1), atk, 3, 1, Skilltype.ATTACK,  DamageType.SLASH);
            Skill defesa = new Skill("Defesa " + (i+1),   0, 2, 1, Skilltype.DEFENSE, DamageType.SLASH);

            Inimigo ini = new Inimigo(new BasicAi(), "Inimigo " + (i+1), hp, hp, 4 + (int)(Math.random()*4));
            ini.getSkills().add(ataque);
            ini.getSkills().add(defesa);
            lista.add(ini);  // FIX: inimigo era criado mas nunca adicionado à lista
        }
        return lista;
    }

    public void avancarWave() { waveAtual++; }
    public int getWaveAtual() { return waveAtual; }
    public void setWaveAtual(int w) { this.waveAtual = w; }
}
