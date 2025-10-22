package dev.zico;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class QueryMusic {
    public static void main(String[] args) {
        Properties props = new Properties();
        try{
            props.load(Files.newInputStream(Path.of("music.properties"), StandardOpenOption.READ));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        String albumName = "Tapestry";
        String query = "SELECT * FROM music.albumview WHERE album_name='%s'".formatted(albumName);

        var datasource = new MysqlDataSource();
        datasource.setServerName(props.getProperty("serverName"));
        datasource.setPort(Integer.parseInt(props.getProperty("port")));
        datasource.setDatabaseName(props.getProperty("databaseName"));

        try(var connection = datasource.getConnection(props.getProperty("user"),System.getenv("MYSQL_PASS")
        ); Statement statement = connection.createStatement()){
            System.out.println("Connection Established successfully");
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.printf("%d %s %n",resultSet.getInt(1),resultSet.getString("artist_name"));
            }
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

    }
}
