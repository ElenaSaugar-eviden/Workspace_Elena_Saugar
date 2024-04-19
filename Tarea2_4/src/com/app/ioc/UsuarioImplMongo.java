package com.app.ioc;

public class UsuarioImplMongo implements InterfazUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Mongo");

	}

	@Override
	public void eliminaUsuario(int id) {
		System.out.println("Eliminando usuario en Mongo");

	}

}
