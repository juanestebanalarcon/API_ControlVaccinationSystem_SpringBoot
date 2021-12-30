package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misiontic.SistemaControlVacunacion.Model.UbicacionModel;
@Service
public class UbicacionService  implements IUbicacionService{
@Autowired
private IUbicacionService repository;

@Override
public List<UbicacionModel> all() {
	// TODO Auto-generated method stub
	return this.repository.all();
}

@Override
public Optional<UbicacionModel> findBycodigoPostal(String codigoPostal) {
	// TODO Auto-generated method stub
	return this.repository.findBycodigoPostal(codigoPostal);
}

@Override
public UbicacionModel save(UbicacionModel ubicacionM) {
	// TODO Auto-generated method stub
	return this.repository.save(ubicacionM);
}

@Override
public void delete(String codigoPostal) {
	// TODO Auto-generated method stub
	this.repository.delete(codigoPostal);
}
}
