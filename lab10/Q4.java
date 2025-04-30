package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(registerButton);
        frame.add(messageLabel);

        // Add action listener to the Register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validate inputs
                if (name.isEmpty()) {
                    messageLabel.setText("Name cannot be empty.");
                    return;
                }
                if (email.isEmpty() || !email.contains("@")) {
                    messageLabel.setText("Invalid email address.");
                    return;
                }
                if (password.isEmpty()) {
                    messageLabel.setText("Password cannot be empty.");
                    return;
                }
                if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match.");
                    return;
                }

                // If all validations pass
                messageLabel.setText("Registration successful!");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
