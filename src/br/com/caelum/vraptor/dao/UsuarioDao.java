package br.com.caelum.vraptor.dao;

import br.com.caelum.vraptor.model.Usuario;

public interface UsuarioDao{

	public void salvar(Usuario usuario);
	
	public Boolean login(Usuario usuario);
	
}
