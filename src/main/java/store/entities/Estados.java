package store.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estados")
public class Estados {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstado;
    private String descripcion;
}
