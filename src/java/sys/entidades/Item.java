package sys.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
teoria de relaciones
http://www.tacs-utn.com.ar/Home/apuntes/hibernate---mapping-y-relaciones
*/
@Entity

@Table(name = "ITEM")

public class Item {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id = null;

    @ManyToOne
    @JoinColumn(name = "FACT_ID")
    @org.hibernate.annotations.ForeignKey(name = "FK_FACT_ID")
    private Factura factura;

    @Column(name = "CANTIDAD")
    private Long cantidad;

    @Column(name = "PROD_NOMBRE")
    private String nombreProducto;
    
    public Item(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    

}
