package br.com.empresa.api.ponto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UsuarioRespostaDTO {

    private Long id;
    private String nome, email;
    private boolean admin;

    public static UsuarioRespostaDTO transformaEmDto(Usuario usuario) {
        return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
    }
}
