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
import com.misiontic.SistemaControlVacunacion.Model.UbicacionModel;
import com.misiontic.SistemaControlVacunacion.Service.IUbicacionService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ubicacion")
public class UbicacionController {
	@Autowired 
	private IUbicacionService serviceRP;
	@GetMapping
	public List<UbicacionModel>all() {
		return serviceRP.all();
	}
	@GetMapping("{codigoPostal}")
	public Optional<UbicacionModel>show(@PathVariable String codigoPostal) {
		return serviceRP.findBycodigoPostal(codigoPostal);
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UbicacionModel save(@RequestBody UbicacionModel ubiMo) {
		return serviceRP.save(ubiMo);
	}
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UbicacionModel update(@PathVariable String codigoPostal, @RequestBody UbicacionModel registroUbiM) {
		Optional<UbicacionModel> op = serviceRP.findBycodigoPostal(codigoPostal);
		if(!op.isEmpty()) {
			UbicacionModel ubiModelUpdate = op.get();
			ubiModelUpdate.setPais(registroUbiM.getPais());
			ubiModelUpdate.setDepartamento(registroUbiM.getDepartamento());
			ubiModelUpdate.setCiudad(registroUbiM.getCiudad());
			return serviceRP.save(ubiModelUpdate);		
			}
		return registroUbiM;
	}
	@DeleteMapping("{codigoPostal}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String codigoPostal) {
		serviceRP.delete(codigoPostal);
	}
	}

