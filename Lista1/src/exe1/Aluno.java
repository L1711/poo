package exe1;

import javax.swing.*;
    public class Aluno {
        public int numeroAluno, idade;
        public float p1,p2;
        public String nome;

        public Aluno(){
            this.nome = "indefinido";
        }

        public Aluno(String nome, int numeroAluno, int idade, float p1,float p2) {
            this.nome = nome;
            this.numeroAluno = numeroAluno;
            this.idade = idade;
            this.p1 = p1;
            this.p2 = p2;
        }
        public float notaFinal(){
            return (this.p1 + this.p2) / 2 ;
        }
        public void dadosAluno(){
            System.out.println("\nNumero do aluno: " + this.numeroAluno +
                               "\nNome:" + this.nome+
                               "\nIdade:" + this.idade+
                               "\nMédia final: " + this.notaFinal());
        }
        public String passou(){
            //operador ternário
            return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
        }

    }

