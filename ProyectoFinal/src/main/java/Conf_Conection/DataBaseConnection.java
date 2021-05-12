package Conf_Conection;

import java.sql.*;

public class DataBaseConnection {

    private Connection dbcon;
    private final String name = "localhost";
    private final String port = "3307";
    private final String dbName = "progra_web";
    private final String url = "jdbc:mysql://" + name + ":" + port + "/" + dbName;
    private static DataBaseConnection connected = null;
    
    private DataBaseConnection(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         dbcon = DriverManager.getConnection(url, "root", "");     
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    public static DataBaseConnection getConnection(){
        if(connected == null){
            connected = new DataBaseConnection();
        }
        return connected;
    }
    public Connection get_Connection(){
        return dbcon;
    }
}
