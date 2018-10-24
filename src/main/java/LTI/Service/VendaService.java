package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;

import LTI.Domain.Venda;
import LTI.Repository.VendaRepository;

public class VendaService extends ServiceGeral<Venda, String>
{
	@Autowired
	public VendaService(VendaRepository repository) 
	{
		super(repository);
	}
}