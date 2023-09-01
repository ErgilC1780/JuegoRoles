public interface Personaje {
    void atacar (Personaje enemigo);
    void recibirDaño(int cantidad);

    String getNombre();


    int getPuntosVida();

    void atacar(Enemigo enemigoNormal);

}
