/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author user
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

/*import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
 */
public class ProjetoIntegrador {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        //int seleciona_menu;
        System.out.printf("\nMestre: Esta pronto para a maior aventura ja vivida na terra média ?");
        System.out.println("\n1 - Sim | 2 - Nao ");
        int escolha = entrada.nextInt();
        if (escolha == 1) {
            System.out.println("Sábia escolha, comecaremos agora!!!");
        } else if (escolha == 2) {
            System.out.println("Desistir agora nao eh uma opcao meu caro, voce ja esta dentro do jogo e so nos resta jogar, ha ha ha.");
        } else {
            System.out.println("Nao adianta digitar outra opcao, o seu destino esta selado!");
        }
        menu();

    }

    public static void menu() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int seleciona_menu;
        do {
            System.out.println("\n1)Jogar\n2)Capitulos\n3)Creditos\n4)Sair");
            seleciona_menu = entrada.nextInt();
            switch (seleciona_menu) {
                case 1:
                    jogo();
                    break;
                case 2:
                    capitulos();
                    break;
                case 3:
                    creditos();
                case 4:
                    break;
                default:
                    System.out.println("\nEssa opcao nao existe, digite novamente: ");
            }
        } while (seleciona_menu != 1 && seleciona_menu != 2 && seleciona_menu != 3 && seleciona_menu != 4);
    }

    public static void capitulos() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int escolha_capitulo;
        System.out.println("\n    Em Busca do conhecimento perdido - Capitulos ");
        do {
            System.out.println("\n1) O despertar do guerreio\n2) O conhecimento eh a verdade\n3) Conheceis a verdade, e a verdade vos libertara\n4) Voltar");
            escolha_capitulo = entrada.nextInt();
            switch (escolha_capitulo) {
                case 1:
                    capitulo1();
                    break;
                case 2:
                    capitulo2();
                    break;
                case 3:
                    capitulo3();
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Capitulo invalido, digite novamente: ");
            }
        } while (escolha_capitulo != 1 && escolha_capitulo != 2 && escolha_capitulo != 3 && escolha_capitulo != 4);
    }

    public static void creditos() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
        System.out.println("\n\n //  Criadores \\\\  \nLeonardo Feitosa da Silva \nDanilo Barbosa");
        do {
            System.out.println("\n2)Sair");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 2) {
                menu();
            } else {
                System.out.println("\nSelecao invalida, digite novamente: ");
            }
        } while (escolha_menu != 2);
    }
}
