package LTI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import LTI.Domain.Marca;
@Repository
public interface MarcaRepository extends MongoRepository<Marca,String>  {

}
