package LTI.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Categoria;
import LTI.Repository.CategoriaRepository;
@Service
public class CategoriaService extends ServiceGeral<Categoria, String>
{
	@Autowired
	public CategoriaService(CategoriaRepository repository) 
	{
		super(repository);
	}
}
