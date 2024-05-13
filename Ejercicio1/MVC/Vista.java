package Ejercicio1.MVC;

import javax.swing.*;

public class Vista extends JFrame {
    private JLabel nombreLabel;
    private JLabel menuLabel;

    public Vista() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        nombreLabel = new JLabel();
        menuLabel = new JLabel();

        this.add(nombreLabel);
        this.add(menuLabel);
    }

    public void updateView(String nombre, String menu) {
        nombreLabel.setText("Nombre: " + nombre);
        menuLabel.setText("Menu: " + menu);
    }
}
