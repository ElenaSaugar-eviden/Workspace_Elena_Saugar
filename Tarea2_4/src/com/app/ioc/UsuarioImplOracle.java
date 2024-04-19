package com.app.ioc;

public class UsuarioImplOracle implements InterfazUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Oracle");
	}

	@Override
	public void eliminaUsuario(int id){
		System.out.println("Eliminando usuario en Oracle: "+id);
	
		
	}

}
