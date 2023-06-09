package ProdutoServico;

//Classe Lavagem criada/revisada por todos os integrantes do grupo: Naty, Juju e Suda

public class Lavagem {
	
	public static void realizarLavagem(int escolhaCliente) {
	
	double precoPequeno = 20.00;
	double precoMedio = 25.00;
	double precoGrande = 30.00;
	double precoFora = 15.00;
	double tipoLavagem;
	
		if(escolhaCliente == 1) {
			tipoLavagem = precoPequeno;
			System.out.printf("Foi realizada a lavagem do carro pequeno, no valor de R$ %2f%n", precoPequeno);
		} else if (escolhaCliente == 2) {
			tipoLavagem = precoMedio;
			System.out.printf("Foi realizada a lavagem do carro médio, no valor de R$ %2f%n", precoMedio);
		}else if(escolhaCliente == 3) {
			tipoLavagem = precoGrande;
			System.out.printf("Foi realizada a lavagem do carro grande, no valor de R$ R$ %2f%n", precoGrande);
		} else if (escolhaCliente == 4){ 
				tipoLavagem = precoFora;
				System.out.printf("Foi realizada a lavagem por fora do carro (Ducha), no valor de R$ %2f%n", precoFora);
		} else {
				System.out.println("Opção inválida! Por favor, reinicie e escolha um tipo de lavagem disponível: Pequeno, Médio, Grande ou Personalizado");
		}
	}
}
