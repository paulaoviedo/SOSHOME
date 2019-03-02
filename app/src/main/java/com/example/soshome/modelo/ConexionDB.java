package com.example.soshome.modelo;

import android.content.Context;
import android.widget.Toast;

import com.example.soshome.MainActivity;

import java.sql.*;
import javax.swing.*;

public class ConexionDB {

    public String db="sql10281098";
    public String url="jdbc:mysql://sql10.freesqldatabase.com:3306/sql10281098";
    public String user="sql10281098";
    public String pass="XwILe1l1Yp";

    public Connection Conectar(Context c){
        Connection link = null;

        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link= DriverManager.getConnection(this.url,this.user,this.pass);

        }catch (Exception ex){
            Toast.makeText(c,"db not working",Toast.LENGTH_LONG).show();
        }
        return link;
    }

}
