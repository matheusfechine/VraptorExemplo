package br.com.caelum.vraptor.dao.impl;

import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.model.Usuario;
@Component
public class UsuarioDaoImpl implements UsuarioDao{

	public void salvar(Usuario usuario){
	}

	public Boolean login(Usuario usuario){
		if(usuario.getLogin().equals("matheus") && usuario.getSenha().equals("123456"))
			return true;
		return false;
	}

}
