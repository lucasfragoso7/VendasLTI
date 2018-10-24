package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Cliente;
import LTI.Service.ClienteService;

@RequestMapping("/Cliente")
public class ClienteController extends ControllerGeral<Cliente, String>{ 
	@Autowired
	public ClienteController(ClienteService clienteService) {
		 super(clienteService);
		}
	}
