package com.mycompany.ForgottenPages.controller;

import com.mycompany.ForgottenPages.dao.playerDAO;
import com.mycompany.ForgottenPages.model.GameState;
import com.mycompany.ForgottenPages.util.Navegar;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Tela final do jogo (game over / resultado da run).
 * Exibe estatísticas e salva o resultado no banco.
 */
public class EndController {

    // =========================
    // UI
    // =========================
    @FXML private Label lblWaveFinal;
    @FXML private Label lblPontos;
    @FXML private Label lblNome;

    // =========================
    // INIT
    // =========================
    @FXML
    public void initialize() {
        GameState gs = GameState.getInstance();

        int wave = gs.getCiclo().getWaveAtual();
        int pontos = gs.getProgressao().getPontos();
        String nome = gs.getNomeJogador();

        atualizarLabels(nome, wave, pontos);
        salvarResultado(nome, wave);
    }

    // =========================
    // UI UPDATE
    // =========================
    private void atualizarLabels(String nome, int wave, int pontos) {
        if (lblNome != null) {
            lblNome.setText("Jogador: " + nome);
        }

        if (lblWaveFinal != null) {
            lblWaveFinal.setText("Wave alcançada: " + wave);
        }

        if (lblPontos != null) {
            lblPontos.setText("Pontos: " + pontos);
        }
    }

    // =========================
    // SAVE RESULT
    // =========================
    private void salvarResultado(String nome, int wave) {
        playerDAO.salvarResultadoRun(nome, wave);
    }

    // =========================
    // NAVIGATION
    // =========================
    @FXML
    private void voltarMenu() {
        Navegar.ir("menu");
    }

    @FXML
    private void irUpgrades() {
        Navegar.ir("upgrades");
    }
}