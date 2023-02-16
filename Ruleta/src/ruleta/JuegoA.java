package ruleta;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    static Scanner lec = new Scanner(System.in);
    static int pactual;
    static int letras = 0;
    static boolean turno = true;
    static boolean comodin = false;
    static int jugador = 1;
    static int ronda = 0;
    static ArrayList<String> PanelO;
    static char[] caracteres;
    static int npanel = 0;
    static ArrayList<Character> letDichas = new ArrayList<>();

    public static void PanelO() {
        PanelO = new ArrayList<>();
        PanelO.add("APOYAN LA CABEZA EN LA ALMOHADA Y SE DUERMEN");//LOS HAY CON SUERTE
        PanelO.add("SE TATUA UN QR CON SU PASAPORTE COVID");//TITULAR LOCO
        PanelO.add("VES UN BOL DE KICOS Y TEMES POR TUS DIENTES");//TE HAS HECHO MAYOR SI
        PanelO.add("DOS NIÑOS SE FUGAN EN MOTO DE LA GUARDERIA");//TITULAR LOCO
        PanelO.add("POR ESTAR COTILLEANDO SE ME HA ESCAPADO UN LIKE");//MALDITA SEA
        PanelO.add("OFRECEN TRABAJO COMO CONTADOR DE PINGÜINOS");//TITULAR LOCO
        PanelO.add("CADA PERSONA TIENE UNA RISA UNICA E IRREPETIBLE");//SOMOS ESPECIALES
        PanelO.add("PONEN A LA VENTA CHAMPÚ PARA CALVOS");//TITULAR LOCO
        caracteres = PanelO.get(ronda).toCharArray();
    }

    public static void Pista() {
        ArrayList<String> pista = new ArrayList<>();
        pista.add("LOS HAY CON SUERTE");
        pista.add("TITULAR LOCO");
        pista.add("TE HAS HECHO MAYOR SI");
        pista.add("TITULAR LOCO");
        pista.add("MALDITA SEA");
        pista.add("TITULAR LOCO");
        pista.add("SOMOS ESPECIALES");
        pista.add("TITULAR LOCO");
        String pistaO = pista.get(ronda);
        System.out.println("");
        System.out.println("PISTA: " + pistaO);
        Accion();
    }

    public static void Gajos() {
        int gajo = new java.util.Random().nextInt(23);
        switch (gajo) {
            case 0:
                System.out.println("X2");
                Comprobar();
                pactual = pactual * 2;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 1:
                System.out.println("1/2");
                Comprobar();
                pactual = pactual / 2;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 2:
                System.out.println("Pierde turno");
                turno = false;
                break;
            case 3:
                System.out.println("Quiebra");
                pactual = 0;
                turno = false;
                break;
            case 4:
                System.out.println("Comodin");
                Comprobar();
                comodin = true;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 5:
                System.out.println("50€");
                Comprobar();
                pactual = pactual + 50 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 6:
                System.out.println("50€");
                Comprobar();
                pactual = pactual + 50 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 7:
                System.out.println("50€");
                Comprobar();
                pactual = pactual + 50 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 8:
                System.out.println("50€");
                Comprobar();
                pactual = pactual + 50 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 9:
                System.out.println("50€");
                Comprobar();
                pactual = pactual + 50 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 10:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 11:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 12:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 13:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 14:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 15:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 16:
                System.out.println("100€");
                Comprobar();
                pactual = pactual + 100 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 17:
                System.out.println("200€");
                Comprobar();
                pactual = pactual + 200 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 18:
                System.out.println("200€");
                Comprobar();
                pactual = pactual + 200 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 19:
                System.out.println("150€");
                Comprobar();
                pactual = pactual + 150 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 20:
                System.out.println("150€");
                Comprobar();
                pactual = pactual + 150 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 21:
                System.out.println("150€");
                Comprobar();
                pactual = pactual + 150 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 22:
                System.out.println("150€");
                Comprobar();
                pactual = pactual + 150 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
            case 23:
                System.out.println("150€");
                Comprobar();
                pactual = pactual + 150 * letras;
                if (pactual >= 50) {
                    Vocal();
                }
                break;
        }
        Accion();
    }

    public static void Accion() {
        int opcion = 0;
        turno = true;
        if (comodin == false || comodin == true) {
            System.out.println("1-Tirar.");
            System.out.println("2-Resolver.");
            System.out.println("3-Consultar dinero.");
            opcion = lec.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    npanel++;
                    Gajos();
                    break;
                case 2:
                    System.out.println("Introduce la respuesta");
                    String respuesta = lec.nextLine();
                    respuesta = lec.nextLine();
                    if (respuesta.toUpperCase().equals(PanelO.get(ronda).toString())) {
                        System.out.println("Panel correcto");
                        System.out.println("Siguiente ronda");
                        System.out.println("");
                        ronda++;
                        npanel=0;
                        letDichas = new ArrayList<>();
                        PanelO();
                        Panel();
                    } else {
                        System.out.println("Fallaste el panel");
                        turno = false;
                        Accion();
                    }
                    break;
                case 3:
                    System.out.println("Tienes " + pactual + "€");
                    System.out.println();
                    Accion();
                    break;
                default:
                    System.out.println("Opción no válida");
                    Accion();
            }
        }
        if (comodin == true && turno == false) {
            System.out.println("Usas el comodin?");
            System.out.println("1-Si");
            System.out.println("2-No");
            opcion = lec.nextInt();
            switch (opcion) {
                case 1:
                    comodin = false;
                    Accion();
                    break;
                case 2:
                    System.out.println("Pierdes el turno");
                    break;
                default:
                    System.out.println("Opción no válida");
                    Accion();
            }
        }
    }

    public static void Panel() {
        {
            String panelo = PanelO.get(ronda).toString();
            if (npanel == 0) {
                for (int i = 0; i < caracteres.length; i++) {
                    char white = panelo.charAt(i);
                    boolean spacio = Character.isWhitespace(white);
                    if (spacio == true) {
                        caracteres[i] = ' ';
                    } else {
                        caracteres[i] = '*';
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(caracteres);
                System.out.println(sb);
                Pista();
            } else {
                System.out.println(caracteres);
                Pista();
            }

        }
    }

    public static void Comprobar() {

        String frase = PanelO.get(ronda).toString();
        char[] respuesta = caracteres;
        System.out.println("¿Que consonante dices?");
        letras = 0;
        char letra = lec.next().toUpperCase().charAt(0);
        if (letra == 65 || letra == 69 || letra == 73 || letra == 79 || letra == 85) {
            System.out.println("Dijiste una vocal.");
            Comprobar();
        } else {
            if (letDichas.contains(letra)) {
                System.out.println("La letra ya ha salido");
                System.out.println("Pierdes el turno");
                turno = false;
                Accion();
            } else {
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == letra) {
                        letras++;
                    }
                }
                System.out.println("La " + letra + " aparece " + letras + " veces");
                if (letras == 0) {
                    turno = false;
                    System.out.println("Pierdes el turno");
                }
            }
            for (int i = 0; i < frase.length(); i++) {
                char let = frase.charAt(i);
                if (let == letra) {
                    respuesta[i] = letra;
                    letDichas.add(let);
                }
            }
            System.out.println(respuesta);
            System.out.println("");
        }
    }

    public static void Vocal() {
        System.out.println("Quieres comprar vocal?");
        int opcion = 0;
        System.out.println("1-Si");
        System.out.println("2-No");
        opcion = lec.nextInt();
        switch (opcion) {
            case 1: {
                String frase = PanelO.get(ronda).toString();
                char rvocal[] = caracteres;
                System.out.println("¿Que vocal dices?");
                char letra = lec.next().toUpperCase().charAt(0);
                int vocal = 0;
                if (letDichas.contains(letra)) {
                    System.out.println("La letra ya ha salido");
                    System.out.println("Pierdes el turno");
                    turno = false;
                    Accion();
                } else {
                    if (letra == 65 || letra == 69 || letra == 73 || letra == 79 || letra == 85) {
                        pactual = pactual - 50;
                        for (int i = 0; i < frase.length(); i++) {
                            if (frase.charAt(i) == letra) {
                                vocal++;
                                rvocal[i] = letra;
                                letDichas.add(letra);
                            }
                        }
                        System.out.println("La " + letra + " aparece " + vocal + " veces");
                        System.out.println(rvocal);
                    } else {
                        System.out.println("Has dicho una consonante.");
                        Vocal();
                    }
                    break;
                }
            }
            case 2:
                Accion();
                break;
            default:
                System.out.println("Opción no válida");
                Accion();
        }
    }

    public static void Jugador() {
        if (turno = false) {
            jugador++;
        }
        if (jugador == 4) {
            jugador = 1;
        }
    }

}
