package dev.zico;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class ConnectDB {
    private final static String CON_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args){
        String username = JOptionPane.showInputDialog(null,"Enter Database username");
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null,pf,"Enter password",JOptionPane.OK_CANCEL_OPTION);
        final char[] password = (okCxl==JOptionPane.OK_OPTION)? pf.getPassword() : null;

        var datasource = new MysqlDataSource();
//        datasource.setUrl(CON_STRING);
        datasource.setServerName("localhost");
        datasource.setDatabaseName("music");
        datasource.setPort(3306);

        try(Connection connection = datasource.getConnection(username,String.valueOf(password))){
            System.out.println("connected successfully");
            Arrays.fill(password, ' ');
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
