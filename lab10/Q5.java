package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());

        // Create the label to display elapsed time
        JLabel timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(timeLabel, BorderLayout.CENTER);

        // Create the buttons
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Timer variables
        final int[] elapsedTime = {0}; // Elapsed time in seconds
        final Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime[0]++;
                timeLabel.setText(String.valueOf(elapsedTime[0]));
            }
        });

        // Add action listener for the Start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!timer.isRunning()) {
                    timer.start();
                }
            }
        });

        // Add action listener for the Stop button
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                }
            }
        });

        // Add action listener for the Reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                elapsedTime[0] = 0;
                timeLabel.setText("0");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
