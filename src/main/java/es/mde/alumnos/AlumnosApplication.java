package es.mde.alumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import es.mde.entidades.Usuario;
import es.mde.entidades.Vehiculo;
import es.mde.repositorios.UsuarioDAO;
import es.mde.repositorios.VehiculoDAO;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
//@Import({ ConfiguracionPorJava.class })
public class AlumnosApplication {

	private static final Logger log = LoggerFactory.getLogger(AlumnosApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AlumnosApplication.class, args);

		System.err.println("Está funcionando la aplicación");
		log.debug("Está funcionando la aplicación");

//		UsuarioDAO usuarioDAO = context.getBean(UsuarioDAO.class);
//		Usuario usuario1 = usuarioDAO.save(generaUsuario());
//		Usuario usuario2 = usuarioDAO.save(generaUsuario());
//		Usuario usuario3 = usuarioDAO.save(generaUsuario());
//		List<Usuario> usuarios = usuarioDAO.findAll();
//		usuarios.stream().map(Usuario::toString).forEach(log::info);
//
//		VehiculoDAO vehiculoDAO = context.getBean(VehiculoDAO.class);
//		vehiculoDAO.save(generaVehiculo());
//		vehiculoDAO.save(generaVehiculo());
//		vehiculoDAO.save(generaVehiculo());
//		List<Vehiculo> vehiculos = vehiculoDAO.findAll();
//		vehiculos.stream().map(Vehiculo::toString).forEach(log::info);

//		vehiculoDAO.save(generaVehiculoConUsuario(usuario1));
//		vehiculoDAO.save(generaVehiculoConUsuario(usuario1));
//		vehiculoDAO.save(generaVehiculoConUsuario(usuario1));
//		vehiculoDAO.save(generaVehiculoConUsuario(usuario2));
//		vehiculoDAO.save(generaVehiculoConUsuario(usuario2));
//		vehiculoDAO.save(generaVehiculoConUsuario(usuario3));
//		List<Vehiculo> vehiculos = vehiculoDAO.findAll();

//		context.close();
//		System.err.println("Está cerrándose la aplicación");

	}

	static Vehiculo generaVehiculoConUsuario(Usuario usuario) {
		int numero = 10000;
		String vehiculo = "Vehiculo" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Vehiculo(vehiculo, usuario);
	}

	static Usuario generaUsuario() {

		int numero = 10000;
		String usuario = "Usuario" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Usuario(usuario, usuario + "@mail.com");
	}

	static Vehiculo generaVehiculo() {

		int numero = 10000;
		String vehiculo = "Vehiculo" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Vehiculo(vehiculo);
	}
}
