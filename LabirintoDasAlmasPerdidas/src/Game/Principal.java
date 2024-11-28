import java.util.Random;
import java.util.Scanner;

public class Principal {
    //área de carregar as variáveis
    static Scanner scanner = new Scanner(System.in);
    static Random rolagem = new Random();
    static Personagem p1 = new Personagem();
    static Monstros m1 = new Monstros();
    static int resposta;
                @SuppressWarnings("unused")
                public static void main(String[] args) {
            
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
                        default:
                        System.out.println("Não há essa escolha.");
                            break;
                    }
                }
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
                guarde = p1.manaMaxima+8*+p1.sabedoria;
                break;
            default:
                break;
        }
        return guarde;
    }
}