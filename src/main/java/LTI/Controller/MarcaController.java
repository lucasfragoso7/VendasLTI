package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Marca;
import LTI.Service.MarcaService;
@RestController 
@RequestMapping("/marca")
public class MarcaController extends ControllerGeral<Marca>{ 
	@Autowired
	public MarcaController(MarcaService marcaService) {
		 super(marcaService);
		}
	}