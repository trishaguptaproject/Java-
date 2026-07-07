
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

    package javaapplication3;  // ✅ Make sure this matches your project package

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Abstract class
abstract class MathCalculator {
    abstract double operate(double x, double y);

    void showResult(String operation, double result, JTextArea area) {
        area.append(operation + " = " + result + "\n");
    }
}

// Power class
class Power extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.pow(x, y);
    }
}

// Modulus class
class Modulus extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return x % y;
    }
}

// Maximum class
class Maximum extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.max(x, y);
    }
}

// Minimum class
class Minimum extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.min(x, y);
    }
}

// Main GUI class
public class CalculatorGUI extends JFrame {

    JTextField num1Field, num2Field;
    JTextArea resultArea;

    JButton powerBtn, modBtn, maxBtn, minBtn;

    public CalculatorGUI() {
        setTitle("Math Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input fields
        add(new JLabel("Number 1:"));
        num1Field = new JTextField(10);
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField(10);
        add(num2Field);

        // Buttons
        powerBtn = new JButton("Power");
        modBtn = new JButton("Modulus");
        maxBtn = new JButton("Maximum");
        minBtn = new JButton("Minimum");

        add(powerBtn);
        add(modBtn);
        add(maxBtn);
        add(minBtn);

        // Result area
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Button actions
        powerBtn.addActionListener(e -> calculate(new Power(), "Power"));
        modBtn.addActionListener(e -> calculate(new Modulus(), "Modulus"));
        maxBtn.addActionListener(e -> calculate(new Maximum(), "Maximum"));
        minBtn.addActionListener(e -> calculate(new Minimum(), "Minimum"));

        setVisible(true);
    }

    void calculate(MathCalculator calculator, String operation) {
        try {
            double x = Double.parseDouble(num1Field.getText());
            double y = Double.parseDouble(num2Field.getText());

            double result = calculator.operate(x, y);
            calculator.showResult(operation, result, resultArea);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
