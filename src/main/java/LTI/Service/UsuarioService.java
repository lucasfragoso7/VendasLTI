package LTI.Service;

import org.springframework.beans.factory.annotation.Autowired;

import LTI.Domain.Usuario;
import LTI.Repository.UsuarioRepository;

public class UsuarioService extends ServiceGeral<Usuario, String>
{
	@Autowired
	public UsuarioService(UsuarioRepository repository) 
	{
		super(repository);
	}
}
