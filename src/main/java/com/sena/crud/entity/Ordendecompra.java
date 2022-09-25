package com.sena.crud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordendecompra")
public class Ordendecompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_OrdendeCompra", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_Proveedor", nullable = false)
    @JsonBackReference
    private Proveedor proveedor;

    @Column(name = "fechaEntrada", nullable = false)
    private LocalDateTime birthDate;

    @Column(name = "cantidad", nullable = false)
    private float cant;

    @Column(name = "unidadDeMedida", nullable = false, length = 250)
    private String uni;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime crat;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime upat;

    public Ordendecompra() {
    }

    public Ordendecompra(Proveedor proveedor, LocalDateTime birthDate, float cant, String uni, LocalDateTime crat, LocalDateTime upat) {
        this.proveedor = proveedor;
        this.birthDate = birthDate;
        this.cant = cant;
        this.uni = uni;
        this.crat = crat;
        this.upat = upat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public LocalDateTime getCrat() {
        return crat;
    }

    public void setCrat(LocalDateTime crat) {
        this.crat = crat;
    }

    public LocalDateTime getUpat() {
        return upat;
    }

    public void setUpat(LocalDateTime upat) {
        this.upat = upat;
    }
}
