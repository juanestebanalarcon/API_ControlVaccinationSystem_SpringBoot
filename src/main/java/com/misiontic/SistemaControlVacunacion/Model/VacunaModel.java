package com.misiontic.SistemaControlVacunacion.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="vacuna")
public class VacunaModel implements Serializable{
private static final long serialVersionUID =1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String id_proceso;
@Column(name="farmaceutica",length=10,nullable=false)
private String farmaceutica;
@Column(name="dosis",length=2,nullable=false)
private String dosis;
@Column(name="fecha",nullable=false)
private Date fecha;
@Column(name="puestoVacunacion",length=100,nullable=false)
private String puestoVacunacion;

public String getIdProceso() {
	return id_proceso;
}
public void setIdProceso(String id_proceso) {
	this.id_proceso = id_proceso;
}

public String getFarmaceutica() {
	return farmaceutica;
}
public void setFarmaceutica(String farmaceutica) {
	this.farmaceutica = farmaceutica;
}
public String getDosis() {
	return dosis;
}
public void setDosis(String dosis) {
	this.dosis = dosis;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getPuestoVacunacion() {
	return puestoVacunacion;
}
public void setPuestoVacunacion(String puestoVacunacion) {
	this.puestoVacunacion = puestoVacunacion;
}
}
