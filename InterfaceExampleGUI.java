
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
package javaapplication3;  // ✅ adjust package name to match your project

import javax.swing.*;
import java.awt.*;

// Interface
interface Vehicle {
    void start(JTextArea area);
    void stop(JTextArea area);
}

// Car class implementing the interface
class Car implements Vehicle {
    @Override
    public void start(JTextArea area) {
        area.append("Car is starting...\n");
    }

    @Override
    public void stop(JTextArea area) {
        area.append("Car has stopped.\n");
    }
}

// Bike class implementing the interface
class Bike implements Vehicle {
    @Override
    public void start(JTextArea area) {
        area.append("Bike is starting...\n");
    }

    @Override
    public void stop(JTextArea area) {
        area.append("Bike has stopped.\n");
    }
}

// Main GUI class
public class InterfaceExampleGUI extends JFrame {

    private JTextArea outputArea;
    private JButton carStartBtn, carStopBtn, bikeStartBtn, bikeStopBtn;

    private Vehicle car, bike;

    public InterfaceExampleGUI() {
        setTitle("Vehicle Interface Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create vehicles
        car = new Car();
        bike = new Bike();

        // Buttons
        carStartBtn = new JButton("Car Start");
        carStopBtn = new JButton("Car Stop");
        bikeStartBtn = new JButton("Bike Start");
        bikeStopBtn = new JButton("Bike Stop");

        // Output area
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components
        add(carStartBtn);
        add(carStopBtn);
        add(bikeStartBtn);
        add(bikeStopBtn);
        add(scrollPane);

        // Button actions
        carStartBtn.addActionListener(e -> car.start(outputArea));
        carStopBtn.addActionListener(e -> car.stop(outputArea));
        bikeStartBtn.addActionListener(e -> bike.start(outputArea));
        bikeStopBtn.addActionListener(e -> bike.stop(outputArea));

        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceExampleGUI();
    }
}
