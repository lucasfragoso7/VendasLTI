package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Venda;
import LTI.Service.VendaService;

@RequestMapping("/Venda")
public class VendaController extends ControllerGeral<Venda, String>{ 
	@Autowired
	public VendaController(VendaService vendaService) {
		 super(vendaService);
		}
	}
