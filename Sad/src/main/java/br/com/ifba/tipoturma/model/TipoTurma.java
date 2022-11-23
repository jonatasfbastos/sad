import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Gislaine Nunes
 */
@Entity
@Table(name = "tipoturma")
@Data
public class TipoTurma extends PersistenceEntity implements Serializable {
    
    private String nome;
    private String descricao;

}