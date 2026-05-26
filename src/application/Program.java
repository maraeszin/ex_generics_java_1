package application;

import model.entities.Estoque;
import model.entities.MemoriaRam;
import model.entities.Peca;
import model.entities.PlacaMae;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estoque<Peca> estoque = new Estoque<>();

        System.out.print("Quantas placas-mãe serão registradas?: ");
        int qtdPM = sc.nextInt();
        sc.nextLine();

        if (qtdPM >= 1) {
            for (int i = 1; i <= qtdPM; i++) {
                System.out.println("#" + i + " placa-mãe: ");

                System.out.print("Nome: ");
                String nomePlacaMae = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidadePlacaMae = sc.nextInt();
                sc.nextLine();

                System.out.print("Valor: R$");
                double valorPlacaMae = sc.nextDouble();
                sc.nextLine();

                PlacaMae placamae = new PlacaMae(nomePlacaMae, quantidadePlacaMae, valorPlacaMae);
                estoque.adicionarPecas(placamae);
            }
        }

        System.out.println();

        System.out.print("Quantas memórias-ram serão registradas?: ");
        int qtdMR = sc.nextInt();
        sc.nextLine();

        if (qtdMR >= 1) {
            for (int i = 1; i <= qtdMR; i++) {
                System.out.println("#" + i + " memória-ram: ");

                System.out.print("Nome: ");
                String nomeMemoriaRam = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidadeMemoriaRam = sc.nextInt();
                sc.nextLine();

                System.out.print("Valor: R$");
                double valorMemoriaRam = sc.nextDouble();
                sc.nextLine();

                MemoriaRam memoriaRam = new MemoriaRam(nomeMemoriaRam, quantidadeMemoriaRam, valorMemoriaRam);
                estoque.adicionarPecas(memoriaRam);
            }
        }
        System.out.println();

        System.out.println("Estoque atualizado:");
        estoque.mostrarEstoque();

        sc.close();
    }
}
