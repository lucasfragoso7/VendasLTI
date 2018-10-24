package LTI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import LTI.Domain.Categoria;
@Repository
public interface CategoriaRepository  extends MongoRepository<Categoria,String>  {

}
