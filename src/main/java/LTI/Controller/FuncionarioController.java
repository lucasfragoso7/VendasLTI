package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LTI.Domain.Funcionario;
import LTI.Service.FuncionarioService;
@RestController 
@RequestMapping("/funcionario")
public class FuncionarioController extends ControllerGeral<Funcionario>{ 
	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService) {
		 super(funcionarioService);
		}
	}
