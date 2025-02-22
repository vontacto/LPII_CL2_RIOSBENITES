package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario{

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_RIOSBENITESMARIO");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el listado de la base de datos..
		List<TblUsuariocl2> listadousuarios=em.createQuery("select p from TblUsuariocl2 p",TblUsuariocl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listadousuarios;
	} //fin del metodo listado...

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
