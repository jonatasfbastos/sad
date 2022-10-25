package br.com.ifba.sad;

import br.com.ifba.sad.infrastructure.service.IFacade;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.usuario.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Jonas Dias
 */
@SpringBootApplication
public class SadApplication implements CommandLineRunner {
    
    @Autowired
    private IFacade facade;
    
    public static void main(String[] args) {
        SpringApplication.run(SadApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        // Aqui o projeto roda tranquilo, mas com as telas não! //
        // Corrigiram aee KKKKKKKK //
        
        PerfilUsuario perfil = new PerfilUsuario();
        perfil.setNome("Aluno");
        perfil.setDescricao("Aluno IFBA");
        
        facade.savePerfilUsuario(perfil);
        
        Usuario usuario = new Usuario();
        usuario.setLogin("Login_Viu");
        usuario.setNome("Meu nome");
        usuario.setSenha("Invisivel");
        
        PerfilUsuario busca = facade.findByIdPerfilUsuario(1L);
        usuario.setPerfilusuario(busca);
        
        facade.saveUsuario(usuario);
    }

}
