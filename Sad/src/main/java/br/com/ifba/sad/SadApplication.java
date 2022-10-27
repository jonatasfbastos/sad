package br.com.ifba.sad;

import br.com.ifba.sad.perfilusuario.view.TelaExibirPerfilUsuario;
import br.com.ifba.sad.usuario.view.TelaExibirUsuarios;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author Jonas Dias
 */
@SpringBootApplication
public class SadApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(SadApplication.class).headless(false).run(args);
        
        TelaExibirPerfilUsuario telaPerfilUsuario =  context.getBean(TelaExibirPerfilUsuario.class);
         telaPerfilUsuario.setVisible(true);
        
        //TelaExibirUsuarios telaExibirUsuarios = context.getBean(TelaExibirUsuarios.class);
        //telaExibirUsuarios.setVisible(true);
        
    }

}
