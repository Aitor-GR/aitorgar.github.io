package ruleta;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

     /**
     * 
     * @param pactual La puntuacion del jugador en este panel
     * @param turno Boleano que indica el turno del jugador
     * @param jugador Numero del jugador que empieza
     * @param ronda numero de la ronda para selccionar el panel y su pista
     * 
     */
    
    static Scanner lec = new Scanner(System.in);
    static int letras = 0;
    static boolean turno = true;
    static boolean comodin = false;
    static int numJugador = 0;
    static int ronda = 0;
    static ArrayList<String> PanelO;
    static char[] caracteres;
    static int npanel = 0;
    static int puntuacionActual = 0;
    static ArrayList<Character> letDichas = new ArrayList<>();
    static ArrayList<Jugadores> Jugador= new ArrayList<>();;

    public static void PanelO() {
         /**
         *Método donde guardamos los paneles en un ArrayList
         */
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
         /**
         *Método donde guardamos las pistas en un ArrayList
         */
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
    
    public static void Jugador() {
        Jugador.add(new Jugadores());
        Jugador.add(new Jugadores());
        Jugador.add(new Jugadores());
        Jugador.get(numJugador);
    }

    public static void Gajos() {
        /**
         * Método para tener todos los gajos en cada posible tirada.
         */
        //int gajo = new java.util.Random().nextInt(23);
        int gajo =21;
        switch (gajo) {
            case 0 -> {
                System.out.println("X2");
                Comprobar();
                puntuacionActual = puntuacionActual * 2;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            case 1 -> {
                System.out.println("1/2");
                Comprobar();
                puntuacionActual = puntuacionActual / 2;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            case 2 -> {
                System.out.println("Pierde turno");
                cambioJugador();
            }
            case 3 -> {
                System.out.println("Quiebra");
                puntuacionActual = 0;
                cambioJugador();
            }
            case 4 -> {
                System.out.println("Comodin");
                Comprobar();
                comodin = true;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            case 5, 6, 7, 8, 9 -> {
                System.out.println("50€");
                Comprobar();
                puntuacionActual = puntuacionActual + 50 * letras;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            case 10, 11, 12, 13, 14, 15, 16 -> {
                System.out.println("100€");
                Comprobar();
                puntuacionActual = puntuacionActual + 100 * letras;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            case 17, 18 -> {
                System.out.println("200€");
                Comprobar();
                puntuacionActual = puntuacionActual + 200 * letras;
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
            
            case 19, 20, 21, 22, 23 -> {
                System.out.println("150€");
                Comprobar();
                Jugadores jugadorActual= Jugador.get(numJugador);
                puntuacionActual= (jugadorActual.getPuntuacionActual()+ 150 * letras);
                jugadorActual.setPuntuacionActual(puntuacionActual);
                if (puntuacionActual >= 50) {
                    Vocal();
                }
            }
        }
        Accion();
    }
    
    public static void Accion() {
         /**
          * Aquí declaramos las acciones que puede hacer el jugador, 
          * que son tirar la ruleta, resolver panel y consultar el dinero de ese panel.
          */
        int opcion = 0;
        turno = true;
        if (comodin == false || comodin == true) {
            System.out.println("Esta jugando el jugador "+(numJugador+1));
            System.out.println("1-Tirar.");
            System.out.println("2-Resolver.");
            System.out.println("3-Consultar dinero.");
            opcion = lec.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println();
                    npanel++;
                    Gajos();
                }
                case 2 -> {
                    System.out.println("Introduce la respuesta");
                    String respuesta = lec.nextLine();
                    respuesta = lec.nextLine();
                    if (respuesta.toUpperCase().equals(PanelO.get(ronda))) {
                        System.out.println("Panel correcto, has resuelto con "+puntuacionActual+"€");
                        System.out.println("Siguiente ronda");
                        System.out.println("");
                        ronda++;
                        npanel=0;
                        letDichas = new ArrayList<>();
                        PanelO();
                        Panel();
                    } else {
                        System.out.println("Fallaste el panel");
                        cambioJugador();
                        Accion();
                    }
                }
                case 3 -> {
                    System.out.println("Tienes " + puntuacionActual + "€");
                    System.out.println();
                    Accion();
                }
                default -> {
                    System.out.println("Opción no válida");
                    Accion();
                }
            }
        }
    }

    public static void Panel() {
        /**
         * Método para ocultar el panel
         */
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

        /**
         * Método que comprueba si la consonante dicha está en el panel,y si la consonante dicha es repetida
         */
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
                cambioJugador();
                Accion();
            } else {
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == letra) {
                        letras++;
                    }
                }
                System.out.println("La " + letra + " aparece " + letras + " veces");
                if (letras == 0) {
                    cambioJugador();
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
        /**
         * Método como el de comprobar, pero para las vocales, que es llamado en el turno 
         */
        if(turno=true){
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
                        puntuacionActual = puntuacionActual - 50;
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
                    if (puntuacionActual >= 50) Vocal();
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
    }
    
    public static void cambioJugador() {
        turno=false;
        if (comodin == true && turno == false) {
            System.out.println("Usas el comodin?");
            System.out.println("1-Si");
            System.out.println("2-No");
            int opcion = lec.nextInt();
            switch (opcion) {
                case 1:
                    comodin = false;
                    Accion();
                    break;
                case 2:
                    System.out.println("Pierdes el turno");
                    cambioJugador();
                    break;
                default:
                    System.out.println("Opción no válida");
                    Accion();
            }
        }
        if (turno == false) {
            numJugador++;
        }
        if (numJugador == Jugador.size()) {
            numJugador = 0;
        }
    }
    
}