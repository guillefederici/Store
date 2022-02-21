package store.entities;

import java.io.Serializable;
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
@Table(name = "stock")
public class Stock implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStock;
    @ManyToOne
    private Productos idProducto; // ?
    @ManyToOne
    private Colores color_producto;
    @ManyToOne
    private Talles talle_producto;
    private Integer stock_actual;
    private Integer punto_pedido; // ?
    private Double precio_menor;
    private Double precio_mayor;
    private Integer porcentaje_desc;
    private LocalDate fecha_ultimo_estado;
}
