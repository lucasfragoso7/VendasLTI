package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Cliente;
import LTI.Repository.ClienteRepository;
@Service
public class ClienteService extends ServiceGeral<Cliente>
{
	@Autowired
	public ClienteService(ClienteRepository repository) 
	{
		super(repository);
	}
	
	
}