package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Marca;
import LTI.Repository.MarcaRepository;
@Service
public class MarcaService extends ServiceGeral<Marca>
{
	@Autowired
	public MarcaService(MarcaRepository repository) 
	{
		super(repository);
	}
}
