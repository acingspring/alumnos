package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

import es.mde.repositorios.UsuarioListener;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "USUARIOS")
@EntityListeners(UsuarioListener.class)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	@Column(length = 25, name = "apodo") //para ver que podemos limitar los caracteres de esta columna, nombre de la columna...
	private String nombre;
	private String correo;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Vehiculo.class, mappedBy = "usuario")
	private Collection<Vehiculo> vehiculos = new ArrayList<>();


	public Usuario() {}
	
	public Usuario(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Collection<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Collection<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void addVehiculos(Vehiculo vehiculo) {
		getVehiculos().add(vehiculo);
		vehiculo.setUsuario(this);
	}
}
