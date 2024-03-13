package es.mde.rest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Mixins {
	@JsonPropertyOrder({ "correo", "nombre" })
	// @JsonIgnoreProperties({"correo"})//si quiero que en el GET no me incluya una propiedad...
	public static interface Usuarios {
	}

	@JsonPropertyOrder({ "nombre", "puertas" })
	public static interface Coches {
	}

	@JsonPropertyOrder({ "nombre", "tipoBarco" })
	public static interface Barcos {
	}

}
