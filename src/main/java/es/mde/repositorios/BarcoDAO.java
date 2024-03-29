package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Barco;

@RepositoryRestResource(path="barcos",itemResourceRel="barco",collectionResourceRel="barcos")
public interface BarcoDAO extends JpaRepository<Barco, Long> {

}
