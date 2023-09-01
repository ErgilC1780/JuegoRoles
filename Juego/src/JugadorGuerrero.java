public class JugadorGuerrero implements  Personaje{
    String nombre;
    int puntosVida;

    public JugadorGuerrero(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dañoMaximo = 60;
        int dañoMinimo = 40;
        int dañoInfligido = (int) (Math.random() * (dañoMaximo - dañoMinimo +1 )) + dañoMinimo;
        System.out.println(nombre + "lanza un ataque y hace " + dañoInfligido + "puntos de daño a " + enemigo.getNombre());
        enemigo.recibirDaño(dañoInfligido);
    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosVida -= cantidad;
        if (puntosVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño.");
        }
    }

    @Override
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
