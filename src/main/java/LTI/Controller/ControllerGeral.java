package LTI.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import LTI.Interfaces.Contrato;
import LTI.Service.ServiceGeral;

@RestController 
public abstract class ControllerGeral<T extends Contrato, X> { 
	private ServiceGeral<T, X> services;  
 
	@Autowired 
 	public ControllerGeral(ServiceGeral<T, X> services) { 
  		this.services = services; 
  	} 
	@GetMapping("/")
	public List<T> readAll() {
		return services.readAll();
	}
	@GetMapping("/{id}") 
	public ResponseEntity<String> getById(@PathVariable String id) { 
	  		services.getById(id); 
	  		return new ResponseEntity<String>(id, HttpStatus.OK); 
	} 
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable String id){
		services.delete(id);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<T> create(@Valid @RequestBody T t) {
		services.create(t);
		return new ResponseEntity<T>(t, HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<T> update(@RequestBody T t){
		services.update(t);
		return new ResponseEntity<T>(t, HttpStatus.OK);
	}



}
