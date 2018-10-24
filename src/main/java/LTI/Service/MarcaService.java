package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;

import LTI.Domain.Marca;
import LTI.Repository.MarcaRepository;

public class MarcaService extends ServiceGeral<Marca, String>
{
	@Autowired
	public MarcaService(MarcaRepository repository) 
	{
		super(repository);
	}
}
