package com.employee.EmpDB.Model;

public class JwtResponse {
    private String token;
    private String username;
    private boolean success;
    private String role;
    private String message;

    // No-argument constructor
    public JwtResponse() {
    }

    // Parameterized constructor
    public JwtResponse(String token, String username, boolean success, String role, String message) {
        this.token = token;
        this.username = username;
        this.success = success;
        this.role = role;
        this.message = message;
    }

    // Getters and setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
