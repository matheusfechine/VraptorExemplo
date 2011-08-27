package br.com.vraptor.teste;


import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import service.UsuarioService;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.cotroller.UsuarioController;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.util.test.MockResult;

public class UsuarioControllerTeste{
	
	@Mock
	private Result result;
	
	UsuarioController usuarioController;

	@Mock
	UsuarioService usuarioService;
	
	@Mock
	Usuario usuario;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		result = new MockResult();
		usuarioController = new UsuarioController(result, usuarioService);
		when(usuario.getLogin()).thenReturn("matheus");
	}
	
	@Test
	public void deveriaExibirIndex(){
		usuarioController.criarUsuario("matheus", "Opcional");
		assertTrue("Deveria conter uma mensagem", result.included().containsKey("msg"));
	}
	
	@Test
	public void deveriaExibirUsuarioComOpcional(){
		usuarioController.criarUsuario("matheus","Opcional");
		Usuario user = (Usuario)result.included().get("usuario");
		assertTrue("Deveria conter uma Usuario", user.getLogin().equals("matheus"));
		assertTrue("Deveria opcional", result.included().containsKey("opcional"));
	}
	
	@Test
	public void deveriaExibirUsuarioSemOpcional(){
		usuarioController.criarUsuario("matheus","Opcional");
		Usuario user = (Usuario)result.included().get("usuario");
		assertTrue("Deveria conter uma Usuario", user.getLogin().equals("matheus"));
	}
	
	@Test
	public void deveriaLogarComSucesso(){
		when(usuarioService.login(usuario)).thenReturn(true);
		usuarioController.login(usuario);
		assertTrue("Deveria conter SUCESSO", result.included().containsKey("sucesso"));
	}
	
}
