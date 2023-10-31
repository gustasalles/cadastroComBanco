package org.example.Controler;

import org.example.Model.ProfissaoEntity;
import org.example.Model.UsuarioEntity;

interface ICadastro {

     boolean inserir(UsuarioEntity user);

     boolean inserir(ProfissaoEntity profissao);

     UsuarioEntity obterUsuario(int id);

     ProfissaoEntity obterProfissao(int id);



}