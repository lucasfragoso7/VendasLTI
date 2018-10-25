package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Cliente;
import LTI.Service.ClienteService;
@RestController
@RequestMapping("/cliente")
public class ClienteController extends ControllerGeral<Cliente>{ 
	@Autowired
	public ClienteController(ClienteService clienteService) {
		 super(clienteService);
		}
	}
