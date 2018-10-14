package com.settings.db;

import java.sql.*;

/**
 * Created by saar on 2/13/17.
 */
public class DBHandler extends DBController{
    //Data members
    private Connection connection;
    private String url;
    private String user;
    private String password;

    //C'tor
    public DBHandler(String url, String user, String password) {
        super();
        this.url = url;
        this.user = user;
        this.password = password;
    }

    //Getter
    public String getUrl() {
        return url;
    }

    //Setter
    public void setUrl(String url) {
        this.url = url;
    }

    //Getter
    public String getUser() {
        return user;
    }

    //Setter
    public void setUser(String user) {
        this.user = user;
    }

    //Getter
    public String getPassword() {
        return password;
    }

    //Setter
    public void setPassword(String password) {
        this.password = password;
    }

    //Getter
    public Connection getConnection() {
        return connection;
    }

    /**
     * The function connects to the database,
     * It uses it data members - scrum, user, password
     *
     * @return the connection, null if fails
     */
    public Connection connect() throws SQLException {
        this.connection = DriverManager.getConnection(url, user, password);
        return this.connection;
    }

    @Override
    public void disconnect() {

    }

    /**
     * The function executes a query on the DB.
     * The call for the connection must be made before the call for the executeQuery function.
     *
     * @param query The query to execute
     * @return The Result set returned according to the query
     */
    public ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt = this.connection.createStatement();
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
