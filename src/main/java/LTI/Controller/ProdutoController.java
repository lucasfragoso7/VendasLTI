package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Produto;
import LTI.Service.ProdutoService;
@RestController 
@RequestMapping("/produto")
public class ProdutoController extends ControllerGeral<Produto>{ 
	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		 super(produtoService);
		}
	}