package com.misiontic.SistemaControlVacunacion.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.SistemaControlVacunacion.Model.UbicacionModel;
public interface IUbicacion extends JpaRepository<UbicacionModel,String>{
Optional<UbicacionModel> findBycodigoPostal(String codigoPostal);

}
