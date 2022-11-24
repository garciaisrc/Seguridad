package Mintic.seguridad.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import Mintic.seguridad.Modelos.Permiso;
import Mintic.seguridad.Modelos.PermisosRoles;
import Mintic.seguridad.Modelos.Rol;
import Mintic.seguridad.Repositorios.RepositorioPermiso;
import Mintic.seguridad.Repositorios.RepositorioPermisosRoles;
import Mintic.seguridad.Repositorios.RepositorioRol;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/permisos-roles")
public class ControladorPermisosRoles {
}
