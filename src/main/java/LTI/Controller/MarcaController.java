package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Marca;
import LTI.Service.MarcaService;

@RequestMapping("/Marca")
public class MarcaController extends ControllerGeral<Marca, String>{ 
	@Autowired
	public MarcaController(MarcaService marcaService) {
		 super(marcaService);
		}
	}