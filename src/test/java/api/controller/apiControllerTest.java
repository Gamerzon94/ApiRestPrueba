package api.controller;

import api.domain.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class apiControllerTest {

    @InjectMocks
    apiController apiController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void getMensajeTest(){
        apiController.getMensaje();
    }

    @Test
    public void postMensajeTest(){
        Usuario usuario = new Usuario(1,"nombre","cargo","mensaje");
        apiController.postMensaje(usuario);
    }

    @Test
    public void postMensajeTestError(){
        apiController.postMensaje(null);
    }
}
