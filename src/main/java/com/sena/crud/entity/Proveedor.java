package com.sena.crud.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Proveedor", nullable = false, unique = true)
    private long id;

    @Column(name = "tipo_DocProveedor", nullable = false, length = 250)
    private String tipo;

    @Column(name = "num_Documento", nullable = false, length = 250)
    private String doc;

    @Column(name = "nom_Proveedor", nullable = false, length = 250)
    private String nom;

    @Column(name = "ape_Proveedor", nullable = false, length = 250)
    private String ape;

    @Column(name = "tel_Proveedor", nullable = false)
    private long tel;

    @Column(name = "email_Proveedor", nullable = false, length = 250)
    private String email;

    @Column(name = "pass_Provedor", nullable = false, length = 250)
    private String password;

    @Column(name = "estadoUsuario", nullable = false, length = 250)
    private String esta;

    @Column(name = "create_at", nullable = false)
    private LocalDate birthDate;

    @Column(name = "updated_at", nullable = false)
    private LocalDate lastDate;

    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Ordendecompra> ordendecompras = new ArrayList<>();

    public Proveedor() {
    }

    public Proveedor(String tipo, String doc, String nom, String ape, long tel, String email, String password, String esta, LocalDate birthDate, LocalDate lastDate) {
        this.tipo = tipo;
        this.doc = doc;
        this.nom = nom;
        this.ape = ape;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.esta = esta;
        this.birthDate = birthDate;
        this.lastDate = lastDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEsta() {
        return esta;
    }

    public void setEsta(String esta) {
        this.esta = esta;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }
}