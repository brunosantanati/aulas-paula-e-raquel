package me.brunosantana.jframe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingTester {
    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setEnabled(false);
        JButton submitButton = new JButton("Submit");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ok Button clicked.");
            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Submit Button clicked.");
            }
        });

        frame.getRootPane().setDefaultButton(submitButton);

        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(submitButton);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}
