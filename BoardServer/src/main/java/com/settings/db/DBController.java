package com.settings.db;

import com.jcraft.jsch.Session;

import java.sql.*;

/**
 * Created by hagairevah on 1/25/18.
 */
public abstract class DBController {
    //Data members
    private Connection connection;
    private String url;
    private String user;
    private String password;


    public DBController() {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public abstract Connection connect() throws SQLException;

    public abstract void disconnect();

    public ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.setQueryTimeout(3000);
        ResultSet rs = stmt.executeQuery(query);
        return rs;
    }

    public int updateQuery(String query) throws SQLException {
        // create the java mysql update preparedstatement
        PreparedStatement preparedStmt = this.connection.prepareStatement(query);
        int rs = preparedStmt.executeUpdate(query);
        return rs;
    }
}
