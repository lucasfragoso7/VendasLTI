package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Usuario;
import LTI.Service.UsuarioService;
@RestController 
@RequestMapping("/usuario")
public class UsuarioController extends ControllerGeral<Usuario>{ 
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		 super(usuarioService);
		}
	}
