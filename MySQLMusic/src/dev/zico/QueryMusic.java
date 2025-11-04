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
import java.util.Scanner;

public class QueryMusic {
    public static void main(String[] args) {
        Properties props = new Properties();
        try{
            props.load(Files.newInputStream(Path.of("music.properties"), StandardOpenOption.READ));
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        var datasource = new MysqlDataSource();
        datasource.setServerName(props.getProperty("serverName"));
        datasource.setPort(Integer.parseInt(props.getProperty("port")));
        datasource.setDatabaseName(props.getProperty("databaseName"));

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an artist Id: ");
//        int artistID = Integer.parseInt(sc.nextLine());

//        String query = "SELECT * FROM music.albumview WHERE album_name='%s'".formatted(artistID);
        try {
            datasource.setMaxRows(10);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT * FROM music.artists limit 10";

//        String query =
//                """
//                 WITH RankedRows As (
//                                    SELECT *,
//                                    ROW_NUMBER() OVER (ORDER BY artist_id) AS row_num FROM music.artists
//                                    )
//                                SELECT * FROM RankedRows WHERE row_num <=10""";

        try(var connection = datasource.getConnection(props.getProperty("user"),System.getenv("MYSQL_PASS")
        ); Statement statement = connection.createStatement()){
            System.out.println("Connection Established successfully");
            ResultSet resultSet = statement.executeQuery(query);

            var meta = resultSet.getMetaData();

            System.out.println("=".repeat(30));
            for(var i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
            }
            System.out.println();
            while (resultSet.next()){
                for(var i = 1; i <= meta.getColumnCount(); i++) {
                    System.out.printf("%-15s", resultSet.getString(i).toLowerCase());
                }
                System.out.println();
//                System.out.printf("%d %s %s %n",resultSet.getInt("track_number"),
//                        resultSet.getString("artist_name"),
//                        resultSet.getString("song_title"));

            }
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

    }
}
