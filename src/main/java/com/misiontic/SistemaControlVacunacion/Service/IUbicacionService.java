package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import com.misiontic.SistemaControlVacunacion.Model.UbicacionModel;
public interface IUbicacionService {
	public List<UbicacionModel> all();
	public Optional<UbicacionModel>findBycodigoPostal(String codigoPostal);
	public UbicacionModel save(UbicacionModel ubiModel);
	public void delete(String codigoPostal);
	

}
