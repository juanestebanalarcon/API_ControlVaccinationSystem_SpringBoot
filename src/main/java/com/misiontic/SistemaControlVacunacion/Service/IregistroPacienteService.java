package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;

import com.misiontic.SistemaControlVacunacion.Model.PacienteModel;
public interface IregistroPacienteService {
	public List<PacienteModel> all();
	public Optional<PacienteModel>findBynoDocumento(String noDocumento);
	public PacienteModel save(PacienteModel registroPacienteM);
	public void delete(String noDocumento);
	

}
