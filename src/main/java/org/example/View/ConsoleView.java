package org.example.View;

import org.example.Controler.Cadastro;
import org.example.Model.ProfissaoEntity;
import org.example.Model.UsuarioEntity;
import org.example.utils.Conversor;

import java.util.Scanner;

public class ConsoleView implements IConsoleView {


    @Override
    public void exibirMenuCadastro() {
        System.out.println("Digite 1 para cadastrar pessoa");
        System.out.println("Digite 2 para cadastrar profissao");
    }

    @Override
    public boolean selecionarOpcao() {
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        Cadastro cadastro = new Cadastro();
        switch (opcao) {
            case 1:
                UsuarioEntity user = new UsuarioEntity();
                System.out.println("Insira o nome");
                leitor.nextLine();
                user.setNome(leitor.nextLine());
                System.out.println("Insira o sexo");
                user.setSexo(leitor.nextLine());
                System.out.println("insira a nacionalidade");
                user.setNacionalidade(leitor.nextLine());
                System.out.println("insira o cpf");
                user.setCpf(leitor.nextLine());
                System.out.println("insira o endereco");
                user.setEndereco(leitor.nextLine());
                System.out.println("insira a data de nascimento");
                String data = leitor.nextLine();
                user.setDt_nascimento(Conversor.StringToDate(data));
                System.out.println("insira a profissao");
                user.setProfissao(leitor.nextLine());

                cadastro.inserir(user);
                return true;
            case 2:
                ProfissaoEntity profissao = new ProfissaoEntity();
                System.out.println("Digite o cargo ");
                profissao.setCargo(leitor.next());
                System.out.println("Digite o Salario");
                profissao.setSalario(leitor.nextDouble());
                System.out.println("Digite o imposto");
                profissao.setImposto(leitor.nextDouble());


                cadastro.inserir(profissao);

                return true;
            default:
                System.out.println("Opcao Inválida");
                return false;

        }
    }

    @Override
    public String exibirResultado() {
        return null;
    }
}
