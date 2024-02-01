import java.awt.Color;

public class Ejercito {
    Soldado[] e;
    Color c;
    int reino;

    Ejercito(int reino) {
        this.reino = reino;
        this.e = new Soldado[(int) (Math.random() * 10 + 1)];
        for (int i = 0; i < e.length; i++) {
            e[i] = crearSoldado();
            e[i].setNombre(e[i].getNombre() + reino + "x" + String.valueOf(i));

        }
        if (reino == 1) {
            this.c = Color.BLUE;
        }
        if (reino == 2) {
            this.c = Color.red;
        }
    }

    public Soldado crearSoldado() {
        int op = (int) (Math.random() * 4);

        if (op == 0) {
            Arquero a = new Arquero();
            a.setNombre("Arco");
            a.setTipo(op);
            return a;
        }
        if (op == 1) {
            Caballero c = new Caballero();
            c.setNombre("Cabo");
            c.setTipo(op);
            return c;
        }
        if (op == 2) {
            Espadachin e = new Espadachin();
            e.setNombre("Espa");
            e.setTipo(op);
            return e;
        }
        if (op == 3) {
            Lancero l = new Lancero();
            l.setNombre("Lano");
            l.setTipo(op);
            return l;
        }
        return null;
    }

    public Soldado[] getSoldados() {
        return this.e;
    }

    public Color getColor() {
        return this.c;
    }

    public int getReino() {
        return reino;
    }
}
