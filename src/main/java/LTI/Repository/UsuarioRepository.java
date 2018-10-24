package LTI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import LTI.Domain.Usuario;
@Repository
public interface UsuarioRepository  extends MongoRepository<Usuario,String>  {

}
