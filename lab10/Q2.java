package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create the display field
        JTextField displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(displayField, BorderLayout.NORTH);

        // Create the panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Define button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Variables to store operands and operator
        final String[] operator = {""};
        final double[] operand1 = {0};

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            buttonPanel.add(button);

            // Add action listener to each button
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();

                    if ("0123456789".contains(command)) {
                        // Append digit to the display
                        displayField.setText(displayField.getText() + command);
                    } else if ("/*-+".contains(command)) {
                        // Store the first operand and operator
                        operand1[0] = Double.parseDouble(displayField.getText());
                        operator[0] = command;
                        displayField.setText("");
                    } else if ("=".equals(command)) {
                        // Perform the calculation
                        double operand2 = Double.parseDouble(displayField.getText());
                        double result = 0;

                        switch (operator[0]) {
                            case "+":
                                result = operand1[0] + operand2;
                                break;
                            case "-":
                                result = operand1[0] - operand2;
                                break;
                            case "*":
                                result = operand1[0] * operand2;
                                break;
                            case "/":
                                result = operand1[0] / operand2;
                                break;
                        }

                        displayField.setText(String.valueOf(result));
                    } else if ("C".equals(command)) {
                        // Clear the display
                        displayField.setText("");
                        operator[0] = "";
                        operand1[0] = 0;
                    }
                }
            });
        }

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}
