package br.lasalle.opp.trab2;

public class Gerente extends Funcionario {
	
	
	private int senhaEspecial;
	private int numeroDeFuncionariosGerenciados;
	
	
	
	public Gerente(int senhaEspecial) {
		super();
		this.senhaEspecial = senhaEspecial;
	}

	public void getBonificacao() {
		super.getBonificacao();
		setSalario(1000 + getSalario());
	}
	
	public int autentica(int senha) {
		if(senha==this.senhaEspecial) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	
	@Override
	public String toString() {
		return "Gerente [nome=" + getNome() + ", cpf=" + getCpf() + ", salario=" + getSalario() + ", numeroDeFuncionariosGerenciados=" + numeroDeFuncionariosGerenciados + "]";
	}

	public void listar() {
		System.out.println(toString());
	}
	
	
	

}
