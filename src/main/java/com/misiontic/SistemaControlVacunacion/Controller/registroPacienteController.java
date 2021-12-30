package com.misiontic.SistemaControlVacunacion.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.SistemaControlVacunacion.Model.PacienteModel;
import com.misiontic.SistemaControlVacunacion.Service.IregistroPacienteService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/paciente")
public class registroPacienteController {
@Autowired 
private IregistroPacienteService serviceRP;
@GetMapping
public List<PacienteModel>all() {
	return serviceRP.all();
}
@GetMapping("{noDocumento}")
public Optional<PacienteModel>show(@PathVariable String noDocumento) {
	return serviceRP.findBynoDocumento(noDocumento);
}
@PostMapping
@ResponseStatus(code = HttpStatus.CREATED)
public PacienteModel save(@RequestBody PacienteModel registroPacienteMo) {
	return serviceRP.save(registroPacienteMo);
}
@PutMapping
@ResponseStatus(code = HttpStatus.CREATED)
public PacienteModel update(@PathVariable String noDocumento, @RequestBody PacienteModel registroPacienteM) {
	Optional<PacienteModel> op = serviceRP.findBynoDocumento(noDocumento);
	if(!op.isEmpty()) {
		PacienteModel registroPacienteModelUpdate = op.get();
		registroPacienteModelUpdate.setNombres(registroPacienteM.getNombres());
		registroPacienteModelUpdate.setApellidos(registroPacienteM.getApellidos());
		registroPacienteModelUpdate.setTipoDoc(registroPacienteM.getTipoDoc());
		return serviceRP.save(registroPacienteModelUpdate);
	}
	return registroPacienteM;
}
@DeleteMapping("{noDocumento}")
@ResponseStatus(code = HttpStatus.NO_CONTENT)
public void delete(@PathVariable String noDocumento) {
	serviceRP.delete(noDocumento);
}
}
