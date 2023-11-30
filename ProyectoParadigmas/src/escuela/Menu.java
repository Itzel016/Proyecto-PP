package escuela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.getContentPane().setBackground(new Color(255, 255, 128));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(461, 328);

        // Crear un JLabel para mostrar la imagen
        JLabel labelImagen = new JLabel();
        labelImagen.setIcon(new ImageIcon("C:\\Users\\Josue Sebastian\\Downloads\\Proyecto\\Imagenes\\images.jpeg"));
        labelImagen.setBounds(76, 44, 284, 145); // Ajusta la posición y el tamaño según tus necesidades

        // Botón para cambiar a la otra interfaz
        JButton btnInterfazPelea = new JButton("Interfaz Registro");
        btnInterfazPelea.setBounds(110, 221, 200, 30);

        frame.getContentPane().add(btnInterfazPelea);
        frame.getContentPane().add(labelImagen);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        btnInterfazPelea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Interfaz2.main(null);
                frame.dispose();
            }
        });
    }
}
