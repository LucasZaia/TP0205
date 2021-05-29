package Sistema;



import Cliente.Cliente;
import Cliente.Endereco;
import Factorys.FactoryIngrediente;
import Factorys.FactoryPizza;
import Pedidos.DiaFiscal;
import Pedidos.Ipedidos;
import Pedidos.PedidoPizza;
import Pizza.IPizza;
import enums.EnumIngredient;
import enums.Enums;

public class Principal {

	public static void main(String[] args) {
		
		
		DiaFiscal diafiscal = DiaFiscal.Build();
		
		Ipedidos<PedidoPizza, IPizza> pedido = PedidoPizza.Build()
				.setCliente(
				Cliente.Build()
				.setCpf("5436546546")
				.setEndereco(
					Endereco.Build()
						.setBairro("Florecer")
						.setCidade("São Paulo")
						.setNumero(12)
						.setRua("Ipes")
					)
				.setNome("José")
				.setSobrenome("Cabral")
				)
				.addItem(FactoryPizza.BuildPizza(Enums.PizzaCalabresa)
				.AddIngredientes(FactoryIngrediente.Build(EnumIngredient.IngredienteTomate)
						.setIngredientQuantidade(13))
				.setValor(40.50));
				
			
		diafiscal.addPedidosDia(pedido);
	
		System.out.println("Pedido Efetuado em: " + diafiscal.getDiaPedido());
		
		for(Ipedidos<?,?> pedidos: diafiscal.getPedidos()) {
			System.out.println("CPF: " + pedidos.getCliente().getCpf());
			System.out.println("Cliente: " + pedidos.getCliente().getNome() + " " + 
			pedidos.getCliente().getSobrenome());
			System.out.println("Endereco Rua: " + pedidos.getCliente()
			.getEndereco().getEnderecoCompleto());
			System.out.println("Valor Total do Pedido: " + pedidos.getTotal());
						
		}
											
	}

}