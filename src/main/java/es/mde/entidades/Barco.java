package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BARCO")
public class Barco extends Vehiculo {

	private String tipoBarco;
	
	public Barco() {}
	
	public String getTipoBarco() {
		return tipoBarco;
	}
	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}
}
