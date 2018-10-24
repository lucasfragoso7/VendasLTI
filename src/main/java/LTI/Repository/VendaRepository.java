package LTI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import LTI.Domain.Venda;
@Repository
public interface VendaRepository  extends MongoRepository<Venda,String>  {

}
