import java.awt.Color;

class Jugador{
    String nombre;
    Color color;
    int turno;

    Jugador(String nombre, Color color, int turno) {
        this.nombre = nombre;
        this.color = color;
        this.turno = turno;
    }
    public String getNombre() {
        return nombre;
    }
    public Color getColor() {
        return color;
    }
}
