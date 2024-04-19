package com.app.ioc;

public class Usuario {
	
	InterfazUsuario usr;
	
	public Usuario(InterfazUsuario usr) {
		this.usr=usr;

	}

	public void getInsertarUsuario() {
		System.out.println("Syso de la clase Usuario");
		usr.insertaUsuario();
		
	}

	public void getEliminarUsuarioByID(int id) {
		usr.eliminaUsuario(id);
	}
	
	
}
