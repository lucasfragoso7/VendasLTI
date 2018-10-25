package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Produto;
import LTI.Repository.ProdutoRepository;

@Service
public class ProdutoService extends ServiceGeral<Produto>
{
	@Autowired
	public ProdutoService(ProdutoRepository repository) 
	{
		super(repository);
	}
}