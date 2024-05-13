package MVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestauranteUI extends JFrame {
    private JButton botonReservar;
    private JButton botonOrdenar;
    private JButton botonCancelar;
    private RestauranteController controller;

    public RestauranteUI(RestauranteController controller) {
        this.controller = controller;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        botonReservar = new JButton("Reservar");
        botonOrdenar = new JButton("Ordenar");
        botonCancelar = new JButton("Cancelar");

        botonReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.reservar();
            }
        });

        botonOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.ordenar();
            }
        });

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.cancelar();
            }
        });

        this.add(botonReservar);
        this.add(botonOrdenar);
        this.add(botonCancelar);
    }

    public static void main(String[] args) {
        RestauranteModel model = new RestauranteModel();
        RestauranteView view = new RestauranteView();
        RestauranteController controller = new RestauranteController(model, view);
        new RestauranteUI(controller).setVisible(true);
    }
}
