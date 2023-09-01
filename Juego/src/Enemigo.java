public interface Enemigo {
    void atacar (Personaje objetivo);
    void recibirDaño (int cantidad);
    String getNombre();
    int getPuntosVida();
}
