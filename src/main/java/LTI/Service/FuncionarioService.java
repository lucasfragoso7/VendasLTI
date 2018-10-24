package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Funcionario;
import LTI.Repository.FuncionarioRepository;

@Service
public class FuncionarioService extends ServiceGeral<Funcionario, String>
{
	@Autowired
	public FuncionarioService(FuncionarioRepository repository) 
	{
		super(repository);
	}
}

