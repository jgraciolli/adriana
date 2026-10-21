package org.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.controller.*;
import org.example.model.*;
import org.example.view.*;

public class MenuApp extends Application {

    @Override
    public void start(Stage stage) {
        VBox raiz = Estilo.painel();

        Label titulo = Estilo.rotulo("Qual você deseja executar?");

        Button b1 = Estilo.botao("1 - Verificação de Múltiplo");
        Button b2 = Estilo.botao("2 - Sistema de Login Simplificado");
        Button b3 = Estilo.botao("3 - Compra com desconto");
        Button b4 = Estilo.botao("4 - Temperatura");
        Button b5 = Estilo.botao("5 - Os trinta e cinco camelos");
        Button b6 = Estilo.botao("6 - Calculadora de viagem");
        Button b7 = Estilo.botao("7 - Aluguel de carro");
        Button b8 = Estilo.botao("8 - Loja de roupas");
        Button b9 = Estilo.botao("9 - Caminho na floresta");
        Button b10 = Estilo.botao("10 - Máscaras africanas");
        Button b11 = Estilo.botao("11 - Desenhos de mangá");
        Button sair = Estilo.botao("0 - Sair");

        b1.setOnAction(e -> abrirMultiplo());
        b2.setOnAction(e -> abrirLogin());
        b3.setOnAction(e -> abrirCompra());
        b4.setOnAction(e -> abrirTemperatura());
        b5.setOnAction(e -> abrirCamelo());
        b6.setOnAction(e -> abrirViagem());
        b7.setOnAction(e -> abrirAluguel());
        b8.setOnAction(e -> abrirLojaRoupas());
        b9.setOnAction(e -> abrirFloresta());
        b10.setOnAction(e -> abrirMascaras());
        b11.setOnAction(e -> abrirManga());
        sair.setOnAction(e -> Platform.exit());

        raiz.getChildren().addAll(titulo, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, sair);

        stage.setTitle("Menu Principal");
        stage.setScene(new Scene(raiz, 320, 560));
        stage.show();
    }

    private void abrirMultiplo() {
        MultiploView view = new MultiploView();
        new MultiploController(new MultiploModel(), view);
        abrirJanela("Verificação de Múltiplo", view.getRaiz(), 380, 280);
    }

    private void abrirLogin() {
        LoginView view = new LoginView();
        new LoginController(new LoginModel(), view);
        abrirJanela("Sistema de Login Simplificado", view.getRaiz(), 380, 220);
    }

    private void abrirCompra() {
        CompraView view = new CompraView();
        new CompraController(new CompraModel(), view);
        abrirJanela("Compra com desconto", view.getRaiz(), 420, 560);
    }

    private void abrirTemperatura() {
        TemperaturaView view = new TemperaturaView();
        new TemperaturaController(new TemperaturaModel(), view);
        abrirJanela("Temperatura", view.getRaiz(), 420, 480);
    }

    private void abrirCamelo() {
        CameloView view = new CameloView();
        new CameloController(new CameloModel(), view);
        abrirJanela("Os trinta e cinco camelos", view.getRaiz(), 420, 300);
    }

    private void abrirViagem() {
        ViagemView view = new ViagemView();
        new ViagemController(new ViagemModel(), view);
        abrirJanela("Calculadora de viagem", view.getRaiz(), 400, 300);
    }

    private void abrirAluguel() {
        AluguelCarroView view = new AluguelCarroView();
        new AluguelCarroController(new AluguelCarroModel(), view);
        abrirJanela("Aluguel de carro", view.getRaiz(), 400, 300);
    }

    private void abrirLojaRoupas() {
        LojaRoupasView view = new LojaRoupasView();
        new LojaRoupasController(view);
        abrirJanela("Imagem 1 - Loja de roupas", view.getRaiz(), 980, 480);
    }

    private void abrirFloresta() {
        FlorestaView view = new FlorestaView();
        new FlorestaController(view);
        abrirJanela("Imagem 2 - Caminho na floresta", view.getRaiz(), 980, 480);
    }

    private void abrirMascaras() {
        MascarasView view = new MascarasView();
        new MascarasController(view);
        abrirJanela("Imagem 3 - Máscaras africanas", view.getRaiz(), 980, 480);
    }

    private void abrirManga() {
        MangaView view = new MangaView();
        new MangaController(view);
        abrirJanela("Imagem 4 - Desenhos de mangá", view.getRaiz(), 980, 480);
    }

    private void abrirJanela(String titulo, VBox raiz, int largura, int altura) {
        Stage janela = new Stage();
        janela.setTitle(titulo);
        janela.setScene(new Scene(raiz, largura, altura));
        janela.show();
    }
}
