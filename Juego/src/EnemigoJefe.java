public class EnemigoJefe implements Enemigo {
    private String nombre;
    private int puntosVida;

    public EnemigoJefe (String nombre, int puntosVida){
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar (Personaje objetivo){
        int cantidadAtaque = 25;
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " y le hace " + cantidadAtaque + " puntos de daño");
        objetivo.recibirDaño(cantidadAtaque);
    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosVida -= cantidad;
        if (puntosVida <= 0 ){
            System.out.println(nombre + " ha sido derrotado.");
        }
        else{
            System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPuntosVida() {
        return puntosVida;
    }
}
