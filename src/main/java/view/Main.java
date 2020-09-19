package view;

import controller.ClienteController;
import model.Cliente;

import java.util.List;

public class Main {
    public static void main(String args[]){
        ClienteController controller = new ClienteController();

        List<Cliente> clients = controller.findAll();
        for(Cliente client : clients){
            System.out.println(client.toString());
        }

        controller.insert(7, "Deus", "000.000.000-00", "2000.222.333-7");
        System.out.print("\n--------------------------");
        clients = controller.findAll();
        for(Cliente client : clients){
            System.out.println(client.toString());
        }

        controller.update(7, "aiaiai", "0", "0");
        System.out.print("\n--------------------------");
        clients = controller.findAll();
        for(Cliente client : clients){
            System.out.println(client.toString());
        }

        controller.delete(7);
        System.out.print("\n--------------------------");
        clients = controller.findAll();
        for(Cliente client : clients){
            System.out.println(client.toString());
        }
    }
}
