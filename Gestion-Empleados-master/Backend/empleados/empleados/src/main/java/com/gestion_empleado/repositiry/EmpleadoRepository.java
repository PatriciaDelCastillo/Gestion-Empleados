package com.gestion_empleado.repositiry;

import com.gestion_empleado.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {
}
