package Questao04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        String titulo;
        String autor;
        char disponibilidade;

        int opcao;

        while(true){
            System.out.println("Opções:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Status dos livros");
            System.out.println("0 - Encerrar programa");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            if(opcao == 1){
                Livro livro = new Livro();

                System.out.print("Digite o título do livro: ");
                titulo = input.next();
                input.nextLine();
                livro.setTitulo(titulo);
                System.out.print("Digite o nome do autor: ");
                autor = input.next();
                input.nextLine();
                livro.setAutor(autor);
                System.out.print("O livro está disponível? (S/n): ");
                disponibilidade = input.next().charAt(0);

                if(disponibilidade == 'S' || disponibilidade == 's')
                    livro.setDisponivel(true);
                else
                    livro.setDisponivel(false);
                
                livros.add(livro);
            }else if(opcao == 2){
                for (Livro l : livros) {
                    System.out.printf("Título: %s\n", l.getTitulo());
                    System.out.printf("Autor: %s\n", l.getAutor());
                    System.out.printf("Status: %s\n", l.verificarDisponibilidade());
                    System.out.println();
                }
            }else{
                System.out.println("Programa encerrado!");
                break;
            }
        }
        input.close();
    }
}
