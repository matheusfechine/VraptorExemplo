package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.model.Usuario;
import service.UsuarioService;
@Component
@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioDao usuarioDao;
	
	public Boolean login(Usuario usuario){
		return usuarioDao.login(usuario);
	}

	public void salvar(Usuario usuario){
		
	}

}
