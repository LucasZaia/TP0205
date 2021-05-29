package Pedidos;
import java.util.Date;
import Cliente.Cliente;
import Pizza.IPizza;
import java.util.ArrayList;
import java.util.List;


public class PedidoPizza implements Ipedidos<PedidoPizza, IPizza> {
	private Cliente cliente;
	private List<IPizza> pizzas = new ArrayList<IPizza>();
	private Date data;
	
	public static PedidoPizza Build() {
		return new PedidoPizza();
	}
	
	private PedidoPizza() {
		data = new Date(); 
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public PedidoPizza setCliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}
	
	public void addPedidoPizzas(IPizza pizza){
		pizzas.add(pizza);
	}
	
	public Date getData() {
		return data;
	}
	
	@Override
	public IPizza getItem(int item) {
		return pizzas.get(item); 
	}

	@Override
	public PedidoPizza addItem(IPizza item) {
		pizzas.add(item);
		return this;
	}

	@Override
	public double getTotal() {
		double total = 0.0;
		for(IPizza pizz : pizzas) {
			
			total += pizz.getValor();
		}
		return total;
	}

	@Override
	public List<IPizza> getItens() {
		return pizzas;
	}
	
}
