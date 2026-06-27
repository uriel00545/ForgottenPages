package com.mycompany.ForgottenPages.controller;

import com.mycompany.ForgottenPages.model.GameState;
import com.mycompany.ForgottenPages.model.Skill;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * Inventário do jogador.
 * Exibe skills e informações básicas do personagem.
 */
public class InvController {

    // =========================
    // UI
    // =========================
    @FXML private ListView<String> listSkills;
    @FXML private Label lblNome;
    @FXML private Label lblHp;

    // =========================
    // INIT
    // =========================
    @FXML
    public void initialize() {
        GameState gs = GameState.getInstance();

        if (gs.getPlayer() == null) return;

        atualizarInfoJogador(gs);
        carregarSkills(gs);
    }

    // =========================
    // PLAYER INFO
    // =========================
    private void atualizarInfoJogador(GameState gs) {
        if (lblNome != null) {
            lblNome.setText(gs.getPlayer().getNome());
        }

        if (lblHp != null) {
            lblHp.setText(
                    "HP: " + gs.getPlayer().getHp()
                    + "/" + gs.getPlayer().getMaxHp()
            );
        }
    }

    // =========================
    // SKILLS LIST
    // =========================
    private void carregarSkills(GameState gs) {
        if (listSkills == null) return;

        listSkills.getItems().clear();

        for (Skill s : gs.getPlayer().getSkills()) {
            listSkills.getItems().add(formatSkill(s));
        }
    }

    // =========================
    // FORMAT
    // =========================
    private String formatSkill(Skill s) {
        return String.format(
                "%s  [base:%d  moeda:%dx%d]  %s | %s",
                s.getNome(),
                s.getBasePower(),
                s.getCoinPower(),
                s.getCoinCount(),
                s.getTipo(),
                s.getDamageType()
        );
    }

    // =========================
    // ACTIONS
    // =========================
    @FXML
    private void fechar() {
        Stage stage = (Stage) listSkills.getScene().getWindow();
        stage.close();
    }
}