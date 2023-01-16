package br.com.ada.itau950.pedidos.compras.dto;

import br.com.ada.itau950.pedidos.compras.entity.Endereco;
import br.com.ada.itau950.pedidos.compras.entity.enums.PerfilEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDto {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private PerfilEnum perfil;

}