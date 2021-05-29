package Pedidos;

import java.util.List;
import java.util.Date;

import Cliente.Cliente;

public interface Ipedidos<T,Y> {
	public T setCliente(Cliente cliente);
	public Cliente getCliente();
	public Date getData();
	public Y getItem(int item);
	public T addItem(Y item);
	public double getTotal();
	public List<Y> getItens();
	
}
