package com.example.cattinder.users.model;

public class User {
    private Long id;
    private String name;
    private String email;
    private boolean active; // Nuevo campo para estado del usuario

    // Constructor principal
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = true; // Por defecto activo
    }

    // Constructor completo (por si quieres crear con estado específico)
    public User(Long id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
