package com.aliwert.controller;

public class BaseController {
    public <T> RootEntity<T> ok(T payload) {
       return RootEntity.ok(payload);
    }

    public <T> RootEntity<T> error(String errorMessage) {
       return RootEntity.error(errorMessage);
    }
}
