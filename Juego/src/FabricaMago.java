public class FabricaMago extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje(String nombre, int puntosVida) {
        return new JugadorMago (nombre, puntosVida);
    }
}
