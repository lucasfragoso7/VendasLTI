package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;

import LTI.Domain.Produto;
import LTI.Repository.ProdutoRepository;


public class ProdutoService extends ServiceGeral<Produto, String>
{
	@Autowired
	public ProdutoService(ProdutoRepository repository) 
	{
		super(repository);
	}
}