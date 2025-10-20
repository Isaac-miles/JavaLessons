package dev.zico;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    private final static String CON_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(null,"Enter DB Username");
        JPasswordField passField = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, passField,"Enter DB Password",JOptionPane.OK_CANCEL_OPTION);
        final char[] password = (okCxl==JOptionPane.OK_OPTION)? passField.getPassword():null;

        try(Connection connection = DriverManager.getConnection(CON_STRING,username,String.valueOf(password))){
            System.out.println("Successfully connected to the music database");
            Arrays.fill(password,' ');
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
