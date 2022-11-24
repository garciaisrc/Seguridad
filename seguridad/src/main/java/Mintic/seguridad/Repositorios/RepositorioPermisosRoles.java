package Mintic.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import Mintic.seguridad.Modelos.PermisosRoles;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}