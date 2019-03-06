package api.domain;

import org.junit.Test;

public class UsuarioTest {

    @Test
    public void UsuarioTest(){
        Usuario usuario = new Usuario(1,"nombre","cargo","mensaje");
        usuario.getCargo();
        usuario.getId();
        usuario.getMensaje();
        usuario.getNombre();
        usuario.setCargo("cargo1");
        usuario.setId(2);
        usuario.setMensaje("mensaje 2");
        usuario.setNombre("nombre 2");

    }
}
