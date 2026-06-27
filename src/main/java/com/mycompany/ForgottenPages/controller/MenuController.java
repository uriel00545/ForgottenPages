package com.mycompany.ForgottenPages.controller;

import com.mycompany.ForgottenPages.dao.playerDAO;
import com.mycompany.ForgottenPages.model.GameState;
import com.mycompany.ForgottenPages.util.Navegar;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Menu principal do jogo.
 * Responsável por iniciar run, navegação e saída.
 */
public class MenuController {

    // =========================
    // UI
    // =========================
    @FXML private TextField tfNome;

    // =========================
    // ACTIONS
    // =========================
    @FXML
    private void jogar() {
        String nome = obterNomeJogador();

        iniciarNovaRun(nome);
        Navegar.ir("area");
    }

    @FXML
    private void abrirRanking() {
        Navegar.ir("ranking");
    }

    @FXML
    private void abrirCreditos() {
        Navegar.ir("creditos");
    }

    @FXML
    private void fecharJogo() {
        System.exit(0);
    }

    // =========================
    // GAME START
    // =========================
    private void iniciarNovaRun(String nome) {
        GameState.reset();

        GameState gs = GameState.getInstance();
        gs.setNomeJogador(nome);
        gs.setPlayer(playerDAO.buscarOuCriar(nome));
    }

    // =========================
    // HELPERS
    // =========================
    private String obterNomeJogador() {
        String nome = (tfNome != null) ? tfNome.getText().trim() : "";
        return nome.isEmpty() ? "Sinner" : nome;
    }
}