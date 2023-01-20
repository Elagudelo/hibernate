package com.hibernate.introduction.modelo;


import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellido")
    private String apellidos;
    @Column(name = "email")
    private String email;
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    public Usuarios(int id, String nombres, String apellidos, String email, Date fecha_nacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    // MODIFICADORES

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

}
