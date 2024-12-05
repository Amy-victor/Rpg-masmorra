import java.util.Random;
import java.util.Scanner;

public class Principal {
    // área de carregar as variáveis
    static Scanner scanner = new Scanner(System.in);
    static Random rolagem = new Random();
    static boolean teste, combate;
    static Personagem p1 = new Personagem();
    static Monstros[] monstro = new Monstros[5];
    static int resposta, diff, ameaca;

    public static void main(String[] args) {
        monstro[0] = new Monstros();
    }

    // procedimento para limpar a tela
    public static void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }

    // procedimento de rolagens
    //métod de d2 (moeda)
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
    //método para testes de força
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
        //fim do método de força
    }
    //método para testes de destreza
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
        //fim do método de destreza
    }
    //método para testes de constituição
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
        //fim do métodco de constituição
    }
    //método para testes de sabedoria
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
        //fim do método de sabedoria
    }
    //método para teste de inteligência
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
        //fim do método de inteligência
    }
    //método para testes de carisma
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
        //fim do método de carisma
    }
    //método para rolagem de teste de ataque do personagem
    public static boolean testeAtaqueP() {
        int d6 = rolagem.nextInt(6) + 1 + p1.buff - p1.debuff;
        boolean acerto = false, fineza = false;
        for (int i = 0; i > 2; i++) {
            //para encontrar a habilidade Fineza, que permite atacar com destreza
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
        //acerta se o valor for maior que a defesa do inimigo
        if (d6 >= monstro[ameaca].defesa) {
            acerto = true;
        }
        return acerto;
        //fim do método de ataque do personagem
    }
    //teste de rolagem para acertar a cabeça do inimigo
    public static boolean acertarCabeca() {
        boolean acerto = false, fineza = false;
        int d6 = rolagem.nextInt(6) + 1 + p1.buff - p1.debuff;
        for (int i = 0; i > 2; i++) {
            //para encontrar a habilidade Fineza, que permite atacar com destreza
            if (p1.habilidade[i] == "Fineza") {
                fineza = true;
            }
        }
        if (fineza == true) {
            d6 = d6 + p1.destreza;
        } else {
            d6 = d6 + p1.forca;
        }
        //se as pernas estiverem danificadas é mais facil de acertar
        if (monstro[ameaca].pernaDireita <= 0 && monstro[ameaca].pernaEsquerda <= 0) {
            monstro[ameaca].defCabeca = monstro[ameaca].defesa;
        }
        //se o dado for maior que a defesa da cabeça o personagem acerta
        if (d6 >= monstro[ameaca].defCabeca) {
            acerto = true;
        }
        return acerto;
        //fim do método de rolagem de ataque na cabeça
    }
    //método para rolagem de dano do personagem
    public static int danoP() {
        int dado = 0;
        boolean fineza = false;
        for (int i = 0; i > 2; i++) {
            //para encontrar a habilidade Fineza, que adicionará destreza no dano
            if (p1.habilidade[i] == "Fineza") {
                fineza = true;
            }
        }//rolagem de dados
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
    //método para teste de ataque do monstro
    public static boolean testeAtaqueM() {
        int d6 = rolagem.nextInt(6) + 1 + monstro[ameaca].modAcerto + monstro[ameaca].buff - monstro[ameaca].debuff;
        boolean acerto = false;
        //acerta se o dado for maior que a defesa do personagem
        if (d6 >= p1.defesa) {
            acerto = true;
        }
        return acerto;
        //fim do método para teste de ataque do monstro
    }
    //método de rolagem de dano do monstro
    public static int danoM() {
        int dado = 0;
        //rolagens de dados
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
        //fim do método de rolagem de dano
    }
    //método para fugir do combate
    public static boolean fugir() {
        boolean fugiu = false, habFuga = false, maiorDestreza = false;
        int dFuga = 0;
        for (int i = 0; i < p1.habilidade.length; i++) {
            if (p1.habilidade[i] == "") {
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
    }

    public static boolean batalha() {
        boolean vitoria = false, acertoM = false, acertoP = false, fuga = false, acao = false;
        int guarde = 0;
        while (vitoria == false) {
            if (p1.vida > 0) {
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
                System.out.println("-------------------------------------------------------------------");
                System.out.println("| Uma pergunta nasce, será que tudo valeu apena? Infelizmente não |");
                System.out.println("| há tempo para elas ser repondida... Agora é sua vez," + p1.nome + "!|");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("  " + p1.nome);
                System.out
                        .println("    HP: " + p1.vida + "/" + p1.vidaMaxima + "  MP: " + p1.mana + "/" + p1.manaMaxima);
                System.out.println("");
                System.out.println(" _________    ______________    _______    ________ ");
                System.out.println("|1- ATACAR|  |2- HABILIDADES|  |3- ITEM|  |4- FUGIR|");
                System.out.println(" ‾‾‾‾‾‾‾‾‾    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾    ‾‾‾‾‾‾‾    ‾‾‾‾‾‾‾‾ ");
                resposta = scanner.nextInt();
                clear();
                switch (resposta) {
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
                        switch (resposta) {
                            case 1:
                                acertoP = testeAtaqueP();
                                if (acertoP == true) {
                                    guarde = danoP();
                                    monstro[ameaca].torso = monstro[ameaca].torso - guarde;
                                } else {
                                    resposta = rolagem.nextInt(5) + 1;
                                    switch (resposta) {
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
                            case 2:
                                if (monstro[ameaca].cabeca > 0) {
                                    acertoP = acertarCabeca();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].cabeca = monstro[ameaca].cabeca - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
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
                                } else {
                                    System.out.println(
                                            "Você observa que sua cabeça caiu faz algum tempo... Como será que ele ainda luta?");
                                }
                                break;
                            case 3:
                                if (monstro[ameaca].bracoEsquerdo > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].bracoEsquerdo = monstro[ameaca].bracoEsquerdo - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
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
                                } else {
                                    System.out.println("Você observa que seu braço já está no chão, que desgraça.");
                                }
                                break;
                            case 4:
                                if (monstro[ameaca].bracoDireito > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].bracoDireito = monstro[ameaca].bracoDireito - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
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
                                } else {
                                    System.out.println(
                                            "Você observa que seu braço caiu, juntamente de sua arma. Pelo menos estamos na vantagem, né?");
                                }
                                break;
                            case 5:
                                if (monstro[ameaca].pernaEsquerda > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].pernaEsquerda = monstro[ameaca].pernaEsquerda - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
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
                                } else {
                                    System.out.println(
                                            "Você observa que sua perna está desgastada, me pergunto como ainda se mantém de pé.");
                                }
                                break;
                            case 6:
                                if (monstro[ameaca].pernaDireita > 0) {
                                    acertoP = testeAtaqueP();
                                    if (acertoP == true) {
                                        guarde = danoP();
                                        monstro[ameaca].pernaDireita = monstro[ameaca].pernaDireita - guarde;
                                    } else {
                                        resposta = rolagem.nextInt(5) + 1;
                                        switch (resposta) {
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
                                } else {
                                    System.out.println(
                                            "Você observa que sua perna está desgastada, me pergunto como ainda se mantém de pé.");
                                }
                                break;
                            default:
                                System.out.println("Suas tentativas acabam sendo em vão... Você erra.");
                                break;
                        }
                        break;
                    case 2:
                        acao = habilidades();
                        break;
                    case 3:
                        acao = itens();
                        break;
                    case 4:
                        fuga = fugir();
                        break;
                    default:
                        System.out.println("Você tenta agir, mas falha miseravelmente.");
                        acao = true;
                        break;
                }
                if (acao == true && fuga == false){
                acertoM = testeAtaqueM();
                }else if (fuga == true){
                    vitoria = true;
                }
                if (acertoM == true) {
                    guarde = danoM();
                    p1.vida = p1.vida - guarde;
                }
            } else {
                vitoria = true;
            }
        }
        return vitoria;
    }

    // procedimentos para status
    public static boolean habilidades() {
        String resposta;
        boolean uso = false;
        System.out.println(" ________________________________________________");
        for (int i = 0; i < p1.habilidade.length; i++) {

            System.out.println("| " + p1.habilidade[i] + "                      |");
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println("{Sair}");
        resposta = scanner.nextLine();
        if (combate == true) {
            switch ("") {
                case "":

                    break;

                default:
                    uso = false;
                    break;
            }
        } else {
            switch (resposta) {
                case "":

                    break;

                default:
                    uso = false;
                    break;
            }
        }
        return uso;
    }

    public static boolean itens() {
        String resposta;
        boolean uso = false;
        for (int i = 0; i < p1.item.length; i++) {
            System.out.println(" __________________________________");
            if (p1.quantidadeItem[i] != 0) {
                System.out.println("| " + p1.quantidadeItem[i] + " " + p1.item[i] + " |");
            }
        }
        System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println("{sair}");
        resposta = scanner.nextLine();
        switch (resposta) {
            case "":

                break;

            default:
                uso = false;
                break;
        }
        return uso;
    }

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

    public static int defesa() {
        int guarde = 4 + p1.destreza + p1.defesa;
        return guarde;
    }
}