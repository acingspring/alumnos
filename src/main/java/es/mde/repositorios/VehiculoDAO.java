package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Vehiculo;

@RepositoryRestResource(path="vehiculos",itemResourceRel="vehiculo",collectionResourceRel="vehiculos")
public interface VehiculoDAO extends JpaRepository<Vehiculo, Long> {

}
