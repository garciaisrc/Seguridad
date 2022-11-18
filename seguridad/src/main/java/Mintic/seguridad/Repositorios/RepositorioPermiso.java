package Mintic.seguridad.Repositorios;

import Mintic.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String>
{
}
