package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Venda;
import LTI.Service.VendaService;
@RestController 
@RequestMapping("/venda")
public class VendaController extends ControllerGeral<Venda>{ 
	@Autowired
	public VendaController(VendaService vendaService) {
		 super(vendaService);
		}
	}
