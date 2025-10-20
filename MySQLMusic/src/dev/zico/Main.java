package dev.zico;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(null,"Enter DB Username");
        JPasswordField passField = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, passField,"Enter DB Password",JOptionPane.OK_CANCEL_OPTION);
        final char[] password = (okCxl==JOptionPane.OK_OPTION)? passField.getPassword():null;
    }
}
