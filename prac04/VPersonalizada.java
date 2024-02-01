import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class VPersonalizada extends JFrame {

    VPersonalizada() {
        setTitle("Juego Personalizado");
        setSize(650, 650);
        setLayout(new GridLayout(10, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        opciones();

        setVisible(true);
    }

    private void opciones() {
        JButton[] op = new JButton[10];
        for (int i = 0; i < 10; i++) {
            op[i] = new JButton("hola");
            this.add(op[i]);
        }

    }

}
