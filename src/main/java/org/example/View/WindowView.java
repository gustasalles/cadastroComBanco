package org.example.View;

import org.example.Controler.Cadastro;
import org.example.Model.UsuarioEntity;
import org.example.utils.Conversor;

import javax.swing.*;
import java.awt.*;
import java.util.Date;


public class WindowView extends JFrame {
    private JTextField nomeField, cpfField, enderecoField, dtNascimentoField, profissaoField, nacionalidadeField, sexoField;
    private JTextField cargoField, salarioField, impostoField;

    public WindowView() {
        setTitle("Formulário de Preenchimento");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        addComponent(panel, new JLabel("Nome:"), 0, 0, 1, 1);
        nomeField = new JTextField(20);
        addComponent(panel, nomeField, 1, 0, 1, 1);

        addComponent(panel, new JLabel("CPF:"), 0, 1, 1, 1);
        cpfField = new JTextField(20);
        addComponent(panel, cpfField, 1, 1, 1, 1);

        addComponent(panel, new JLabel("Endereço:"), 0, 2, 1, 1);
        enderecoField = new JTextField(20);
        addComponent(panel, enderecoField, 1, 2, 1, 1);

        addComponent(panel, new JLabel("Data de Nascimento (dd/MM/yyyy):"), 0, 3, 1, 1);
        dtNascimentoField = new JTextField(20);
        addComponent(panel, dtNascimentoField, 1, 3, 1, 1);

        addComponent(panel, new JLabel("Profissão:"), 0, 4, 1, 1);
        profissaoField = new JTextField(20);
        addComponent(panel, profissaoField, 1, 4, 1, 1);

        addComponent(panel, new JLabel("Nacionalidade:"), 0, 5, 1, 1);
        nacionalidadeField = new JTextField(20);
        addComponent(panel, nacionalidadeField, 1, 5, 1, 1);

        addComponent(panel, new JLabel("Sexo:"), 0, 6, 1, 1);
        sexoField = new JTextField(20);
        addComponent(panel, sexoField, 1, 6, 1, 1);

        addComponent(panel, new JLabel("Cargo:"), 0, 7, 1, 1);
        cargoField = new JTextField(20);
        addComponent(panel, cargoField, 1, 7, 1, 1);

        addComponent(panel, new JLabel("Salário:"), 0, 8, 1, 1);
        salarioField = new JTextField(20);
        addComponent(panel, salarioField, 1, 8, 1, 1);

        addComponent(panel, new JLabel("Imposto:"), 0, 9, 1, 1);
        impostoField = new JTextField(20);
        addComponent(panel, impostoField, 1, 9, 1, 1);

        JButton submitButton = new JButton("Enviar");
        submitButton.addActionListener(e -> {
            // Recuperar e exibir os dados
            mostrarDadosFormulario();
        });
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 10;
        panel.add(submitButton, c);

        add(panel);
        setVisible(true);
    }

    private void addComponent(JPanel panel, JComponent component, int x, int y, int width, int height) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = width;
        c.gridheight = height;
        panel.add(component, c);
    }

    private void mostrarDadosFormulario() {

        // Recuperar os dados do formulário e exibi-los
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String endereco = enderecoField.getText();
        String dtNascimentoStr = dtNascimentoField.getText();
        String profissao = profissaoField.getText();
        String nacionalidade = nacionalidadeField.getText();
        String sexo = sexoField.getText();
        String cargo = cargoField.getText();
        Double salario = Double.parseDouble(salarioField.getText());
        Double imposto = Double.parseDouble(impostoField.getText());

        Date novaData = Conversor.StringToDate(dtNascimentoStr);

        UsuarioEntity user = new UsuarioEntity(nome,cpf,endereco,novaData,profissao,nacionalidade,sexo);
        Cadastro cadastro = new Cadastro();


        // insere usuario no banco de dados
        cadastro.inserir(user);

        // Exibir os dados em uma caixa de diálogo
        String mensagem = "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nData de Nascimento: " + novaData + "\nProfissão: " + profissao + "\nNacionalidade: " + nacionalidade + "\nSexo: " + sexo + "\nCargo: " + cargo + "\nSalário: " + salario + "\nImposto: " + imposto;
        JOptionPane.showMessageDialog(this, mensagem, "Dados do Formulário", JOptionPane.INFORMATION_MESSAGE);
    }

}
