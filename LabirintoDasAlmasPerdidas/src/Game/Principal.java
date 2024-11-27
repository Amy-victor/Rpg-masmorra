import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Personagem p1 = new Personagem();
        
       Monstros m1 = new Monstros();

    }   

        }

    public static int mana(){
        int guarde;
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

            default:
                break;
        }
    }
        

}
