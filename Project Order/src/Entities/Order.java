package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import EntitiesEnum.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> itens = new ArrayList<>();
    
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
    public Date getMoment() {
        return moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItem(OrderItem item){
        itens.add(item);
    }
    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public Double total(){
        double soma = 0.0;
        for(OrderItem item: itens){
            soma += item.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(moment)+ "\n"); 
        sb.append("Status do Pedido: ");
        sb.append(status+ "\n");    
        sb.append("Cliente: " );
        sb.append(client +"\n");  
        sb.append("Itens do Pedido: ");
        for(OrderItem item : itens){
            sb.append(item + "\n");
        }
        sb.append("Preço total: $" );
        sb.append(String.format("%.2f" ,total()));
 
        return sb.toString();
    }
    
}
