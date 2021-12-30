package com.misiontic.SistemaControlVacunacion.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.SistemaControlVacunacion.Model.VacunaModel;
public interface IVacunacion extends JpaRepository<VacunaModel,String>{
Optional<VacunaModel> findById_registro(String Id_registro);

}
