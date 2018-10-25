package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTI.Domain.Usuario;
import LTI.Repository.UsuarioRepository;
@Service
public class UsuarioService extends ServiceGeral<Usuario>
{
	@Autowired
	public UsuarioService(UsuarioRepository repository) 
	{
		super(repository);
	}
}
