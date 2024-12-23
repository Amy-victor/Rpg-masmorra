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
        boolean vitoria = false, acertoM = false, acertoP = false, fuga = false, acao = false, voltar = false;
        int guarde = 0;
        while (combate == true) { // vai repetir até matar o monstro ou fugir
           do{
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
                    do{
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
                        System.out.println("| [7- Voltar]                                                       |");
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
                                    acao = true;
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
                                    acao = true;
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
                                } else {// caso já tenha sido destruído
                                    System.out.println(
                                            "Essa parte já foi destruída");
                                }
                                break;
                            case 3:// atacar braço esquerdo
                                if (monstro[ameaca].bracoEsquerdo > 0) {
                                    acao = true;
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
                                } else {// caso já tenha sido destruído
                                    clear();
                                    System.out.println("Essa parte já foi destruída");
                                }
                                break;
                            case 4: // atacar braço direito
                                if (monstro[ameaca].bracoDireito > 0) {
                                    acao = true;
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
                                } else {// caso escolha e já tenha sido destruído
                                    clear();
                                    System.out.println(
                                            "Essa parte já foi destruída");
                                }
                                break;
                            case 5: // atacar perna esquerda
                                if (monstro[ameaca].pernaEsquerda > 0) {
                                    acao = true;
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
                                } else {// mensagem case a perna esquerda esteja com vida 0
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
                                } else {//caso já tenha destruído a parte do corpo
                                    clear();
                                    System.out.println(
                                            "Essa parte já foi destruída");
                                }
                                break;
                                case 7:
                                voltar = true;
                                break;
                            default:
                                clear();
                                System.out.println("escolha outra opção");
                                break;
                        }
                    }while(voltar != true);
                        break;   
                 case 2:// usar habilidades
                        acao = habilidades();
                        clear();
                        break;
                    case 3:// analisar os atributos inimigos
                        acao = true;
                        System.out.println();
                        System.out.println("| Seus olhos passam rapidamente pelo inimigo ");
                        System.out.println("HP: "+monstro[ameaca].vida+" Defesa: "+monstro[ameaca].defesa);
                        resposta = scanner.nextInt();
                        clear();
                    case 4:// usar itens
                        acao = itens();
                        clear();
                        break;
                    case 5:// tentar fugir
                        fuga = fugir();
                        clear();
                        break;
                    default:
                    clear();
                        System.out.println("Escolha outra opção");
                                                break;
                }
            }
        }while(acao != true);
            acao = false;
                // ataque do monstro no final do turno
                if (acao == true && fuga == false) {
                    acertoM = testeAtaqueM();
                } else if (fuga == true) {
                    vitoria = true;
                }
                if (acertoM == true) {
                    guarde = danoM();
                    p1.vida = p1.vida - guarde;
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
        if (combate == true) {// case esteja no combate
            switch ("") {
                case "":

                    break;

                default:
                    uso = false;
                    break;
            }
        } else {
            switch (resposta) {// case esteja fora do combate
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

    // classe guerreiro
    public static void guerreiro() {
        boolean escolha = false;
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
        } while (escolha != true);
        clear();
        System.out.println(
                "O tempo passou, suas lutas aumentaram gradativamente. Infelizmente durante suas explorações você foi");
        System.out.println(
                "surpreendido por vários ladinos, onde teve seus itens roubados e com um golpe fosse apagado repentinamente.");
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
        } while (escolha != true);
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
        } while (escolha != true);
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
        } while (escolha != true);
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

    // classe mago
    public static void mago() {
        boolean escolha = false;
        System.out.println(
                "Você se esconde de todos, seja por medo da morte por saber magia, ou apenas para estudar ainda mais sobre ela.");
        System.out.println("De certo modo, suas habilidades em algum tipo de magia é invejável.");
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Começa mais um dia desgraçado na capela de Hofrick, sua função sempre foi ser apenas um servente do padre para");
        System.out.println(
                "ter um local para morar e comer de graça. Durante a madrugrada seu hobbie normalmente é estudar magias, mesmo");
        System.out.println("que isso vá contra a capela.");
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Durante uma madrugada se esgueirando pelo escuro, você chega até a biblioteca do Papa. Ela tem vários livros");
        System.out.println(
                "de magias proibidas pela igreja. Todos os livros parecem meio queimados ou mofados, provavelmente porque foi");
        System.out.println("dos feiticeiros mortos pela capela.");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("escolha o livro de magia");
            System.out.println("");
            System.out.println("{1- Piromancia}");
            System.out.println("{2- Comunicação}");
            System.out.println("{3- Transfiguração}");
            resposta = scanner.nextInt(); // escolha das magias iniciais
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    p1.magia[0] = "Piromancia";
                    System.out.println("Você obteve 'Piromancia'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Após procurar algum livro de feitiços de piromancia, você encontra um nas prateleiras queimadas ao lado da");
                    System.out.println(
                            "da escrivaninha do Papa. Os passos dos Auxiliares da igreja parecem passar pelo corredor, até que um bate");
                    System.out.println("na porta e entra na biblioteca procurando o Padre.");
                    break;
                case 2:
                    escolha = true;
                    p1.magia[0] = "Infestação dos Ratos";
                    System.out.println("Você obteve 'Infestação dos Ratos'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Após procurar algum livro de feitiços envolvendo comunicação, você encontra um nas prateleiras mofadas ao lado da");
                    System.out.println(
                            "da escrivaninha do Papa. Os passos dos Auxiliares da igreja parecem passar pelo corredor, até que um bate");
                    System.out.println("na porta e entra na biblioteca procurando o Padre.");
                    break;
                case 3:
                    escolha = true;
                    p1.magia[0] = "Transfiguração Inerte: Revestimento";
                    System.out.println("Você obteve 'Transfiguração Inerte: Revestimento'");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Após procurar livros envolvendo Transfiguração corporal, Você encontra um perdido no chão perto da escrivaninha");
                    System.out.println(
                            "do Papa. Os passos dos Auxiliares da igreja parecem passar pelo corredor, até que um bate na porta e entra na");
                    System.out.println("biblioteca procurando o Padre.");
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Você se esconde embaixo da escrivaninha do Papa, até ele sair da sala. Ao se levantar e olhar em volta para");
        System.out.println("ter certeza que não há ninguém. Você decide olhar a escrivaninha buscando algo útil.");
        resposta = scanner.nextInt(); // primeira escolha inicial de itens
        clear();
        do {
            System.out.println("escolha o item");
            System.out.println("");
            System.out.println("{1- Necronomicon}");
            System.out.println("{2- Amuleto Arcano}");
            System.out.println("{3- Cetro do Papa}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    boolean sucesso = moeda();
                    if (sucesso == false) {
                        System.out.println(
                                "O livro parece chamar muito sua atenção. Com sua mente despreparada, você o abre");
                        System.out.println("e o livro parece suga-lá até sua existencia não ser uma mera lenda.");
                        resposta = scanner.nextInt();
                        clear();
                        System.out.println("                  ______________");
                        System.out.println("                 |Fim de Jogo...|");
                        System.out.println("                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.print("Dica:");
                        System.out.println(
                                "O Necronomicon é proibido por dois motivos, suas magias e seu perigo causado aos leitores.");
                        System.out.println("   Ler ele pode ser algo incrivelmente bom, ou sua perdição.");
                        System.out.println("");
                        System.out.println("");
                        System.exit(0);
                    } else {
                        System.out.println(
                                "Você abre uma das gavetas da escrivaninha e encontra um livro com uma capa de couro apodrecido, com");
                        System.out.println(
                                "um rosto na capa. Esse é um dos livros de magia proíbida até mesmo pelos bruxos.");
                        System.out.println(
                                "as escritas são aterrorizantes e parece sugar sua energia. Por sorte você parece entender tudo escrito.");
                        resposta = scanner.nextInt();
                        clear();
                        resposta = rolagem.nextInt(2) + 1;
                        switch (resposta) {
                            case 1:
                                p1.magia[1] = "Ferir";
                                System.out.println("Você obteve 'Ferir'");
                            case 2:
                                p1.magia[1] = "Fumaça Necrótica";
                                System.out.println("Você obteve'Fumaça Necrótica'");
                            case 3:
                                p1.magia[1] = "Amaldiçoar Arma";
                                System.out.println("Você obteve 'Amaldiçoar Arma'");
                        }
                        clear();
                        System.out.println(
                                "Ao terminar de ler o livro, você o arremessa para longe, desejando nunca mais ver algo assim novamente.");
                    }
                    break;
                case 2:
                    escolha = true;
                    p1.acessorio[0] = "Amuleto Arcano";
                    System.out.println("você obteve Amuleto Arcano");
                    resposta = scanner.nextInt();
                    p1.modDanoMagico = 6;
                    clear();
                    System.out
                            .println("Abrindo algumas gavetas você encontra um amuleto que exala mana de um cristal.");
                    break;
                case 3:
                    escolha = true;
                    p1.arma = "Cetro Elegante";
                    System.out.println("Você obteve Cetro Elegante");
                    p1.dadoDano = "1d6";
                    p1.modDanoFisico = 2; // arma de uma mão, dano: 1d6+2
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Ao lado da escrivaninha você encontra um cetro de madeira refinada que era usado pelo papa.");
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        System.out
                .println("Também é visível um mapa e um documento falando da masmorras das almas, dizendo que existe");
        System.out
                .println("vários pergaminhos ou objetos mágicos lá. Os perigos da masmorra são enormes, provavelmente");
        System.out.println("o Papa estava preparando alguma escolta até lá.");
        resposta = scanner.nextInt();
        clear();
        System.out.println("Você pega esses papéis e sai da sala antes que o peguem. Antes de sair, vem na sua mente");
        System.out.println("que deve se preparar antes de partir.");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("escolha o local");
            System.out.println("");
            System.out.println("{1- Sala de Flagelo}");
            System.out.println("{2- Biblioteca dos Irmãos}");
            System.out.println("{3- Ir para o quarto e ir embora}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println(
                            "Você espreita até a sala de flagelo, para ser penitênciado pelos seus pecados antes de sua");
                    System.out.println(
                            "jornada. A dor extrema e a ardência deles rastejando para fora o faz sentir revigorado. seu");
                    System.out.println("corpo parece se sentir mais resistente ao que o mundano pode te oferecer.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você Obteve 'Físico Monstruoso'");
                    p1.habilidade[0] = "Físico Monstruoso";
                    p1.rd = 5;
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Os seus gritos de dor e sofrimento ecoam pela sala, parecendo alcançar os corredores da capela.");
                    System.out.println("Você põe suas roupas novamente e corre para fora.");
                    break;
                case 2:
                    escolha = true;
                    System.out.println(
                            "Você corre e entra na biblioteca dos auxiliares, pretendendo apreciar e ler bíblias para aumentar");
                    System.out.println(
                            "seu uso de magias e entendimento sobre as bruxas. A biblioteca está totalmente vazia.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você leu 'As Passagens das Bruxas'");
                    p1.manaMaxima = p1.manaMaxima + 8;
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println(
                            "Enquanto termina de ler, você escuta a porta da biblioteca abrindo e passos adentrando. Ao espreitar");
                    System.out.println(
                            "da para perceber que são auxiliares. Na tentativa de passar despercebido, um lhe vê saindo.");
                    break;
                case 3:
                    escolha = true;
                    System.out.println(
                            "Você entra no seu quarto e começa a preparar suas coisas, Arrumando suas biblías escondidas e frascos");
                    System.out.println("de elixir da vida. Antes de partir você se ajoelha e reza.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.print("...");
                    p1.manaMaxima = p1.manaMaxima + 3;
                    System.out.println("Você termina de rezar.");
                    resposta = scanner.nextInt();
                    clear();
                    p1.item[3] = "Elixir da Vida";
                    System.out.println("Você Obteve Elixir da vida"); // Cura vida e Mana
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você pega sua bolsa e começa a criar coragem para sair do quarto...");
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        System.out.println("No corredor da capela vários auxiliares o vê e começam a gritar pelo padre.");
        System.out.println("na adrenalina do momento Você corre para fora antes de ser pego.");
        resposta = scanner.nextInt();
        clear();
        System.out.println("Você decide descansar na taverna mais próxima antes de seguir viagem.");
        System.out.println("Ela está basicamente vazia, havendo apenas alguns corpos jogados no ");
        System.out.println("chão ou nas mesas. O cheiro de Cerveja antiga está volitando pelo ar da taverna.");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("escolha o que deseja levar");
            System.out.println("{1- Medicamentos}");
            System.out.println("{2- Itens Arcanos}");
            System.out.println("{3- Equipamentos}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println("Você obteve 2 Poções de cura e 1 Bandagem");
                    p1.item[0] = "Poção de Cura";
                    p1.item[1] = "Poção de Cura";
                    p1.item[2] = "Bandagem";
                    break;
                case 2:
                    escolha = true;
                    System.out.println("Você obteve 1 Poção de Mana e 1 Anel Vampírico");
                    p1.item[0] = "Poção de Mana";
                    if (p1.acessorio[0] != "") {
                        p1.acessorio[0] = "Anel Vampírico";
                    } else {
                        p1.acessorio[1] = "Anel Vampírico";
                    }
                    break;
                case 3:
                    escolha = true;
                    System.out.println("Você obteve 1 Escudo leve e 1 Armadura de couro");
                    p1.defesa = p1.defesa + 2;
                    p1.escudo = 1;
                    p1.rd = p1.rd + 2;
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        resposta = scanner.nextInt();
        clear();
        System.out
                .println("No outro dia Você segue viagem a caminho da Masmorra. Pegando um cavalo que havia na frente");
        System.out.println(
                "da taverna, são vários e vários dias. Aos poucos adentrando uma floresta nevoada, totalmente");
        System.out
                .println("silenciosa. Quando finalmente encontra a masmorra você decide descer do cavalo e adentra-la");
        resposta = scanner.nextInt();
        clear();
        // area para carregar coisas da ficha
        if (p1.arma != "Cetro Elegante") {
            p1.arma = "Adaga de Sacrifício"; // 1d4+1 de dano
            p1.dadoDano = "1d4";
            p1.modDanoFisico = 1;
        }
        p1.classe = "Mago";
        p1.sabedoria = p1.sabedoria + 2;
        p1.vidaMaxima = hp();
        p1.vida = p1.vidaMaxima;
        p1.mana = mana();
        p1.mana = p1.manaMaxima;
        p1.defesa = defesa();
    }

    // classe bardo
    public static void bardo() {
        boolean escolha = false;
        System.out.println(
                "Sua vida gira em torno dos instrumentos. Em alguma fase da sua vida você percebeu que suas prosas");
        System.out.println("e canções poderiam conjurar magias, mas provém da sua índole de como ela será usada.");
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Você está se preparando para mais um dia de trabalho na taverna. Seu quarto está uma bagunça, e");
        System.out.println(
                "as fãs com quem passou a noite parecem já ter saído do quarto. Após pegar sua bolsa você pensa");
        System.out.println("em qual instrumento irá utilizar.");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("Escolha seu instrumento");
            System.out.println("");
            System.out.println("{1- Alaúde}");
            System.out.println("{2- Trombeta}");
            System.out.println("{3- Flauta}");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println("Você obteve Alaúde");
                    p1.acessorio[0] = "Alaúde";
                    break;
                case 2:
                    escolha = true;
                    System.out.println("Você obteve Trombeta");
                    p1.acessorio[0] = "Trombeta";
                    break;
                case 3:
                    escolha = true;
                    System.out.println("Você obteve Flauta");
                    p1.acessorio[0] = "Flauta";
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        System.out.println(
                "Após pegar tudo que precisa, Você pega viagem com uma carroça até a taverna. Durante algumas paradas");
        System.out.println(
                "uma multidão de pessoas o reconheceu e barraram o caminho da carroça, tentando conversar com você.");
        System.out.println("Eles tentam conversar, alguns gritam seu nome pedindo uma assinatura.");
        System.out.println(p1.nome + " Assine minha prosa!!!!");
        resposta = scanner.nextInt();
        clear();
        do {
            System.out.println("escolha sua ação");
            System.out.println("");
            System.out.println("{1- Ignorar}");
            System.out.println("{2- Ser gentil");
            System.out.println("{3- Ameaçar");
            resposta = scanner.nextInt();
            clear();
            switch (resposta) {
                case 1:
                    escolha = true;
                    System.out.println(
                            "Você ignora totalmente a existência deles, para você não passa de míseros camponeses querendo destruir");
                    System.out.println(
                            "seu dia. Ao perceberem sua ignorância eles tiram a atenção de você e abrem passagem.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você obteve 'Atenção Prejudicada'");
                    p1.magia[0] = "Atenção Prejudicada";
                    break;
                case 2:
                    escolha = true;
                    System.out.println(
                            "Você põe um falso sorriso no rosto, fingindo adorar aquele povo. Alguns você aceita as cartas como");
                    System.out.println(
                            "presente, assina algumas prosas, aperta mãos. Depois de todos estarem satisfeitos você percebe que o ");
                    System.out.println(
                            "tempo passou rápido. Quando senta na carroça você fala com raiva para ele acelerar.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você obteve 'Charme Roteirizado'");
                    p1.habilidade[0] = "Charme Roteirizado";
                    break;
                case 3:
                    escolha = true;
                    System.out.println(
                            "Você olha para a multidão com desdém, gritando para se afastarem case ainda quisessem ouvir novamente.");
                    System.out.println("Todos assustados correm para longe da carroça, abrindo novamente a passagem.");
                    resposta = scanner.nextInt();
                    clear();
                    System.out.println("Você obteve 'Zombaria Viciosa'");
                    p1.magia[0] = "Zombaria Viciosa";
                    break;
                default:
                    clear();
                    System.out.println("Escolha invalida.");
                    break;
            }
        } while (escolha != true);
        escolha = false;
        resposta = scanner.nextInt();
        clear();
        // esse se vai servir pra case tenha anoitecido
        if (p1.habilidade[0] == "Charme Roteirizado") {
            System.out.println(
                    "Por mais rápido que a carroça fosse, ainda havia bastante terra a seguir. Ao chegar na taverna, o taverneiro já");
            System.out.println(
                    "estava estressado com a demora. Como normalmente você é acompanhado até seu camarin, que diferentemente de como é");
            System.out.println(
                    "durante a manhã. Ele está totalmente revirado e deplorável. Independente, o show deve continuar.");
            resposta = scanner.nextInt();
            clear();
            

        } else {// aqui case esteja ainda dia

        }
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
        p1.cabeca = guarde / 10;
        p1.bracoEsquerdo = guarde / 5;
        p1.bracoDireito = guarde / 5;
        p1.pernaEsquerda = guarde / 4;
        p1.pernaDireita = guarde / 4;
        return guarde;
    }

    // método para calcular defesa do personagem
    public static int defesa() {
        int guarde = 4 + p1.destreza + p1.defesa;
        return guarde;
    }
}