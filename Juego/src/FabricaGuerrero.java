public class FabricaGuerrero extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje(String nombre, int puntosVida) {
        return new JugadorGuerrero (nombre, puntosVida);
    }
}
