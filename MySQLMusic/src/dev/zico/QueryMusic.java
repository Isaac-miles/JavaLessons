package dev.zico;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

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
    }
}
