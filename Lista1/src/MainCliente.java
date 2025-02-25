import exe2.Cliente;

import javax.swing.*;

public class MainCliente {;

    public static void main(String[] args) {
        //cria objetos do cliente
        Cliente obj1 = new Cliente();
        obj1.nroagencia = Integer.parseInt(JOptionPane.showInputDialog("Número da agencia: "));
        obj1.nroconta = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));
        obj1.nome = JOptionPane.showInputDialog("Numero da conta: ");
        Cliente obj2 = new Cliente(123456, 123, "Cleiton", 543F);
    }
}