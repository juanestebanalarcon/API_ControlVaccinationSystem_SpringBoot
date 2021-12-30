package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misiontic.SistemaControlVacunacion.Model.VacunaModel;
@Service
public class VacunaService  implements IVacunaService{
@Autowired
private IVacunaService repository;

@Override
public List<VacunaModel> all() {
	// TODO Auto-generated method stub
	return this.repository.all();
}

@Override
public Optional<VacunaModel> findByid_proceso(String id_proceso) {
	// TODO Auto-generated method stub
	return this.repository.findByid_proceso(id_proceso);
}

@Override
public VacunaModel save(VacunaModel vacunaM) {
	// TODO Auto-generated method stub
	return this.repository.save(vacunaM);
}

@Override
public void delete(String id_proceso) {
	// TODO Auto-generated method stub
	this.repository.delete(id_proceso);
}
}
