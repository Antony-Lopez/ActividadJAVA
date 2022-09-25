package com.sena.crud.repository;

import com.sena.crud.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository<Proveedor, Long> {
}
