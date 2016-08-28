
package sys.been;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import sys.dao.ContactDAO;
import sys.daoimp.Contactdaoimp;
import sys.entidades.Contact;

@ManagedBean(name = "contactobb")
@ViewScoped
public class ContactBB {
    private List<Contact> listaContactos;
    private Contact contact;
    private String Estado = null;

   public ContactBB() {
       
    }

    public List<Contact> getListaContactos() {
         ContactDAO cDao = new Contactdaoimp();
        listaContactos = cDao.listarContactos();
        return listaContactos;
    }

    public void setListaContactos(List<Contact> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
   
    
}
