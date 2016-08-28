
package sys.daoimp;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.entidades.Contact;
import sys.dao.ContactDAO;
import sys.util.HibernateUtil;
public class Contactdaoimp implements ContactDAO{

    @Override
    public List<Contact> listarContactos() {
       List<Contact> lista = null;
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction t = session.beginTransaction();
       String hql = "FROM Contact";
       /*
       inner join fetch hace que se llene el objeto estadoProducto con todos los datos en una 
       sola consulta para evitar el error de que el proxy no esta inicializado
       buscar aquimas info:
       
       http://www.javatutoriales.com/2009/09/hibernate-parte-7-hql-primera-parte.html
       
       
       */
      // String hql = "from Producto p inner join fetch p.estadoProducto";

        try {
            lista = session.createQuery(hql).list();
            t.commit();
            
            session.close();
        } catch (Exception e) {
            t.rollback();
        }
       /* for(Cliente c:lista){
            System.out.println("---------------------------------");
            System.out.println(c.getApellidos());
            System.out.println("----------------------------------");
        }*/     
        return lista;
    }
}
