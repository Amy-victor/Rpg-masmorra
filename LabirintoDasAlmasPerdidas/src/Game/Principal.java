import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Principal {
    // área de carregar as variáveis
    static Scanner scanner = new Scanner(System.in);
    static Random rolagem = new Random();
    static boolean teste, combate;
    static Personagem p1 = new Personagem();
    static Monstros[] monstro = new Monstros[5];
    static int resposta, diff, ameaca, dificuldade; // diff = para testes, dificuldade = para o jogo,
    static Timer timer = new Timer();

    public static void main(String[] args) {
        boolean secret = false;
        // Carregamento dos Monstros

        monstro[0] = new Monstros();
        monstro[1] = new Monstros();
        monstro[2] = new Monstros();
        monstro[3] = new Monstros();
        monstro[4] = new Monstros();
        resposta = 0;
        dificuldade = 2; // 1 = fácil | 2 = Médio | 3 = Difícil | 2 é a dificuldade padrão
        // Tela inicial
        do {
            System.out.println("                     ________________________________    ");
            System.out.println("                    |=~Labirinto Das Almas Perdidas~=| ");
            System.out.println("                     ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯        ");
            System.out.println("                              ~                             ");
            System.out.println("                                  `            ");
            System.out.println("                          ~~                 ");
            System.out.println("                   ~~         (~~|                      ");
            System.out.println("               ~~~~             / \\            ~       ");
            System.out.println("          vvv                  / o \\      ~~~         ");
            System.out.println("             vv    __   ~~   _/_____\\_       (\\/)        ");
            System.out.println("                   /\\         |~~~~~|         /\\          ");
            System.out.println("                  /__\\        |~~~~~|        /__\\       * ");
            System.out.println("                  |**|        |~~~~~| v      |**|        ");
            System.out.println("                  |**|        |~~~~~|        |**|         ");
            System.out.println("                  |**|        |~~_~~|        |**|         ");
            System.out.println("                  |**|        |~/|\\~|        |**|v      ");
            System.out.println("                 /````\\       |/|||\\|       /````\\         ");
            System.out.println("                /______\\    v |||||||      /______\\         ");
            System.out.println("                |      |      |-----|      |      |");
            System.out.println("               /````````\\/\\/\\/```````\\/\\/\\/````````\\  ");
            System.out.println("               |________|_____|_____|_____|________|       ");
            System.out.println("               |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|       ");
            System.out.println("               |~\\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/~|   ");
            System.out.println("               |~~\\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/~~|              ");
            System.out.println("               |~~~\\~~~~~~~~~~~~~~~~~~~~~~~~~~~/~~~|            ");
            System.out.println("        `      |~~~~\\~~~~~~~~~~~~~~~~~~~~~~~~~/~~~~|   .");
            System.out.println("               |~~~~~\\~~~~~~~~~~~~~~~~~~~~~~~/~~~~~|   ");
            System.out.println("               |~~~~~~\\_____________________/~~~~~~|   ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("     ~~        |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~| _  ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|/ ^  ");
            System.out.println("               |~~~~~~~|||||||||||||||||||||~~~~~~~|   ");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("       dica: aperte enter para passar os diálogos");
            System.out.println("            __________    _______________    _______       ");
            System.out.println("           |1- Iniciar|  |2- Configuração|  |3- Sair|");
            System.out.println("            ¯¯¯¯¯¯¯¯¯¯    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    ¯¯¯¯¯¯¯      ");
            System.out.println("                                                 Feito por: Amy P. ");
            resposta = scanner.nextInt();
            switch (resposta) {
                case 1:
                    resposta = 1;
                    break;
                case 2:
                    clear();
                    do {
                        System.out.println("-------------------------------------------");
                        System.out.println("|               Dificuldade               |");
                        System.out.println("|    1- Fácil ~ 2- Médio ~ 3- Díficil     |");
                        System.out.println("|                                         |");
                        System.out.println("|   ~4- Sair~              ~5- Código~    |");
                        System.out.println("-------------------------------------------");
                        resposta = scanner.nextInt();
                        switch (resposta) {
                            case 1:
                                resposta = 2;
                                dificuldade = 1;
                                break;
                            case 2:
                                resposta = 2;
                                dificuldade = 2;
                                break;
                            case 3:
                                resposta = 2;
                                dificuldade = 3;
                                break;
                            case 5:
                                clear();
                                while (resposta == 5) {
                                    System.out.print("Digite o Código:");
                                    String codigo = scanner.nextLine();
                                    if (codigo == "joão, entre o céu e a terra, você sempre será o mais honrado.") {
                                        secret = true;
                                        System.out.println("Você adquiriu a classe 'Honrado'");
                                        resposta = scanner.nextInt();
                                        resposta = 2;
                                    } else {
                                        clear();
                                        System.out.println("Código errado, deseja tentar novamente?");
                                        System.out.println("          1- sim | 2- não");
                                        resposta = scanner.nextInt();
                                        clear();
                                        if (resposta == 1) {
                                            resposta = 5;
                                        }
                                    }
                                }
                            default:
                                resposta = 0;
                                break;
                        }
                        clear();
                    } while (resposta == 2);
                    break;
                default:
                    clear();
                    System.out.println();
                    System.out.println();
                    System.out.println("                  ______________");
                    System.out.println("                 |Fim de Jogo...|");
                    System.out.println("                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ");
                    System.exit(0);
                    break;
            }
        } while (resposta == 0);
        clear();
        // nome do personagem
        System.out.println("              ____________________");
        System.out.println("             |+Nome do Personagem+|");
        System.out.println("              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.print("                Nome:");
        p1.nome = scanner.nextLine();
        clear();
        // Distribuição de atributos
        for (int i = 0; i < 4; i++) {
            System.out.println("                ___________________________");
            System.out.println("               |\\Distribuição de Atributos/|");
            System.out.println("                ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ");
            System.out.println();
            System.out.println("Você tem " + (5 - i) + " pontos para distribuir, sendo o máximo 3.");
            System.out.println();
            System.out.println("                   __________________________");
            System.out.println("                  |Força:" + p1.forca + "           ");
            System.out.println("                  |Destreza:" + p1.destreza + "        ");
            System.out.println("                  |Constituição:" + p1.constituicao + "    ");
            System.out.println("                  |Sabedoria:" + p1.sabedoria + "       ");
            System.out.println("                  |Inteligência:" + p1.inteligencia + "    ");
            System.out.println("                  |Carisma:" + p1.carisma + "         ");
            System.out.println("                   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println();
            System.out.println();
            System.out.println(
                    "{1- Força} {2- Destreza} {3- Constituição} {4- Sabedoria} {5- Inteligência} {6- Carisma}");
            resposta = scanner.nextInt();
            clear();
            if (i < 2) {
                switch (resposta) {
                    case 1:
                        p1.forca = p1.forca++;
                        break;
                    case 2:
                        p1.destreza = p1.destreza++;
                        break;
                    case 3:
                        p1.constituicao = p1.constituicao++;
                        break;
                    case 4:
                        p1.sabedoria = p1.sabedoria++;
                        break;
                    case 5:
                        p1.inteligencia = p1.inteligencia++;
                        break;
                    case 6:
                        p1.carisma = p1.carisma++;
                        break;
                    default:
                        i = i--;
                        System.out.println("Opção não encontrada, favor escolher alguma possível");
                        break;
                }
            } else {
                switch (resposta) {
                    case 1:
                        if (p1.forca >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.forca = p1.forca++;
                        }
                        break;
                    case 2:
                        if (p1.destreza >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.destreza = p1.destreza++;
                        }
                        break;
                    case 3:
                        if (p1.constituicao >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.constituicao = p1.constituicao++;
                        }
                        break;
                    case 4:
                        if (p1.sabedoria >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.sabedoria = p1.sabedoria++;
                        }
                        break;
                    case 5:
                        if (p1.inteligencia >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.inteligencia = p1.inteligencia++;
                        }
                        break;
                    case 6:
                        if (p1.carisma >= 3) {
                            i = i--;
                            System.out.println("Esse atributo chegou ao limite, escolha outra opção.");
                        } else {
                            p1.carisma = p1.carisma++;
                        }
                        break;
                    default:
                        i = i--;
                        System.out.println("Opção não encontrada, favor escolher alguma possível");
                        break;
                }
            }
        }
        System.out.println("                  ____________________  ");
        System.out.println("                 ||Escolha sua Classe||");
        System.out.println("                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("___________________________________________________________ ");
        System.out.println("|  1- Guerreiro  |  2- Mago  |  3- Bardo  |  4- Paladino  |");
        System.out.println("| (+1 For e Const)  (+2 Sab)     (+2 Car)   (+1 Sab e Car)|");
        System.out.println("|       O(~)          Ô  o         <Õ           __^D  ~~Ô>| ");
        System.out.println("|      /|\\|          /|\\/          /|\\       ( )()\\|   | ");
        System.out.println("|      / \\           / \\           / \\          /\\     |");
        System.out.println("|=========================================================|");
        System.out.println("|  5- Ladino  |  6- Clérigo  |  7- Druida  |  8- Bárbaro  | ");
        System.out.println("|     (+2 Dex)  (+1 Sab e Car) (+1 Agi e Int)   (+2 For)  |  ");
        System.out.println("|     ã              ê c             ö *            õ <|} |   ");
        System.out.println("|   ~/|\\->         /|\\|           /|\\|        (*)|\\ |  |   ");
        System.out.println("|    / \\           / \\|           / \\|          / \\    |  ");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        if (secret == true) {
            System.out.println("              |  9- O Mais Honrado  |");
            System.out.println("                    (+2 Geral)        ");
            System.out.println("                       o__/_        ");
            System.out.println("                       / \\        ");
        }
        System.out.print("Classe:");
        p1.classe = scanner.nextLine();
    }

    // procedimento para limpar a tela
    public static void clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");

            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Tratar Exceptions
        }
    }

    // procedimento de rolagens

    // método de d2 (moeda)
    public static boolean moeda() {
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
                    d2 = rolagem.nextInt(2) + 1;
                    if (d2 == 1) {
                        System.out.println("Cara!!!");
                        acerto = true;
                    } else {
                        System.out.println("Coroa...");
                        acerto = false;
                    }
                    break;
                case 2:
                    i = 2;
                    d2 = rolagem.nextInt(2) + 1;
                    if (d2 == 2) {
                        System.out.println("Coroa!!!");
                        acerto = true;
                    } else {
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

    // método para testes de força
    public static boolean testeForca() {
        int d6 = rolagem.nextInt(6) + 1 + p1.forca - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do método de força
    }

    // método para testes de destreza
    public static boolean testeDestreza() {
        int d6 = rolagem.nextInt(6) + 1 + p1.destreza - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do método de destreza
    }

    // método para testes de constituição
    public static boolean testeConstituicao() {
        int d6 = rolagem.nextInt(6) + 1 + p1.constituicao - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do métodco de constituição
    }

    // método para testes de sabedoria
    public static boolean testeSabedoria() {
        int d6 = rolagem.nextInt(6) + 1 + p1.sabedoria - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do método de sabedoria
    }

    // método para teste de inteligência
    public static boolean testeInteligencia() {
        int d6 = rolagem.nextInt(6) + 1 + p1.inteligencia - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do método de inteligência
    }

    // método para testes de carisma
    public static boolean testeCarisma() {
        int d6 = rolagem.nextInt(6) + 1 + p1.carisma - p1.debuff;
        boolean acerto = false;
        switch (diff) {
            // Dificuldade Simples
            case 1:
                if (d6 >= 4) {
                    acerto = true;
                }
                break;
            // Dificuldade Média
            case 2:
                if (d6 >= 6) {
                    acerto = true;
                }
                break;
            // Dificuldade Complexa
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
        // fim do método de carisma
    }

    // método para rolagem de teste de ataque do personagem
    public static boolean testeAtaqueP() {
        int d6 = rolagem.nextInt(6) + 1 + p1.buff - p1.debuff;
        boolean acerto = false, fineza = false;
        for (int i = 0; i > 2; i++) {
            // para encontrar a habilidade Fineza, que permite atacar com destreza
            if (p1.habilidade[i] == "Fineza") {
                fineza = true;
            }
        }
        if (fineza == true) {
            d6 = d6 + p1.destreza;
        } else {
            d6 = d6 + p1.forca;
        }
        System.out.println(d6);
        // acerta se o valor for maior que a defesa do inimigo
        if (d6 >= monstro[ameaca].defesa) {
            acerto = true;
        }
        return acerto;
        // fim do método de ataque do personagem
    }

    // teste de rolagem para acertar a cabeça do inimigo
    public static boolean acertarCabeca() {
        boolean acerto = false, fineza = false;
        int d6 = rolagem.nextInt(6) + 1 + p1.buff - p1.debuff;
        for (int i = 0; i > 2; i++) {
            // para encontrar a habilidade Fineza, que permite atacar com destreza
            if (p1.habilidade[i] == "Fineza") {
                fineza = true;
            }
        }
        if (fineza == true) {
            d6 = d6 + p1.destreza;
        } else {
            d6 = d6 + p1.forca;
        }
        // se as pernas estiverem danificadas é mais facil de acertar
        if (monstro[ameaca].pernaDireita <= 0 && monstro[ameaca].pernaEsquerda <= 0) {
            monstro[ameaca].defCabeca = monstro[ameaca].defesa;
        }
        // se o dado for maior que a defesa da cabeça o personagem acerta
        if (d6 >= monstro[ameaca].defCabeca) {
            acerto = true;
        }
        return acerto;
        // fim do método de rolagem de ataque na cabeça
    }

    // método para rolagem de dano do personagem
    public static int danoP() {
        int dado = 0;
        boolean fineza = false;
        for (int i = 0; i > 2; i++) {
            // para encontrar a habilidade Fineza, que adicionará destreza no dano
            if (p1.habilidade[i] == "Fineza") {
                fineza = true;
            }
        } // rolagem de dados
        if (fineza == true) {
            switch (p1.dadoDano) {
                case "d":
                    dado = p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d4":
                    dado = rolagem.nextInt(4) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d6":
                    dado = rolagem.nextInt(6) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d8":
                    dado = rolagem.nextInt(8) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d10":
                    dado = rolagem.nextInt(10) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d12":
                    dado = rolagem.nextInt(12) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                case "1d20":
                    dado = rolagem.nextInt(20) + 1 + p1.destreza + p1.buff - p1.debuff;
                    break;
                default:
                    break;
            }
        } else {
            switch (p1.dadoDano) {
                case "d":
                    dado = p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d4":
                    dado = rolagem.nextInt(4) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d6":
                    dado = rolagem.nextInt(6) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d8":
                    dado = rolagem.nextInt(8) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d10":
                    dado = rolagem.nextInt(10) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d12":
                    dado = rolagem.nextInt(12) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                case "1d20":
                    dado = rolagem.nextInt(20) + 1 + p1.forca + p1.buff - p1.debuff;
                    break;
                default:
                    break;
            }
        }
        return dado;
    }

    // método para teste de ataque do monstro
    public static boolean testeAtaqueM() {
        int d6 = rolagem.nextInt(6) + 1 + monstro[ameaca].modAcerto + monstro[ameaca].buff - monstro[ameaca].debuff;
        boolean acerto = false;
        // acerta se o dado for maior que a defesa do personagem
        if (d6 >= p1.defesa) {
            acerto = true;
        }
        return acerto;
        // fim do método para teste de ataque do monstro
    }

    // método de rolagem de dano do monstro
    public static int danoM() {
        int dado = 0;
        // rolagens de dados
        switch (p1.dadoDano) {
            case "1d4":
                dado = rolagem.nextInt(4) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff - monstro[ameaca].debuff;
                break;
            case "1d6":
                dado = rolagem.nextInt(6) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff - monstro[ameaca].debuff;
                break;
            case "1d8":
                dado = rolagem.nextInt(8) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff - monstro[ameaca].debuff;
                break;
            case "1d10":
                dado = rolagem.nextInt(10) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff
                        - monstro[ameaca].debuff;
                break;
            case "1d12":
                dado = rolagem.nextInt(12) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff
                        - monstro[ameaca].debuff;
                break;
            case "1d20":
                dado = rolagem.nextInt(20) + 1 + monstro[ameaca].modDano + monstro[ameaca].buff
                        - monstro[ameaca].debuff;
                break;
            default:
                break;
        }
        return dado;
        // fim do método de rolagem de dano
    }

    // método para fugir do combate
    public static boolean fugir() {
        boolean fugiu = false, habFuga = false, maiorDestreza = false;
        int dFuga = 0;
        for (int i = 0; i < p1.habilidade.length; i++) {
            if (p1.habilidade[i] == "Fuga Aprimorada") {
                habFuga = true;
            }
        }
        if (p1.destreza > monstro[ameaca].fuga) {
            maiorDestreza = true;
        }
        if (habFuga == true && maiorDestreza == true) {
            dFuga = rolagem.nextInt(2) + 1;
            if (dFuga == 2) {
                fugiu = true;
            }
        } else if (habFuga == true || maiorDestreza == true) {
            dFuga = rolagem.nextInt(3) + 1;
            if (dFuga == 3) {
                fugiu = true;
            }
        } else {
            dFuga = rolagem.nextInt(4) + 1;
            if (dFuga == 4) {
                fugiu = true;
            }
        }
        return fugiu;
        // fim do método de fuga
    }

    // método de batalha
    public static boolean batalha() {
        boolean vitoria = false, acertoM = false, acertoP = false, fuga = false, acao = false;
        int guarde = 0;
        while (combate == true) { // vai repetir até matar o monstro ou fugir
            if (p1.vida > 0 && monstro[ameaca].vida > 0) { // se o player tiver mais de 0 de vida continua o combate
                // Sprites em ASCII
                if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0 && monstro[ameaca].bracoDireito > 0
                        && monstro[ameaca].pernaEsquerda > 0 && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|       ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                -  /----                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |   ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                -  /----                           ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|    ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                - /----                           ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                -  /----                          ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                      ___,./ \\.,___ ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                 - /----                             ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                            |  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                 -  /----                            ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                                              ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                            ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                           ");
                    System.out.println("                           /|       ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                -  /----                              ");
                } else if (monstro[ameaca].cabeca > 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                            O                                  ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                             ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                             ");
                    System.out.println("                           /|\\-|----  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                           ");
                    System.out.println("                            |   ");
                    System.out.println("                           / \\     ");
                    System.out.println("                                -  /----                           ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                           ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                            ");
                    System.out.println("                           /|    ");
                    System.out.println("                      ___,./ \\     ");
                    System.out.println("                                - /----                           ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                            ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda > 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                             ");
                    System.out.println("                           /|  ");
                    System.out.println("                           / \\.,___     ");
                    System.out.println("                                -  /----                          ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo <= 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                            ");
                    System.out.println("                            |\\-|----  ");
                    System.out.println("                      ___,./ \\.,___ ");
                    System.out.println("                                                              ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito <= 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita <= 0) {
                    System.out.println("                                                             ");
                    System.out.println("                           /|  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                 - /----                             ");
                } else if (monstro[ameaca].cabeca <= 0 && monstro[ameaca].bracoEsquerdo > 0
                        && monstro[ameaca].bracoDireito > 0 && monstro[ameaca].pernaEsquerda <= 0
                        && monstro[ameaca].pernaDireita > 0) {
                    System.out.println("                                                              ");
                    System.out.println("                            |  ");
                    System.out.println("                      ___,./ \\.,___     ");
                    System.out.println("                                 -  /----                            ");
                }
                // Menu de escolha
                System.out.println("-------------------------------------------------------------------");
                System.out.println("| Uma pergunta nasce, será que tudo valeu apena? Infelizmente não |");
                System.out.println("| há tempo para elas ser repondida... Agora é sua vez," + p1.nome + "!|");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("  " + p1.nome);
                // Status
                System.out
                        .println("    HP: " + p1.vida + "/" + p1.vidaMaxima + "  MP: " + p1.mana + "/" + p1.manaMaxima);
                System.out.println("");
                System.out.println(" _________    ______________   _________________    _______    ________ ");
                System.out.println("|1- ATACAR|  |2- HABILIDADES| |3- ANÁLISE RÁPIDA|  |4- ITEM|  |5- FUGIR|");
                System.out.println(" ¯¯¯¯¯¯¯¯¯    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    ¯¯¯¯¯¯¯    ¯¯¯¯¯¯¯¯");
                resposta = scanner.nextInt();
                clear();
                switch (resposta) {
                    // Menu de atacar
                    case 1:
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("|                    " + monstro[ameaca].nome + "                     |");
                        System.out.println("| [1- Torso]                                                      |");
                        if (monstro[ameaca].cabeca > 0) {
                            System.out.println("| [2- Cabeça]                                                     |");
                        }
                        if (monstro[ameaca].bracoEsquerdo > 0) {
                            System.out.println("| [3- Braço Esquerdo]                                         |");
                        }
                        if (monstro[ameaca].bracoDireito > 0) {
                            System.out.println("| [4- Braço Direito]                                          |");
                        }
                        if (monstro[ameaca].pernaEsquerda > 0) {
                            System.out.println("| [5- Perna Esquerda]                                         |");
                        }
                        if (monstro[ameaca].pernaDireita > 0) {
                            System.out.println("| [6- Perna Direita]                                          |");
                        }
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("  " + p1.nome);
                        System.out.println(
                                "    HP: " + p1.vida + "/" + p1.vidaMaxima + "  MP: " + p1.mana + "/" + p1.manaMaxima);
                        System.out.println("");
                        resposta = scanner.nextInt();
                        clear();
                        switch (resposta) {
                            case 1: // atacar torso
                                acertoP = testeAtaqueP();
                                if (acertoP == true) {
                                    guarde = danoP();
                                    monstro[ameaca].torso = monstro[ameaca].torso - guarde;
                                } else {
                                    resposta = rolagem.nextInt(5) + 1;
                                    switch (resposta) {
                                        // mensagens de erro no ataque
                                        case 1:
                                            System.out.println(
                                                    "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                            break;
                                        case 2:
                                            System.out.println(
                                                    "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                            break;
                                        case 3:
                                            System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                            break;
                                        case 4:
                                            System.out.println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                            break;
                                        case 5:
                                            System.out.println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 2: // atacar cabeça
                                if (monstro[ameaca].cabeca > 0) {
                                    acertoP = acertarCabeca();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].cabeca = monstro[ameaca].cabeca - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
                                            // mensagens de erro
                                            case 1:
                                                System.out.println(
                                                        "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                                break;
                                            case 3:
                                                System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                                break;
                                            case 4:
                                                System.out
                                                        .println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                                break;
                                            case 5:
                                                System.out
                                                        .println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {// mensagem se a cabeça estiver com vida 0
                                    System.out.println(
                                            "Você observa que sua cabeça caiu faz algum tempo... Como será que ele ainda luta?");
                                }
                                break;
                            case 3:// atacar braço esquerdo
                                if (monstro[ameaca].bracoEsquerdo > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].bracoEsquerdo = monstro[ameaca].bracoEsquerdo - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
                                            // mensagens de erro
                                            case 1:
                                                System.out.println(
                                                        "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                                break;
                                            case 3:
                                                System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                                break;
                                            case 4:
                                                System.out
                                                        .println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                                break;
                                            case 5:
                                                System.out
                                                        .println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {// mensagem caso o braço esquerdo esteja com vida 0
                                    System.out.println("Você observa que seu braço já está no chão, que desgraça.");
                                }
                                break;
                            case 4: // atacar braço direito
                                if (monstro[ameaca].bracoDireito > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].bracoDireito = monstro[ameaca].bracoDireito - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
                                            // mensagens de erro
                                            case 1:
                                                System.out.println(
                                                        "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                                break;
                                            case 3:
                                                System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                                break;
                                            case 4:
                                                System.out
                                                        .println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                                break;
                                            case 5:
                                                System.out
                                                        .println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {// mensagem caso o braço direito esteja com vida 0
                                    System.out.println(
                                            "Você observa que seu braço caiu, juntamente de sua arma. Pelo menos estamos na vantagem, né?");
                                }
                                break;
                            case 5: // atacar perna esquerda
                                if (monstro[ameaca].pernaEsquerda > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].pernaEsquerda = monstro[ameaca].pernaEsquerda - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
                                            // mensagens de erro
                                            case 1:
                                                System.out.println(
                                                        "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                                break;
                                            case 3:
                                                System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                                break;
                                            case 4:
                                                System.out
                                                        .println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                                break;
                                            case 5:
                                                System.out
                                                        .println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {// mensagem caso a perna esquerda esteja com vida 0
                                    System.out.println(
                                            "Você observa que sua perna está desgastada, me pergunto como ainda se mantém de pé.");
                                }
                                break;
                            case 6: // atacar perna direita
                                if (monstro[ameaca].pernaDireita > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].pernaDireita = monstro[ameaca].pernaDireita - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
                                            // mensagem de erro
                                            case 1:
                                                System.out.println(
                                                        "Por mais certeiro que fosse, o alvo parece ter aguentado seu golpe...");
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Seu erro abriu uma enorme brecha, o inimigo se aproveita disso...");
                                                break;
                                            case 3:
                                                System.out.println("A ofensiva falhou; o inimigo sorri com desdém!");
                                                break;
                                            case 4:
                                                System.out
                                                        .println("Seu ataque ecoou no ar, deixando apenas frustração!");
                                                break;
                                            case 5:
                                                System.out
                                                        .println("Nem mesmo a sorte pode estar no seu lado dessa vez.");
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {// mensagem caso a perna direita esteja com vida 0
                                    System.out.println(
                                            "Você observa que sua perna está desgastada, me pergunto como ainda se mantém de pé.");
                                }
                                break;
                            default:
                                System.out.println("Suas tentativas acabam sendo em vão... Você erra.");
                                break;
                        }
                        break;
                    case 2:// usar habilidades
                        acao = habilidades();
                        clear();
                        break;
                    case 3:// analisar os atributos inimigos
                        acao = true;
                        System.out.println();
                        System.out.println("| Seus olhos passam rapidamente pelo inimigo ");
                        System.out.println();

                    case 4:// usar itens
                        acao = itens();
                        clear();
                        break;
                    case 5:// tentar fugir
                        fuga = fugir();
                        clear();
                        break;
                    default:
                        System.out.println("Você tenta agir, mas falha miseravelmente.");
                        acao = true;
                        clear();
                        break;
                }// ataque do monstro no final do turno
                if (acao == true && fuga == false) {
                    acertoM = testeAtaqueM();
                } else if (fuga == true) {
                    vitoria = true;
                }
                if (acertoM == true) {
                    guarde = danoM();
                    p1.vida = p1.vida - guarde;
                }
            } else if (fuga == true || monstro[ameaca].vida <= 0) { // se conseguir fugir ou o monstro tiver 0 de vida
                combate = false;
                vitoria = true;
            } else { // se o player tiver 0 de vida
                combate = false;
                vitoria = false;
            }
        }
        clear();
        return vitoria;
    }// fim do método de batalha

    // procedimentos para status do jogador

    // método para o menu de habilidades
    public static boolean habilidades() {
        String resposta;
        boolean uso = false;
        System.out.println(" ________________________________________________");
        for (int i = 0; i < p1.habilidade.length; i++) { // irá procurar as habilidades e mostrará no menu

            System.out.println("| " + p1.habilidade[i] + "                      |");
        }
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("{Sair}");
        resposta = scanner.nextLine();
        clear();
        if (combate == true) {// caso esteja no combate
            switch ("") {
                case "":

                    break;

                default:
                    uso = false;
                    break;
            }
        } else {
            switch (resposta) {// caso esteja fora do combate
                case "":

                    break;

                default:
                    uso = false;
                    break;
            }
        }
        return uso;
    }

    // método para o menu de itens
    public static boolean itens() {
        String resposta;
        boolean uso = false;
        System.out.println(" __________________________________");
        for (int i = 0; i < p1.item.length; i++) { // repetição para mostrar os itens no menu
            if (p1.quantidadeItem[i] != 0) {
                System.out.println("| " + p1.quantidadeItem[i] + " " + p1.item[i] + " |");
            }
        }
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("{sair}");
        resposta = scanner.nextLine();
        clear();
        switch (resposta) {
            case "":

                break;

            default:
                uso = false;
                break;
        }
        return uso;
    }

    public static void guerreiro() {
        boolean escolha = false;
        // aqui é a história inicial e escolha de itens do guerreiro
        System.out.println("Você era um guarda de um reino distante, ou talvez alguém que apenas gostava de uma boa");
        System.out
                .println("luta, quem sabe. Esses anos de batalhas épicas nas suas costas trouxeram sua força à tona.");
        resposta = scanner.nextInt();
        clear();
        System.out
                .println("Sua infância foi muito conturbada, sua mãe vivia andando pelas periferias buscando dinheiro");
        System.out.println("para sustentar a família. Durante uma tarde em que você andava de volta para casa, a rua");
        System.out.println("deserta pós festival. ");
        resposta = scanner.nextInt();
        clear();
        System.out.println("De frente a estátua da cidade, mostrando o nobre guerreiro, é possível observar ao lado a");
        System.out.println(
                "Máfia Xerothiana. Eles se voltam contra os guardas locais, mais um território a ser conquistado. ");
        System.out.println(
                "Seu senso de heroísmo entra na mente ao observar novamente aquela estátua oxidada, por outro lado");
        System.out.println("seu rosto parece ficar perfeito no lugar...");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("Escolha o lado da luta");
            System.out.println("");
            System.out.println("{1- Ajudar a guarda}");
            System.out.println("{2- Ajudar a máfia}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println(
                            "Se enchendo de honra, numa investida retilínea por trás, pegando uma garrafa quebrada no caminho como arma.");
                    System.out.println("Sua ajuda na batalha foi o trunfo dos guardas, o levando a vitória.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Adquiriu 'Honra Heróica'"); // habilidade ativa para buff de defesa e dano
                    p1.habilidade[0] = "Honra Heróica";
                    resposta = scanner.nextInt();
                    clear();
                    break;
                case 2:
                    escolha = true;
                    System.out.println(
                            "Seu ego ultrapassa seu sentimento de honra, o fazendo procurar por uma faca e seguir até a briga.");
                    System.out.println("Sua ajuda traz a máfia uma nova conquista.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Adquiriu 'Aura Egocêntrica'"); // habilidade passiva para debuff inimigo
                    p1.habilidade[0] = "Aura Egocêntrica";
                    resposta = scanner.nextInt();
                    clear();
                    break;
                default:
                clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha == false);
        clear();
        System.out.println("O tempo passou, suas lutas aumentaram gradativamente. Infelizmente durante suas explorações você foi");
        System.out.println("surpreendido por vários ladinos, onde teve seus itens roubados e com um golpe fosse apagado repentinamente.");
        resposta = scanner.nextInt();
        clear();
        System.out.println("Você está se preparando para mais um dia de luta. O cheiro da lavagem comida");
        System.out.println("parece estar impregnado na sua cela. Os passos pesados chegam até a frente da porta");
        System.out.println("sinalizando que a batalha vai iniciar.");
        resposta = scanner.nextInt();
        clear(); // mudança de armas muda apenas a narração inicial
        do {
            System.out.println("escolha uma arma");
            System.out.println("");
            System.out.println("{1- Espada Longa}");
            System.out.println("{2- Duas machadinhas}");
            System.out.println("{3- Machado}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    p1.arma = "Espada Longa";
                    System.out.println("Você obteve Espada Longa");
                    resposta = scanner.nextInt();
                    clear();
                    System.out
                            .println("Você pega uma espada longa bem suja e enferrujada que estava próxima da porta.");
                    System.out.println(
                            "O guarda te puxa para fora do quarto com uma enorme força e te joga a uma espécie");
                    System.out.println("de coliseu. Os gritos aumentam cada vez mais que você vai para o centro.");
                    p1.dadoDano = "1d8";
                    p1.modDanoFisico = 3; // 1d8+3 de dano e pode usar agilidade
                    resposta = scanner.nextInt();
                    clear();
                    break;
                case 2:
                    escolha = true;
                    p1.arma = "Duas Machadinhas";
                    System.out.println("Você obteve Duas machadinhas");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("O guarda se aproxima rapidamente e no reflexo você pega duas machadinhas que");
                    System.out.println(
                            "estavam encima da mesa. Elas parecem ser arremesáveis. O guarda te puxa na força");
                    System.out.println("do ódio até uma espécie de ringue, parecendo uma prisão.");
                    System.out.println("Os camponeses que apostaram em você gritam.");
                    p1.dadoDano = "1d8";
                    p1.modDanoFisico = 2; // 1d8+2 e pode atacar duas vezes ou arremessar
                    resposta = scanner.nextInt();
                    clear();
                    break;
                case 3:
                    escolha = true;
                    p1.arma = "Machado";
                    System.out.println("Você obteve Machado");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você olha em volta desse quarto minúsculo e encontra uma caixa metálica com");
                    System.out.println(
                            "um machado de duas mãos dentro. O guarda chega até a porta e te chama até a arena");
                    System.out.println(
                            "e lá você acha vários reis e aristocratas nas arquibancadas. Eles te encaram com desgosto.");
                    p1.dadoDano = "1d12";
                    p1.modDanoFisico = 4;// é 1d12+4
                    resposta = scanner.nextInt();
                    clear();
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha == false);
        escolha = false;
        System.out.println("Seu oponente sai do outro lado da arena e ambos começam uma batalha intensa.");
        System.out.println("A derrota parece certa, sua visão aos poucos vai ficando mais turva e a dor");
        System.out.println("apenas aumenta. Ao cair no chão tudo parece perdido e prestres a desmoronar.");
        resposta = scanner.nextInt();
        clear();
        System.out.println("Com você caído, o adversário levanta a arma preparando um golpe finalizador,");
        System.out.println("mas parece ser possível fazer algo.");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("Faça sua ação");
            System.out.println("");
            System.out.println("{1- Jogar Sujo}");
            System.out.println("{2- Ataque Surpresa}");
            System.out.println("{3- Aceitar Derrota}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) { // Escolha da habilidade inicial de guerreiro
                case 1:
                    escolha = true;
                    p1.habilidade[1] = "Cegueira Temporária";
                    System.out.println("Você obteve 'Cegueira Temporária'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "O oponente ao levantar a arma e se preparar para descer com tudo, você atira areia em seus olhos");
                    System.out.println(
                            "o fazendo gritar e soltar a arma, aproveitando o momento para o derrubar e finalizar a batalha");
                    System.out.println("ali mesmo.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "A plateia fica em silêncio por um tempo, mas começam a lhe aplaudir e gritar seu nome. Comemorando.");
                    System.out.println(p1.nome + "!!! " + p1.nome + "!!! " + p1.nome + "!!!");
                    break;
                case 2:
                    escolha = true;
                    p1.habilidade[1] = "Ataque Surpresa";
                    System.out.println("Você obteve 'Ataque Surpresa'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "O oponente se prepara para finalizar a batalha de uma vez, mas suas mãos tremem e soltam sua arma.");
                    System.out.println(
                            "Ele poupa sua vida, mas como um extinto de sobrevivência, você avança quando ele se vira");
                    System.out.println("e o apunhala pelas costas.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("A plateia grita e comemora sua vitória.");
                    System.out.println(p1.nome + "!!! " + p1.nome + "!!! " + p1.nome + "!!!");
                    break;
                case 3:
                    escolha = true;
                    p1.habilidade[1] = "Fuga Aprimorada";
                    System.out.println("Você obteve 'Fuga Aprimorada'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "O oponente se prepara para acabar com sua vida fútil. Ele levanta a sua arma o máximo possível");
                    System.out.println(
                            "e você apenas aceita sua morte. Até que ele te encara e solta a arma no chão, e vai embora.");
                    System.out.println("A plateia vaia todos na arena, jogando tomates, latas e vários xingamentos.");
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha == false);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Você é puxado até a sala do imperador, onde ele te encara dos pés a cabeça, parecendo que está analisando");
        System.out.println(
                "uma mercadoria. Ele afirma que viu potencial em você, e o obriga a adentrar as masmorras das almas em");
        System.out.println("busca da coroa do Rei Peregrino.");
        resposta = scanner.nextInt(); // aqui é a escolha dos itens iniciais
        clear();
        do {
            System.out.println("escolha o que deseja levar");
            System.out.println("");
            System.out.println("{1- Medicamentos}");
            System.out.println("{2- Treinamento Físico}");
            System.out.println("{3- Equipamentos}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println("Você obteve 2 Poções de cura e 1 Bandagem");
                    p1.item[1] = "2x Poção de Cura";
                    p1.item[2] = "1x Bandagem";
                    break;
                case 2:
                    escolha = true;
                    System.out.println("Você recebeu +1 em Constituição");
                    p1.constituicao = p1.constituicao++;
                    break;
                case 3:
                    escolha = true;
                    System.out.println("Você obteve 1 Escudo e 1 Armadura de couro");
                    p1.defesa = 2;
                    p1.escudo = 1;
                    p1.rd = 3;
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha == false);
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Você pega alguns equipamentos que o imperador disponibilizou. Contra sua vontade uma escolta o leva");
        System.out.println("até a frente da masmorra, te encarando até realmente adentra-lá.");
        resposta = scanner.nextInt();
        clear();
        // area para carregar coisas da ficha
        p1.classe = "Guerreiro";
        p1.forca = p1.forca + 1;
        p1.constituicao = p1.constituicao + 1;
        hp();
        p1.vida = p1.vidaMaxima;
        mana();
        p1.mana = p1.manaMaxima;
        defesa();
        p1.rd = p1.rd + 3;
        if (p1.arma == "Duas Machadinhas") {
            p1.habilidade[2] = "Ataque Duplo";
            p1.habilidade[3] = "Arremessar";
        }

    }

    public static void mago() {
    }

    public static void bardo() {
    }

    public static void paladino() {
    }

    public static void ladino() {
    }

    public static void clerigo() {
    }

    public static void barbaro() {
    }

    public static void honrado() {
    }

    // método para calcular a mana do personagem
    public static int mana() {
        int guarde = 0;
        switch (p1.classe) {
            case "Guerreiro":
                guarde = p1.manaMaxima + 4 + p1.sabedoria;
                break;
            case "Mago":
                guarde = p1.manaMaxima + 8 + p1.sabedoria * 3;
                break;
            case "Bardo":
                guarde = p1.manaMaxima + 6 + p1.sabedoria * 2;
                break;
            case "Paladino":
                guarde = p1.manaMaxima + 6 + p1.sabedoria * 2;
                break;
            case "Ladino":
                guarde = p1.manaMaxima + 4 + p1.sabedoria * 2;
                break;
            case "Clérigo":
                guarde = p1.manaMaxima + 8 + p1.sabedoria * 3;
                break;
            case "Druida":
                guarde = p1.manaMaxima + 8 + p1.sabedoria * 2;
                break;
            case "Barbáro":
                guarde = p1.manaMaxima + 8 + p1.sabedoria;
                break;
            default:
                break;
        }
        return guarde;
    }

    // método para calcular vida do personagem
    public static int hp() {
        int guarde = 0;
        switch (p1.classe) {
            case "Guerreiro":
                guarde = p1.vidaMaxima + 20 + p1.constituicao * 5;
                break;
            case "Mago":
                guarde = p1.vidaMaxima + 8 + p1.constituicao * 3;
                break;
            case "Bardo":
                guarde = p1.vidaMaxima + 10 + p1.constituicao * 4;
                break;
            case "Paladino":
                guarde = p1.vidaMaxima + 28 + p1.constituicao * 5;
                break;
            case "Ladino":
                guarde = p1.vidaMaxima + 13 + p1.constituicao * 4;
                break;
            case "Clérigo":
                guarde = p1.vidaMaxima + 8 + p1.constituicao * 3;
                break;
            case "Druida":
                guarde = p1.vidaMaxima + 12 + p1.constituicao * 4;
                break;
            case "Barbáro":
                guarde = p1.vidaMaxima + 23 + p1.constituicao * 5;
                break;
            default:
                break;
        }
        return guarde;
    }

    // método para calcular defesa do personagem
    public static int defesa() {
        int guarde = 4 + p1.destreza + p1.defesa;
        return guarde;
    }
}