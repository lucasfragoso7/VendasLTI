package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;

import LTI.Domain.Cliente;
import LTI.Repository.ClienteRepository;

public class ClienteService extends ServiceGeral<Cliente, String>
{
	@Autowired
	public ClienteService(ClienteRepository repository) 
	{
		super(repository);
	}
}