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

    
}
