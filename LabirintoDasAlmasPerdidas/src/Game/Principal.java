import java.util.Random;
import java.util.Scanner;

public class Principal {
    //área de carregar as variáveis
    static Scanner scanner = new Scanner(System.in);
    static Random rolagem = new Random();
    static boolean teste;
    static Personagem p1 = new Personagem();
    static Monstros m1 = new Monstros();
    static int resposta, diff;
                public static void main(String[] args) {
                    teste = moeda();
                    System.out.println("Você ganhou?"+teste);
                } 
                //procedimento para limpar a tela
                public static void clear(){
                for(int i = 0; i<100; i++){
                    System.out.println("");
                }  
            }
                //procedimento de rolagens
                public static boolean moeda(){
                    int i = 1;
                    boolean acerto = false;
                    int d2 = 0;
                    while (i == 1) {
                    System.out.println("1- Cara");
                    System.out.println("2- Coroa");
                    resposta = scanner.nextInt();
                    switch (resposta) {
                        case 1:
                        i = 2;
                       d2 = rolagem.nextInt(2)+1;
                        if (d2 == 1) {
                            System.out.println("Cara!!!");
                            acerto = true;
                        }else{
                            System.out.println("Coroa...");
                            acerto = false;
                        }
                            break;
                        case 2:
                        i = 2;
                        d2 = rolagem.nextInt(2)+1;
                        if (d2 == 2) {
                            System.out.println("Coroa!!!");
                            acerto = true;
                        }else{
                            System.out.println("Cara...");
                            acerto = false;
                        }
                            break;
                        default:
                        System.out.println("Não há essa escolha.");
                            break;
                    }
                }
                return acerto;
                }
                public static boolean testeForca(){
                    int d6 = rolagem.nextInt(6)+1+p1.forca;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }
                public static boolean testeDestreza(){
                    int d6 = rolagem.nextInt(6)+1+p1.destreza;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }
                public static boolean testeConstituicao(){
                    int d6 = rolagem.nextInt(6)+1+p1.constituicao;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }
                public static boolean testeSabedoria(){
                    int d6 = rolagem.nextInt(6)+1+p1.sabedoria;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }
                public static boolean testeInteligencia(){
                    int d6 = rolagem.nextInt(6)+1+p1.inteligencia;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }
                public static boolean testeCarisma(){
                    int d6 = rolagem.nextInt(6)+1+p1.carisma;
                    boolean acerto = false;
                    switch (diff) {
                        //Dificuldade Simples
                        case 1:
                        if (d6 >= 4) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Média
                        case 2:
                        if (d6 >= 6) {
                            acerto = true;
                        }
                            break;
                        //Dificuldade Complexa
                        case 3:
                        if (d6 >= 8) {
                            acerto = true;
                        }
                            break;
                        default:
                            break;
                    }
                    System.out.println(d6);
                    return acerto;
                }

    //procedimentos para status
    public static int mana(){
        int guarde = 0;
            switch (p1.classe) {
            case "Guerreiro":
            guarde = p1.manaMaxima+4+p1.sabedoria;
                break;
            case "Mago":
            guarde = p1.manaMaxima+8+p1.sabedoria*3;
                break;
            case "Bardo":
            guarde = p1.manaMaxima+6+p1.sabedoria*2;
                break;
            case "Paladino":
            guarde = p1.manaMaxima+6+p1.sabedoria*2;
                break;
            case "Ladino":
            guarde = p1.manaMaxima+4+p1.sabedoria*2;
                break;
            case "Clérigo":
            guarde = p1.manaMaxima+8+p1.sabedoria*3;
                break;
            case "Druida":
            guarde = p1.manaMaxima+8+p1.sabedoria*2;
                break;
            case "Barbáro":
            guarde = p1.manaMaxima+8+p1.sabedoria;
                break;
            default:
                break;
            }
            return guarde;
    }
    public static int hp(){
        int guarde = 0;
        switch (p1.classe) {
            case "Guerreiro":
            guarde = p1.vidaMaxima+20+p1.constituicao*5;
                break;
            case "Mago":
            guarde = p1.vidaMaxima+8+p1.constituicao*3;
                break;
            case "Bardo":
            guarde = p1.vidaMaxima+10+p1.constituicao*4;
                break;
            case "Paladino":
                guarde = p1.vidaMaxima+28+p1.constituicao*5;
                break;
            case "Ladino":
                guarde = p1.vidaMaxima+13+p1.constituicao*4;
                break;
            case "Clérigo":
                guarde = p1.vidaMaxima+8+p1.constituicao*3;
                break;
            case "Druida":
                guarde = p1.vidaMaxima+12+p1.constituicao*4;
                break;
            case "Barbáro":
                guarde = p1.vidaMaxima+23+p1.constituicao*5;
                break;
            default:
                break;
            }
            return guarde;
    }
    public static int defesa(){
        int guarde = 4+p1.destreza+p1.defesa;
        return guarde;
    }
}