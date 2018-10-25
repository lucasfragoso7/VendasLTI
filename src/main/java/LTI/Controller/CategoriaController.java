package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Categoria;
import LTI.Service.CategoriaService;
@RestController 
@RequestMapping("/categoria")
public class CategoriaController extends ControllerGeral<Categoria>{ 
	@Autowired
	public CategoriaController(CategoriaService categoriaService) {
		 super(categoriaService);
		}
	}

