package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.SistemaControlVacunacion.Model.PacienteModel;
import com.misiontic.SistemaControlVacunacion.Repository.IPaciente;
@Service
public class registroPacienteService  implements IregistroPacienteService{
@Autowired
private IPaciente repository;

@Override
public List<PacienteModel> all() {
	// TODO Auto-generated method stub
	return this.repository.findAll();
}

@Override
public Optional<PacienteModel> findBynoDocumento(String noDocumento) {
	// TODO Auto-generated method stub
	return this.repository.findBynoDocumento(noDocumento);
}

@Override
public PacienteModel save(PacienteModel registroPacienteM) {
	// TODO Auto-generated method stub
	return this.repository.save(registroPacienteM);
}

@Override
public void delete(String noDocumento) {
	// TODO Auto-generated method stub
	this.repository.deleteById(noDocumento);
}
}
