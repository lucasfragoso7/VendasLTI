package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Venda;
import LTI.Repository.VendaRepository;
@Service
public class VendaService extends ServiceGeral<Venda>
{
	@Autowired
	public VendaService(VendaRepository repository) 
	{
		super(repository);
	}
}