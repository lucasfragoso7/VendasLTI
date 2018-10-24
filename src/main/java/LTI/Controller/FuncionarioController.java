package LTI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import LTI.Domain.Funcionario;
import LTI.Service.FuncionarioService;

@RequestMapping("/Funcionario")
public class FuncionarioController extends ControllerGeral<Funcionario, String>{ 
	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService) {
		 super(funcionarioService);
		}
	}
