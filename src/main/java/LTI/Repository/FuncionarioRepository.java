package LTI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import LTI.Domain.Funcionario;
@Repository
public interface FuncionarioRepository  extends MongoRepository<Funcionario,String> {

}
