package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Produto;
import LTI.Service.ProdutoService;

@RequestMapping("/Produto")
public class ProdutoController extends ControllerGeral<Produto, String>{ 
	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		 super(produtoService);
		}
	}