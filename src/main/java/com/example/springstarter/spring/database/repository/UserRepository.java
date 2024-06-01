package com.example.springstarter.spring.database.repository;

import com.example.springstarter.spring.database.pool.ConnectionPool;

public class UserRepository {
    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
