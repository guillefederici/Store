package store.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;
    private String descripcion;
    private String descrip_corta;
    private String material_producto;
    @ManyToOne
    private Marcas marca_producto;
    @ManyToOne
    private Modelos modelo_producto;
    @ManyToOne
    private Generos genero_producto;
    //private Colores color_producto; //preguntar si va o no
    private Boolean destacado;
    @ManyToOne
    private Estados estado_producto;
    private LocalDate fecha_ultimo_estado;
    
}
