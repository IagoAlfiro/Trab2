package br.lasalle.opp.trab2;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public void getBonificacao() {
		this.salario*=1.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;		
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	public void listar() {
		System.out.println(toString());
	}
	
	

}
