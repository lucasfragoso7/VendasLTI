package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Categoria;
import LTI.Service.CategoriaService;

@RequestMapping("/Categoria")
public class CategoriaController extends ControllerGeral<Categoria, String>{ 
	@Autowired
	public CategoriaController(CategoriaService categoriaService) {
		 super(categoriaService);
		}
	}

