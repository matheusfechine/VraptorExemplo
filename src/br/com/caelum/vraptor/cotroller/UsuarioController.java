package br.com.caelum.vraptor.cotroller;

import service.UsuarioService;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Usuario;

@Resource
public class UsuarioController{
	
	private final Result result;
	
	private UsuarioService usuarioService;
	
	public UsuarioController(Result result, UsuarioService usuarioService){
		this.result = result;
		this.usuarioService = usuarioService;
	}
	@Path("/usuario")
	@Get
	public void index(){
	}
	
	@Path({"/usuario/novo", "/usuario/novo/{login}", "/usuario/novo/{login}/{opcional}"})
	public void criarUsuario(String login, String opcional){
		Usuario user = new Usuario();
		user.setLogin(login);
		result.include("opcional",opcional);
		result.include("usuario", user);
		result.include("msg","Bem vindo!!!");
	}
	@Path("/usuario/login")
	@Post
	public void login(Usuario usuario){
		if(usuarioService.login(usuario)){
			result.include("sucesso", "Usuario autenticado!");
		}
		result.redirectTo(this).sucesso();
	}
	@Path("usuario/sucesso")
	public void sucesso(){
		
	}
	
}
