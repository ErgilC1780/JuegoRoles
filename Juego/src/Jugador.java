public class Jugador implements  Personaje{
    private  String nombre;
    private  int puntosVida;

    public Jugador(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar(Personaje enemigo) {

    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosVida -= cantidad;
        if (puntosVida <= 0){
            System.out.println(nombre + " ha sido derrotado.");
        }
        else
        {
            System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    @Override
    public void atacar(Enemigo enemigoNormal) {

    }
}
