package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface InterfaceDatabase {
    public ResultSet executeSelectQuery(String qq) throws SQLException;
    public void executeUpdateQuery(String query) throws SQLException;
}
