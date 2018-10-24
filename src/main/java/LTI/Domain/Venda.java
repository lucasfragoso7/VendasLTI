package LTI.Domain;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import LTI.Interfaces.Contrato;

@Document
public class Venda implements  Contrato {
	@Id
	private String id;
	@DBRef
	private Cliente cliente;
	@DBRef
	private Funcionario funcionario;
	private  Double valorTotal;
	@DBRef
	private ArrayList<Pedido> Pedidos;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Pedido> getPedidos() {
		return Pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		Pedidos = pedidos;
	}

}
