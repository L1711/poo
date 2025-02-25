import exe1.Aluno;


import javax.swing.*;

public class MainAluno {
    public static void main(String[] args){
        Aluno obj1 = new Aluno();
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("numero do aluno: "));
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("idade: "));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("p1: "));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("P2: "));
        obj1.nome = (JOptionPane.showInputDialog("Nome: "));
        obj1.dadosAluno();
        System.out.println(obj1.nome + " " + obj1.passou());

        Aluno obj2 = new Aluno("Fulano",123,19, 6F,8.5F);
        obj2.dadosAluno();
        System.out.println(obj2.nome + " " + obj2.passou());
    }

}