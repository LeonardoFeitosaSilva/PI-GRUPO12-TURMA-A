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

    public static void jogo() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nMestre: Esta preparado a se tornar o maior heroi que uma nacao poderia ter?");
        System.out.println("Para isso, diga-me seu nome e embarcaremos nessa aventura de aprendizagem e heroismo:");
        String nome = entrada.next();
        System.out.println("\nMestre: " + nome + ", seja bem vindo ao fabuloso mundo de Aspergel!!");
        System.out.println("Aqui voce encontrara seres de todos os tipos, portanto nao se assuste e busque sempre aprender com eles. Pois lembre-se,"
                + " o conhecimento eh a chave de tudo.");
        boolean historia = false;
        do {
            System.out.println("Agora, te contarei sobre a historia da qual voce faz parte: ");
            System.out.println("1)Sim Mestre, conte-me tudo.");
            int escolha_historia = entrada.nextInt();
            if (escolha_historia == 1) {
                System.out.println("Ha algumas decadas atras, um promissor e ganancioso General de 1, dos 5 reinos mundiais resolver conquistar todos"
                        + " os demais reinos com o intuito de que todos que ali deveriam servi a um unico rei");
                Thread.sleep(8000);
                System.out.println("Os outros 4 reinos, formados por seres Elfos, Anoes, Homens e Orcs nao iriam permitir a investida daquele General,"
                        + " conhecido como Surian o Mago Negro");
                Thread.sleep(8000);
                System.out.println("Com seu poder de perssuasao Surian conseguiu convencer o reino Orc a se aliar a ele, com a condicao de que o rei "
                        + "teria um lugar cativo no Grande Salao.");
                Thread.sleep(8000);
                System.out.println("O rei Orc nao sucumbiu muito e concordou, ja que o instinto do povo Orc eh a guerra");
                Thread.sleep(8000);
                System.out.println("Os outros 3 reinos tentaram se unir, mas por questoes de ego e orgulho, cada um optou-se por montar seu plano de "
                        + "batalha individual");
                Thread.sleep(8000);
                System.out.println("O primeiro reino a ser conquistado foi o reino dos Anoes, lutaram bravamente ate suas forcas se esgotarem, porem "
                        + "o exercito de Surian era muito forte, e nao resistiram aos ataques");
                Thread.sleep(8000);
                System.out.println("Conseguiram refugiar a maioria das criancas, e todo o resto do povo foi escravizado");
                Thread.sleep(8000);
                System.out.println("Assustados com a investida de Surian, os outros 2 reinos restantes foram buscar ajuda de Magos e Feiticeiros para"
                        + " encontrarem um jeito de derrotar Surian e seu grande exercito");
                Thread.sleep(8000);
                System.out.println("Nessa procura insana por uma salvacao, um general do reino dos Homens encontrou um Mago, nada convencional, que "
                        + "revelou a ele sobre uma antiga profecia e o convenceu de que a salvacao somente seria possível com a uniao de todos"
                        + " os 4 Reinos que Surian desafiou, ou seja, precisava encontrar um motivo que unisse todos eles inclusive os Orc que eram"
                        + " aliados de Surian");
                Thread.sleep(5000);
                System.out.println("Alguns anos se passaram e Surian finalmente foi de encontro ao reino do Homens, para conquista-lo");
                Thread.sleep(8000);
                System.out.println("A batalha que durou aproximadamente 3 semanas, teve muitas mortes inclusive o rei dos Trips(reino de Surian),"
                        + " foi morto em batalha ja que ele fazia questao de lutar ao lado de seus soldados");
                Thread.sleep(8000);
                System.out.println("Com essa perca, Surian tomou o trono e passou a liderar todo seu povo e a escravizar os reinos que ja havia "
                        + "conquistado");
                Thread.sleep(8000);
                System.out.println("Os homens sobreviventes, se refugiaram em uma caverna ao lado leste proximo ao reino Elfico");
                Thread.sleep(8000);
                System.out.println("Depois de um certo periodo, Surian tentou conquistar o reino Elfico so que nao obteve muito sucesso ja que "
                        + "os Elfos eram otimos em se esconderem e se camuflarem");
                Thread.sleep(8000);
                System.out.println("Algumas decadas se passaram e eis que surge um possivel novo heroi para essa destemida historia ...");
                Thread.sleep(8000);
                System.out.println("Cujo nome estava escrito nas profecias e ele eh nada mais e nada menos que ... " + nome + " !!!");
                Thread.sleep(8000);
                historia = false;
                capitulo1();
            } else {
                historia = true;
                System.out.println("Opcao invalida!!!");
            }
        } while (historia != false);
    }
    
    public static void capitulo1() throws InterruptedException {
        System.out.println("\n*------ Capitulo I - O Despertar do guerreiro ------*");
        Thread.sleep(8000);
        System.out.println("\nMestre: Voce nao eh nada mais e nada menos que o filho de um refugiado do reino do Homens, sobrevivendo em uma "
                + "montanha e com muitas duvidas sobre o porque do mundo em que vive esta do jeito que esta.");
        Thread.sleep(8000);
        System.out.println("Com tantas duvidas e tantos questionamentos em sua cabeca o anciao de sua caverna, lhe conta tudo o que aconteceu no"
                + " passado");
        Thread.sleep(8000);
        System.out.println("Impactado com o que ouviu, voce e seu melhor amigo, Julien, acham que aquilo era apenas um delirio de um velho que "
                + "esta no final de sua vida");
        Thread.sleep(8000);
        System.out.println("Algumas semanas se passaram e seu pai foi a uma batalha junto ao grupo de resistencia de sua aldeia ...");
        Thread.sleep(8000);
        System.out.println("De 100 homens que foram a batalha apenas 2 retornaram, e com pessimas noticias. Todos os outros haviam morrido, na "
                + "tentativa de enfrentar um pequeno exertico do rei Surian.");
        Thread.sleep(8000);
        System.out.println("Inconformado com a perda de seu pai, aquele que voce enchergava como seu maior herói, voce decide se isolar daquilo "
                + "tudo por um longo periodo. Partindo em uma viagem solitaria apenas voce e o luto que carregava em seus ombros");
        Thread.sleep(8000);
        System.out.println("10 anos apos o acontecimento, Julien o encontra em uma taverna completamente embriagado e muito debilitada. Julien "
                + "havia se tornado um grande guerreiro de sua tribo, e ja voce apenas uma alcoolatra ainda dominado pelo luto");
        Thread.sleep(8000);
        System.out.println("Nesse momento Julien Indaga: ");
        Thread.sleep(4000);
        System.out.println("- Vamos meu amigo, voltemos para casa onde realmente eh seu lar");
        Thread.sleep(8000);
        System.out.println("Pelo fato de estar totalmente alcoolizado voce nao resiste muito e acaba voltando com seu melhor amigo, de onde "
                + "nunca deveria ter ido embora");
        Thread.sleep(8000);
        System.out.println("Alguns dias de passaram e Julien vai a sua para, pra ver como voce esta");
        Thread.sleep(8000);
        System.out.println("Depois de muita conversa e muitas recordacoes, seu melhor amigo o lembra da velha profecia que o antigo anciao havia"
                + " lhes contado");
        Thread.sleep(8000);
        System.out.println("Ambos decidem procurar o velho, mas haviam chegado tarde de mais");
        Thread.sleep(8000);
        System.out.println("Na casa onde morava, apenas residia uma moca muito bonita que lhe fez sentir sensacoes que nunca havia sentido");
        Thread.sleep(8000);
        System.out.println("Após alguns segundos paralisados, voce a questiona: ");
        System.out.println("- Onde esta o velho anciao que aqui?");
        Thread.sleep(8000);
        System.out.println("Aquela moca, bonita entao lhe responde: - Meu avo nao esta mais entre nos, mas ele deixou algo para lhe entregar. "
                + "Estou te esperando ha 5 anos...");
        Thread.sleep(8000);
        System.out.println("Voce e Julien ficam sem entender, e entao a moca lhe entrega um objeto e diz: - Nas maos da pessoa certa este "
                + "instrumento indicara o caminho a libertacao de todo o povo");
        Thread.sleep(8000);
        System.out.println("Ao pegar o objeto, o mesmo indica por onde sua jornada ira comecar ... ");
        Thread.sleep(8000);
        System.out.println("O caminho eh longo, Julien concorda em ir com voce mas com a condicao de que deveria treina-lo para se tornar "
                + "um guerreiro melhor do que ele...");
        Thread.sleep(8000);
        System.out.println("E entao voces partem nessa viagem em busca de resposta montados em sua carroca...");
        capitulo2();
    }
    
    public static void capitulo2() throws InterruptedException {
        System.out.println("*------ Capitulo II - O Conhecimento eh o caminho ------*");
        Thread.sleep(8000);
        System.out.println("Sua busca comeca pelo Leste, o antigo reino do anoes ...");
        Thread.sleep(8000);
        System.out.println("Os anoes eram famosos por serem bons arquitetos e construtores, mas principalmente por esconderem seus projetos "
                + "em \"numeros\" que nenhum outro ser era capaz de compreender, exceto eles mesmos.");
        Thread.sleep(8000);
        System.out.println("Eles utilizavam um sistema de conversão para todos seus projetos(pois só eles sabiam metódos de conversão), ");
        Thread.sleep(8000);
        System.out.println("e no passado um anao decidiu construir túneis(ou rotas) que interligavam todos os reinos só que esse mapa estava "
                + "completamente convertido em dois tipos de numeracao: HEXADECIMAL e BINÁRIO.");
        Thread.sleep(8000);
        System.out.println("Na reserva onde ficavam os anões refugiado, você e seu grupo depararam com um anão muito teimoso e encrenqueiro, "
                + "mas de um coração enorme chamado: Baruk");
        Thread.sleep(8000);
        System.out.println("Lhes contaram toda a história até ali vivida e o jovem anao decidiu lhes ajudar, e disse que gostaria de fazer "
                + "parte dessa jornada pois queria se tornar o herói de seu povo e ajudar libertar todos aqueles que estavam escravizados.");
        Thread.sleep(8000);
        System.out.println("O anão então lhe pergunta:");
        System.out.println("- Por onde começaremos essa grande jornada?");
        Thread.sleep(8000);
        System.out.println("E você lhe responde:");
        System.out.println("O começo da jornada está aqui em seu reino meu novo amigo. Ouvimos boatos que aqui estao as intruções para o "
                + "acesso aos túneis secretos.");
        Thread.sleep(8000);
        System.out.println("E então o anão finaliza:");
        System.out.println("- Sim, mas para acesso aos túneis teremos que obter a sabedoria de conversão dos sistemas BINARIO e HEXADECIMAL"
                + " para DECIMAL.");
        Thread.sleep(8000);
        System.out.println("A boa noticia eh que o anciao que tem o conhecimento de BINARIO esta aqui na reserva, já o que tem conhecimento"
                + " sobre HEXA teremos que descobrir juntos.");
        Thread.sleep(8000);
        System.out.println("Mestre: Todos partem de encontro com o anciao que esta refugiado na reserva... ");
        Thread.sleep(8000);
        System.out.println("O anciao concorda em ensina-los sobre a conversao binaria, mas com a condicao de todos ali aprenderem, e nao "
                + "somente o escolhido.");
        Thread.sleep(8000);
        System.out.println("Anciao: - Fazer a conversao nao eh dificil, mas exige muita concentracao. Vamos ao primeiro passo:");
        Thread.sleep(8000);
        System.out.println("Dado o numero 110 em binario, veremos que ele possui 3 algarismos. O primeiro algarismo do conjunto binario é 0,"
                + " vamos colocar o numero 2(Valor fixo para conversão de binario para decimal) elevado a posição em que ele esta. Ja que ele "
                + "e o primeiro numero a posição dele é 0");
        Thread.sleep(8000);
        System.out.println("Então 2^0. Depois iremos pegar o resultado dessa operação e multilplica pelo numero em binario, ou seja o proprio 0"
                + " para encontrarmos o valor DECIMAL desse algarismo");
        Thread.sleep(8000);
        System.out.println("2^0 = 1; 1x0=0");
        Thread.sleep(8000);
        System.out.println("O segundo algarismo é 1, e ela está na posição 1 do conjunto binario. Sabemos que o numero 2 é um valor estático "
                + "para a conversão de binário para decimal, com isso teremos: 2^1");
        Thread.sleep(8000);
        System.out.println("Agora encontraremos o valor decimal, para isso pegamos o resultado da operação 2^1 = 2, e multplicamos pelo algarismo"
                + " que ele esta representando, ou seja o BINARIO 1, que esta na posição 1");
        System.out.println("2^1 = 2; 2x1 = 2. Esse é o valor decimal do segundo numero binario que esta na posição 1 do conjunto");
        Thread.sleep(8000);
        System.out.println("O terceiro Algarismo é 1, e ele esta na posição 2 do conjunto binário. Como vimos anteriormente sempre teremos que"
                + " utilizar o numero 2 para a conversão, logo para a conversão do último numero do conjunto binário, teremos: 2^2");
        Thread.sleep(8000);
        System.out.println("Encontraremos o valor decimal desse resultado, que é o resultado da operação anterior multiplicado pelo valor do"
                + " algarismo que está representando em binario, neste caso 1");
        System.out.println("2^2 = 4; 4*1 = 4. Esse é o valor decimal do terceiro numero binario que esta na posicao 2 do conjunto");
        Thread.sleep(8000);
        System.out.println("Com todos os valores obtidos, realizaremos a soma de todos os valores e chegaremos ao resulto do numero 110(binario)"
                + " em DECIMAL: 0+2+4=6");
        Thread.sleep(8000);
        System.out.println("Portanto vale afirmar a conversão de 110(binario) equivale a 6(decimal");
        System.out.println("Ancião: - Agora que vocês aprenderam sobre binários, chegou a hora de decifrar os pergaminhos que ficaram aos meus"
                + " cuidados com a localização da passagem secreta!!!");
        String charada[] = new String[4];
        charada[0] = Desafio1BinarioVetor();
        charada[1] = Desafio2();
        System.out.println("Anciao: - Parabéns garotos!!! Vocês foram muito bem, chegou a vez de voces apredenrem sobre Hexa. No alto alto da"
                + " colina encontra-se a Anciã com habilidade em HEXA. Boa sorte a todos!");
        Thread.sleep(8000);
        System.out.println("Mestre: - Então todos partem pra colina, a procura da anciã para aprenderem sobre conversão hexadecimal...");
        Thread.sleep(8000);
        System.out.println("No alto da colina, se depararam com a mesma e contaram a ela tudo ali vivido. A atitude da anciã foi a mesma do "
                + "ancião concordou em ensinar a conversão, mas com a condição de que todos ali deveriam também aprender...");
        Thread.sleep(8000);
        System.out.println("A Anciã então começa os ensinamentos: - A conversão de HEXA para DECIMAL é bem simples, porém exige muita "
                + "concentração com as operações matemáticas ...");
        Thread.sleep(8000);
        System.out.println("O sistema hexadecimal vai de 0 a 9, após isso a letra A se torna o numero 10, B o numero 11, C o numero 12 e assim"
                + " até chegar a letra F que equivale a 15.");
        Thread.sleep(8000);
        System.out.println("Para a conversão, devemos pegar o valor 16(valor fixo para conversão) elevado a sua posição dentro do conjunto HEXA,"
                + " pegamos o resultado e multiplicamos pelo numero equivalente(em DECIMAL), por exemplo:");
        Thread.sleep(8000);
        System.out.println("A3B, sabemos B equivale a 11 agora devemos multiplica-lo por 16 elevado a sua posição. B é o primeiro do seu "
                + "conjunto, portanto sua posição equivale a 0, com isso nossa conversão para B ficaria: (16^0)*11. Realizando a operação "
                + "matematica chegamos no valor 11.");
        Thread.sleep(8000);
        System.out.println("Sabemos que 3 está na posição 1 do conjunto, portanto faremos: (16^1)*3. Realizando a operação, temos o "
                + "resultado de 48.");
        Thread.sleep(8000);
        System.out.println("Agora para finalizar, sabemos que A equivale a 10, e está na posição 2 do conjunto que foi dado como exemplo."
                + " Com isso faremos: (16^2)*10, resultando em 2560.");
        Thread.sleep(8000);
        System.out.println(" Ja que temos os valores de cada posição da do conjunto HEXA dado, iremos somá-lo : 11+48+2560 = 2619. "
                + "Ou seja, A3B em HEXA representa o numero 2619 em DECIMAL.");
        Thread.sleep(8000);
        System.out.println("Anciã: - Agora que vocês ja sabem sobre conversão de HEXA para decimal, entregarei a vocês os outros dois "
                + "pergarminhos com instruções para a localização dos túneis.");
        Thread.sleep(8000);
        charada[2] = Desafio3();
        charada[3] = Desafio4();
        System.out.println("Anciã: - Boa sorte nessa jornada. E libertem nossos povos desse sofrimento que enfrentamos a décadas!!!");
        Thread.sleep(8000);
        System.out.println("Julien então lhe diz: - Agora que temos todos os pergaminhos, finalmente descobriremos onde ficam os tuneis. "
                + "É hora de juntar todas informações: ");
        for (int i = 0; i < charada.length; i++) {
            System.out.printf(charada[i], "");
        }
        System.out.println("");
        Thread.sleep(8000);
        System.out.println("Inconformado com o que viu o Anão então indaga: - Ué mas são so numeros, não faz sentido!");
        Thread.sleep(8000);
        System.out.println("Mestre: Todos ali não sabiam mais o que fazer, e eis que surge da corroça, aquela linda moça de sua aldeia neta"
                + " do velho que havia lhe contado sobre a profecia.");
        Thread.sleep(8000);
        System.out.println("Então Maryanne diz: - Eu sei do que se trata esse conjunto de números, mas só direi se me deixarem partir nessa"
                + " jornada junto com todos");
        Thread.sleep(8000);
        System.out.println("Todos ali presente não relutam muito, já que não tinham muita escolhe e concordam em deixar ela participar");
        Thread.sleep(8000);
        System.out.println("Maryanne então revela: - Os numero são as posições de nosso alfabeto, já que todos os povos falam o mesmo idioma."
                + " Temos isso em comum, consideraremos A a letra de numero 1, e Z a letra de numero 26");
        Thread.sleep(8000);
        System.out.println("Mestre: Eis que dito isso, o conjunto de números números forma a seguinte frase: P O R Q U E A A G U A F O I P  R  E S  A");
        Thread.sleep(8000);
        System.out.println("Então você diz a todos: - Ora ora, temos uma nova charada!!");
        Thread.sleep(8000);
        System.out.println("Mestre: Ninguem sabia do que se tratava aquela charada, exceto o anão que tão logo já sabia do que se tratava");
        Thread.sleep(8000);
        System.out.println("Então o anão lhes diz: - A agua foi presa, porque matou a sede!!! E quem mata a sede do meu povo, é o poço que fica"
                + " próximo ao lago. A entrada está lá");
        Thread.sleep(8000);
        System.out.println("Mestre: Então todos partem para o poço para adentrarem aos tuneis e chegar ao reino dos anões!!!!");
        capitulo3();
    }

    static public void capitulo3() {
        System.out.println("Capitulo III - Conheceis a verdade, e a verdade vos libertara");
        System.out.println("essa eh a 1 linha, do 3 capitulo");
    }

    public static String Desafio1BinarioVetor() {
        Scanner entrada = new Scanner(System.in);
        String vetor[] = {"16 15 18 17 21 05", "15 14 17 16 20 04", "17 16 19 18 22 06", "16 15 19 16 22 04"};
        boolean acertou = false;
        String charada;
        int resposta;
        Random random = new Random();
        do {
            int l = 0;
            String compara[] = new String[3];
            for (int i = 0; i < vetor.length; i++) {
                //sorteia um índice
                int j = random.nextInt(vetor.length);
                //troca o conteúdo dos índices i e j do vetor
                String temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
            System.out.println("Selecione a alternativa que corresponde a conversao do seguinte sistema binario em decimal: 10000 1111 10010 10001 10101 101");
            for (String item : vetor) {
                l++;
                System.out.printf("%d)%s\n", l, item);
                for (int a = 0; a < vetor.length - 1; a++) {
                    compara = vetor;
    
                }
            }
            resposta = entrada.nextInt();
            switch (resposta) {
                case 1:
                    if ("16 15 18 17 21 05".equals(compara[0])) {
                        System.out.println("Sua resposta esta correta\n");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente!\n");
                    }
                    break;
                case 2:
                    if ("16 15 18 17 21 05".equals(compara[1])) {
                        System.out.println("Sua resposta esta correta\n");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente!\n");
                    }
                    break;
                case 3:
                    if ("16 15 18 17 21 05".equals(compara[2])) {
                        System.out.println("Sua resposta esta correta\n");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente!\n");
                    }
                    break;
                case 4:
                    if ("16 15 18 17 21 05".equals(compara[3])) {
                        System.out.println("Sua resposta esta correta\n");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente!\n");
                    }
                    break;
                default:
                    System.out.println("Seleciona alternativa de 1 a 4\n");
            }
        } while (acertou == false);
        return charada = "16 15 18 17 21 05 ";
    }

    public static String Desafio2() {
        Scanner entrada = new Scanner(System.in);
        char resposta;
        String a = "3 3 9 23 3";
        String b = "0 0 6 20 0";
        String c = "2 2 8 22 2";
        String d = "1 1 7 21 1";
        String result = d;
        String charada;
        boolean resp = false;
        do {
            System.out.println("Converta os seguintes números binarios em decimal: 01 01 111 10101 01");
            List<String> list = Arrays.asList(a, b, c, d);
            Collections.shuffle(list);
            Collections.shuffle(list);
            Collections.shuffle(list);
            System.out.println("A) " + list.get(0));
            System.out.println("B) " + list.get(1));
            System.out.println("C) " + list.get(2));
            System.out.println("D) " + list.get(3) + "\n");
            String letra = entrada.next();
            resposta = letra.charAt(0);
    
            switch (resposta) {
                case 'a', 'A' -> {
                    if (list.get(0).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'b', 'B' -> {
                    if (list.get(1).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'c', 'C' -> {
                    if (list.get(2).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'd', 'D' -> {
                    if (list.get(3).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                default ->
                    System.out.println("RESPOSTA INCORRETA, SELECIONE UMA ALTERNATIVA ENTRE A e D \n");
            }
        } while (resp == false);
        return charada = "1 1 7 21 1 ";
    }

    public static String Desafio3() {
        Scanner entrada = new Scanner(System.in);
        char resposta;
        String a = "6 15 9";
        String b = "5 14 8";
        String c = "6 14 9";
        String d = "6 16 9";
        String result = "6 15 9";
        String charada;
        boolean resp = false;
        do {
            System.out.println("Converta o seguinte sistema HEXADECIMAL para DECIMAL : 6 F 9");
            List<String> list = Arrays.asList(a, b, c, d);
            Collections.shuffle(list);
            Collections.shuffle(list);
            Collections.shuffle(list);
            System.out.println("A) " + list.get(0));
            System.out.println("B) " + list.get(1));
            System.out.println("C) " + list.get(2));
            System.out.println("D) " + list.get(3) + "\n");
            String letra = entrada.next();
            resposta = letra.charAt(0);
    
            switch (resposta) {
                case 'a', 'A' -> {
                    if (list.get(0).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'b', 'B' -> {
                    if (list.get(1).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'c', 'C' -> {
                    if (list.get(2).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                case 'd', 'D' -> {
                    if (list.get(3).equals(result)) {
                        System.out.println("RESPOSTA CORRETA!\n");
                        resp = true;
                    } else {
                        System.out.println("Resposta Incorreta\n");
                    }
                }
                default ->
                    System.out.println("RESPOSTA INCORRETA, SELECIONE UMA ALTERNATIVA ENTRE A e D \n");
            }
        } while (resp == false);
        return charada = "6 15 9 ";
    }
}
