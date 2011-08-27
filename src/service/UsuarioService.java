package service;

import br.com.caelum.vraptor.model.Usuario;

public interface UsuarioService{
	
	public void salvar(Usuario usuario);

	public Boolean login(Usuario usuario);
}
