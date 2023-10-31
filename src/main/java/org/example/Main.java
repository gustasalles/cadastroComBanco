package org.example;

import org.example.View.ConsoleView;
import org.example.View.WindowView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new WindowView());
   /*     boolean opcao = false;
        ConsoleView view = new ConsoleView();
        while (!opcao) {
            view.exibirMenuCadastro();
            opcao = view.selecionarOpcao();
        }*/
    }
}