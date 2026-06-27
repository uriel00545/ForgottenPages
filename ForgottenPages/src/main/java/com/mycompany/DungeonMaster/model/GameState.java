package com.mycompany.DungeonMaster.model;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private static GameState instance;

    private Player player;
    private Ciclo ciclo = new Ciclo();
    private List<Inimigo> inimigosAtuais = new ArrayList<>();
    private List<String> battleLog = new ArrayList<>();

    private GameState() {}

    public static GameState getInstance() {
        if (instance == null) instance = new GameState();
        return instance;
    }

    public static void reset() { instance = new GameState(); }

    // Garante que player existe e wave está pronta antes de entrar em batalha
    public void iniciarWave() {
        if (player == null) {
            player = PlayerFactory.criarPadrao();
        }
        battleLog.clear();
        // FIX: List.of() é imutável → trocado por new ArrayList<>()
        if (ciclo.isBossWave()) {
            inimigosAtuais = new ArrayList<>(List.of(ciclo.criaBoss()));
        } else {
            inimigosAtuais = new ArrayList<>(ciclo.criaInimigos());
        }
    }

    public boolean waveConcluida() {
        return inimigosAtuais.stream().noneMatch(Personagem::Tavivo);
    }

    public void avancarWave() { ciclo.avancarWave(); }

    public void addLog(String linha) { battleLog.add(linha); }
    public List<String> getBattleLog() { return battleLog; }

    public Player getPlayer() { return player; }
    public void setPlayer(Player p) { this.player = p; }

    public Ciclo getCiclo() { return ciclo; }

    public List<Inimigo> getInimigosAtuais() { return inimigosAtuais; }
    public void setInimigosAtuais(List<Inimigo> list) { inimigosAtuais = list; }
}
