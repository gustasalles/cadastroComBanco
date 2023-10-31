package org.example.Controler;


import org.example.Model.ProfissaoEntity;
import org.example.Model.UsuarioEntity;
import org.example.utils.Conversor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cadastro implements ICadastro {


    @Override
    public boolean inserir(UsuarioEntity user) {
        Connection connection = ConexaoBanco.connect();
        if (connection != null) {
            try {
                String sql = " INSERT INTO pessoas(nome,cpf,endereco,dt_nascimento,nacionalidade,sexo) " +
                        "VALUES (?,?,?,?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                // Preencha os valores dos parâmetros da consulta.
                preparedStatement.setString(1, user.getNome());
                preparedStatement.setString(2, user.getCpf());
                preparedStatement.setString(3, user.getEndereco());
                preparedStatement.setDate(4, Conversor.fromSqlDate(user.getDt_nascimento()));
                preparedStatement.setString(5, user.getNacionalidade());
                preparedStatement.setString(6, user.getSexo());

                // Execute a consulta para inserir os dados.
                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Inserção bem-sucedida!");
                } else {
                    System.out.println("Nenhuma linha foi inserida.");
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean inserir(ProfissaoEntity profissao) {
        return false;
    }

    @Override
    public UsuarioEntity obterUsuario(int id) {
        return null;
    }

    @Override
    public ProfissaoEntity obterProfissao(int id) {
        return null;
    }

}