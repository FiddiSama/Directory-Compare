package de.fiddisstuff;

import javax.swing.*;

public class UI {
    private final JFrame frame;

    public UI() {
        frame = new JFrame("Directory Comparison Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
