package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {

	void RegistrarUsuario(TblUsuariocl2 tblusuario);
	void ActualizarUsuario(TblUsuariocl2 tblusuario);
	void EliminarUsuario(TblUsuariocl2 tblusuario);
	List<TblUsuariocl2> ListadoUsuario();
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuario);
	
}