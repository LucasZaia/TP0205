package Pedidos;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import Pizza.IPizza;

public class DiaFiscal {
	private Date diaPedido;
	private List<Ipedidos<?,?>> pedidos = new ArrayList<Ipedidos<?,?>>();
	
	
	private DiaFiscal() {
		diaPedido = new Date();
	}
	
	
	public static DiaFiscal Build() {
		return new DiaFiscal();
	}
	
	
	public Date getDiaPedido() {
		return diaPedido;
	}
	
	public void addPedidosDia(Ipedidos<?,?> pedido){
		pedidos.add(pedido);
	}
	
	public List<Ipedidos<?,?>> getPedidos() {
		return pedidos;
	}
	
}
