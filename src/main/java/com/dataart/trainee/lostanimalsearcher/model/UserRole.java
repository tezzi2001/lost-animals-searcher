package com.dataart.trainee.lostanimalsearcher.model;

public enum UserRole {
    ADMIN, USER;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}




