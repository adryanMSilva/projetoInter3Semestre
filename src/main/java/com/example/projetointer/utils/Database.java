package com.example.projetointer.utils;

public interface Database {
    static final String URL = "jdbc:mysql://localhost:3306/" + "SCHEMA_NOME?" + "zeroDateTimeBehavior=convertToNull";
    static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String USER = "root";
    public static final String PASS = "root123";
}
