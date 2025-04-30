package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("");

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Validate credentials
                if ("admin".equals(username) && "password".equals(password)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid credentials.");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
