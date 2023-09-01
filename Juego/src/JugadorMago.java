public class JugadorMago implements  Personaje{
    String nombre;
    int puntosVida;

    public JugadorMago(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dañoMaximo = 40;
        int dañoMinimo = 20;
        int dañoInfligido = (int) (Math.random() * (dañoMaximo - dañoMinimo +1 )) + dañoMinimo;
        System.out.println(nombre + " lanza un hechizo y hace " + dañoInfligido + " puntos de daño a " + enemigo.getNombre());
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
