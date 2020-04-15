package br.lasalle.opp.trab2;

import java.util.Scanner;

public class TesterFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario testerFuncionario = new Funcionario();
		Gerente testerGerente = new Gerente(123456);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastro de dados...");
		scanner.nextLine();
				
			
			while(true){
				
				System.out.println("Gerente? 1/0");
				int gerente = scanner.nextInt();
				
				if(gerente==1) {
					
					System.out.println("Insira a senha: ");
					int senha = scanner.nextInt();
					
					if(testerGerente.autentica(senha)==1) {
						
						System.out.println("Acesso Liberado");
						
						System.out.println("Informar dados...");
						scanner.nextLine();
						
						System.out.println("Nome do gerente:");
						String nome = scanner.next();
						testerGerente.setNome(nome);
						
						System.out.println("CPF: ");
						String cpf = scanner.next();
						testerGerente.setCpf(cpf);
						
						System.out.println("Salario: ");
						double salario = scanner.nextDouble();
						testerGerente.setSalario(salario);
						testerGerente.getBonificacao();
						
						System.out.println("Numero de funcionarios que vai gerenciar: ");
						int numeroDeFuncionariosGerenciados = scanner.nextInt();
						testerGerente.setNumeroDeFuncionariosGerenciados(numeroDeFuncionariosGerenciados);
						
						System.out.println("Dados...");
						scanner.nextLine();
						scanner.nextLine();
						
						testerGerente.listar();
						break;
						
						
						
					}
					else {
						System.out.println("Acesso negado");
					}
					
				
				}	
				else {
					
					
					System.out.println("Informa dados...");
					scanner.nextLine();
					
					System.out.println("Nome do Funcionario:");
					String nome = scanner.next();
					testerFuncionario.setNome(nome);
					
					System.out.println("CPF: ");
					String cpf = scanner.next();
					testerFuncionario.setCpf(cpf);
					
					System.out.println("Salario: ");
					double salario = scanner.nextDouble();
					testerFuncionario.setSalario(salario);
					testerFuncionario.getBonificacao();
					
					System.out.println("Dados...");
					scanner.nextLine();
					scanner.nextLine();
					
					testerFuncionario.listar();
					
					break;
				}
					
			}	
			System.out.println("");
			System.out.println(""
					+ 
					"***********************************\r\n" + 
					"NomeAluno: Iago Albuquerque Fiqueiredo Rodrigues matricula: 0050015542\r\n" + 
					"************************************\r\n");
			
		}			

	}

