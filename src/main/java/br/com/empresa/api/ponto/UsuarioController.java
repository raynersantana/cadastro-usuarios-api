package br.com.empresa.api.ponto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody UsuarioCadastroDTO dto) {
        Usuario usuario = usuarioService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(UsuarioRespostaDTO.transformaEmDto(usuario), HttpStatus.CREATED);
    }

}
