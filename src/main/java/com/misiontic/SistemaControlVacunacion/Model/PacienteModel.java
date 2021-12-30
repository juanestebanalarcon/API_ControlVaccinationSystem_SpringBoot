package com.misiontic.SistemaControlVacunacion.Model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="paciente")
public class PacienteModel implements Serializable{
	private static final long serialVersionUID = 1L;
	//Primary key
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String noDocumento;
	//Other columns
	@Column(name="nombres",length=30,nullable=false)
	private String nombres;
	@Column(name="apellidos",length=30,nullable=false)
	private String apellidos;
	@Column(name="tipoDoc",length=3,nullable=false)
	private String tipoDoc;
	@OneToOne(fetch= FetchType.EAGER,optional=false)
	@JoinColumn(name="idUbicacion",nullable=false,unique=true)
	private UbicacionModel codigoPostal;
	@OneToMany(fetch= FetchType.EAGER)
	@JoinColumn(name="idVacuna",nullable=false,unique=true)
	private VacunaModel id_proceso;
	//getters and setters
	public String getNoDocumento() {
		return noDocumento;
	}
	public void setNoDocumento(String noDocumento) {
		this.noDocumento = noDocumento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public UbicacionModel getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(UbicacionModel codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public VacunaModel getId_proceso() {
		return id_proceso;
	}
	public void setId_proceso(VacunaModel id_proceso) {
		this.id_proceso = id_proceso;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
