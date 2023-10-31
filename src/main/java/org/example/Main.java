package org.example;

import org.example.View.ConsoleView;

public class Main {
    public static void main(String[] args) {

        boolean opcao = false;
        ConsoleView view = new ConsoleView();
        while (!opcao) {
            view.exibirMenuCadastro();
            opcao = view.selecionarOpcao();
        }
    }
}