package com.mycompany.ForgottenPages.model;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private static GameState instance;

    private Player player;
    private final Ciclo ciclo = new Ciclo();
    private List<Inimigo> inimigosAtuais = new ArrayList<>();
    private final List<String> battleLog = new ArrayList<>();
    private Progressao progressao = new Progressao(0);
    // nome digitado no menu para busca/criação no banco
    private String nomeJogador = "Sinner";

    private GameState() {}

    public static GameState getInstance() {
        if (instance == null) instance = new GameState();
        return instance;
    }

    public static void reset() { instance = new GameState(); }

    public void iniciarWave() {
        if (player == null) player = PlayerFactory.criarPadrao();
        battleLog.clear();
        if (ciclo.isBossWave()) {
            inimigosAtuais = new ArrayList<>(List.of(ciclo.criaBoss()));
        } else {
            inimigosAtuais = new ArrayList<>(ciclo.criaInimigos());
        }
    }

    public boolean waveConcluida() {
        return inimigosAtuais.stream().noneMatch(Personagem::Tavivo);
    }

    public void avancarWave() {
        progressao.ganharPonto(1);   // 1 ponto por wave concluída
        ciclo.avancarWave();
    }

    public void addLog(String linha) { battleLog.add(linha); }
    public List<String> getBattleLog() { return battleLog; }

    public Player getPlayer()             { return player; }
    public void setPlayer(Player p)       { this.player = p; }
    public Ciclo getCiclo()               { return ciclo; }
    public Progressao getProgressao()     { return progressao; }
    public List<Inimigo> getInimigosAtuais()             { return inimigosAtuais; }
    public void setInimigosAtuais(List<Inimigo> list)    { inimigosAtuais = list; }
    public String getNomeJogador()        { return nomeJogador; }
    public void setNomeJogador(String n)  { nomeJogador = n; }
}
