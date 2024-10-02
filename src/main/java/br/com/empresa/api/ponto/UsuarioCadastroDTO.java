package br.com.empresa.api.ponto;

import lombok.Getter;

@Getter
public class UsuarioCadastroDTO {

    public Usuario transformaParaObjeto() {
        return new Usuario(nome, email, senha);
    }

    private String nome;
    private String email;
    private String senha;
}
