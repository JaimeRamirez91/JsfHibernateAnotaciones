package sys.entidades;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*
teoria de relaciones
http://www.tacs-utn.com.ar/Home/apuntes/hibernate---mapping-y-relaciones
*/
@Entity

@Table(name = "FACTURA")

public class Factura {

    @Id
    @GeneratedValue
    @Column(name = "CODIGO")
    private Long codigo = null;

    @OneToMany
    @JoinColumn(name = "FACT_ID")
    private Set<Item> items = new HashSet<Item>();

    public Factura() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

}
