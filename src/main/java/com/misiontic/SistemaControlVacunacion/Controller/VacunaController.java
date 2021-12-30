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
import com.misiontic.SistemaControlVacunacion.Model.VacunaModel;
import com.misiontic.SistemaControlVacunacion.Service.IUbicacionService;
import com.misiontic.SistemaControlVacunacion.Service.IVacunaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/vacuna")
public class VacunaController {
	@Autowired 
	private IVacunaService serviceRP;
	@GetMapping
	public List<VacunaModel>all() {
		return serviceRP.all();
	}
	@GetMapping("{id_proceso}")
	public Optional<VacunaModel>show(@PathVariable String id_proceso) {
		return serviceRP.findByid_proceso(id_proceso);
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public VacunaModel save(@RequestBody VacunaModel vacunaMo) {
		return serviceRP.save(vacunaMo);
	}
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public VacunaModel update(@PathVariable String id_proceso, @RequestBody VacunaModel registroVacunaM) {
		Optional<VacunaModel> op = serviceRP.findByid_proceso(id_proceso);
		if(!op.isEmpty()) {
			VacunaModel vacunaModelUpdate = op.get();
			vacunaModelUpdate.setFarmaceutica(registroVacunaM.getFarmaceutica());
			vacunaModelUpdate.setDosis(registroVacunaM.getDosis());
			vacunaModelUpdate.setFecha(registroVacunaM.getFecha());
			vacunaModelUpdate.setPuestoVacunacion(registroVacunaM.getPuestoVacunacion());
			return serviceRP.save(vacunaModelUpdate);		
			}
		return registroVacunaM;
	}
	@DeleteMapping("{id_proceso}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id_proceso) {
		serviceRP.delete(id_proceso);
	}
	}

