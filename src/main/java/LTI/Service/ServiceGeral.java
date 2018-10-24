package LTI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import LTI.Interfaces.Contrato;

@Service
public abstract class ServiceGeral<T extends Contrato , X> {
	@Autowired
	protected MongoRepository<T, String> repository;

	public ServiceGeral(MongoRepository<T, String> repository) {
		this.repository = repository;
	}

	public T create(T t) {
		return (T) repository.insert(t);
	}

	public T read(T t) {

			return repository.findById(t.getId()).get();
		
	}

	public T update(T t) {
		return (T) repository.insert(t);
	}

	public boolean delete(String id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	public List<T> readAll() {
		return repository.findAll();
	}

	public T getById(String id) {
		return repository.findById(id).get();
	}

}
