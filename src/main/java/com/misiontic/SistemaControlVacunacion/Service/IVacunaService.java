package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import com.misiontic.SistemaControlVacunacion.Model.VacunaModel;
public interface IVacunaService {
	public List<VacunaModel> all();
	public Optional<VacunaModel>findByid_proceso(String id_proceso);
	public VacunaModel save(VacunaModel vacModel);
	public void delete(String id_proceso);
	

}
