package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Usuario;
import LTI.Service.UsuarioService;

@RequestMapping("/Usuario")
public class UsuarioController extends ControllerGeral<Usuario, String>{ 
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		 super(usuarioService);
		}
	}
