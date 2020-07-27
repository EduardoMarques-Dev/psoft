package br.ufpb.minicurso.exemplo4.v2.dtos;

import br.ufpb.minicurso.exemplo4.v2.entidades.Usuario;
import lombok.Data;

@Data
public class UsuarioDTO {
	private String email;
	private String nome;

	public UsuarioDTO(Usuario usuario) {
		email = usuario.getEmail();
		nome = usuario.getNome();
	}
}
