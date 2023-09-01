public class JuegoPrincipal {
        public static void main(String[] args) {
            // Crear fábricas de personajes y enemigos
            FabricaPersonajes fabricaJugadorGuerrero = new FabricaGuerrero();
            FabricaPersonajes fabricaJugadorMago = new FabricaMago();
            FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
            FabricaEnemigos fabricaEnemigoJefe = new FabricaEnemigoJefe();

            // Crear jugadores y enemigos utilizando las fábricas
            Personaje jugadorGuerrero = fabricaJugadorGuerrero.crearPersonaje("Jugador Guerrero", 100);
            Personaje jugadorMago = fabricaJugadorMago.crearPersonaje("Jugador Mago", 80);
            Enemigo enemigoNormal = fabricaEnemigoNormal.crearEnemigo();
            Enemigo enemigoJefe = fabricaEnemigoJefe.crearEnemigo();

            // Realizar algunas interacciones
            jugadorGuerrero.atacar( enemigoNormal);
            jugadorMago.atacar( enemigoNormal);
            enemigoNormal.atacar(jugadorGuerrero);
            enemigoJefe.atacar(jugadorGuerrero);
            jugadorGuerrero.atacar(enemigoJefe);

            // Imprimir los puntos de vida restantes después de las interacciones
            System.out.println("Puntos de vida del Guerrero: " + jugadorGuerrero.getPuntosVida());
            System.out.println("Puntos de vida del Mago: " + jugadorMago.getPuntosVida());
            System.out.println("Puntos de vida del Enemigo: " + enemigoNormal.getPuntosVida());
            System.out.println("Puntos de vida del Enemigo Jefe: " + enemigoJefe.getPuntosVida());
        }
    }


