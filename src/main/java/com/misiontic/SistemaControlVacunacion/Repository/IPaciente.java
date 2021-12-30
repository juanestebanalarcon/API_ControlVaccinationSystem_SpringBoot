package com.misiontic.SistemaControlVacunacion.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.SistemaControlVacunacion.Model.PacienteModel;
public interface IPaciente extends JpaRepository<PacienteModel,String>{
Optional<PacienteModel> findBynoDocumento(String noDocumento);

}
