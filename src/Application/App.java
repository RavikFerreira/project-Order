package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import EntitiesEnum.OrderStatus;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Name:" );
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Digite a dados do pedido: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order (new Date(), status, client);

        System.out.println("Quantos itens para o este pedido? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Digite a data do item #"+ i +": ");
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do Produto: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println("SÚMARIO DO PEDIDO:");
        System.out.println(order);
        
        sc.close();
    }
}
