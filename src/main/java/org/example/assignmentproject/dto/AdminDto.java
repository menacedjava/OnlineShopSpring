package org.example.assignmentproject.dto;




public class AdminDto {
    private String username;
    private String password;

    public AdminDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AdminDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
