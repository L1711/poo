package exe2;

import javax.swing.*;

public class Cliente {
    public int nroagencia, nroconta;
    public String nome;
    public float saldo;
    //construtores
    public Cliente() {

    }

    public Cliente(int nroconta, int nroagencia, String nome, float saldo) {
        this.nroconta = nroconta;
        this.nroagencia = nroagencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void depositar(float valor){
        this.saldo += valor;
    }
    public void sacar(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    public void exibeDetalhes(){
        JOptionPane.showMessageDialog(null, "Conta:"+ this.nroconta +
                                      "Nome: " + this.nome +
                                      "\nSaldo:"+ this.saldo);
    }

}