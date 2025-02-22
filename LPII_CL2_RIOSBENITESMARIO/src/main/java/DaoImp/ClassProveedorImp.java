package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp  implements IProveedor{

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		//permite gestionar entidades..
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblproveedor);
		//emitimos mensaje por pantalla....
		System.out.println("Proveedor registrado correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();
		
	}  //fin del metodo....

	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
		// nos conectamos con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//actualizamos
		em.merge(tblproveedor);
		//emitimos mensaje por consola
		System.out.println("datos actualizado correctamente ");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}  //fin del metodo...

	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
		///establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperar el codigo a eliminar...
		TblProveedorcl2 tblprov=em.merge(tblproveedor);
		//procedemos a eliminar
		em.remove(tblprov);
		System.out.println("dato eliminado");
		em.getTransaction().commit();
		em.close();	
	} //fin del metodo eliminar...

	@Override
	public List<TblProveedorcl2> ListadoProveedor() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el listado de la base de datos..
		List<TblProveedorcl2> listadoproveedores=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listadoproveedores;
	} //fin del metodo listado...

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {
		// establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		//para administrar la transacciones
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el codigo a buscar...
		TblProveedorcl2 tblprov=em.find(TblProveedorcl2.class,tblproveedor.getIdproveedorcl2());
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos la transaccion.
		em.close();
		//retornamos el registro solicitado..
		return tblprov;
	}  //fin del buscar...

}   //fin de la clase...