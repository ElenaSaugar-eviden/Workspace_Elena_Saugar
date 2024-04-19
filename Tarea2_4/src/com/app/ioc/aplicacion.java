package com.app.ioc;

public class aplicacion {

	public static void main(String[] args) {
		//creamos la instancia de la clase Usuario
		Usuario obj = new Usuario(new UsuarioImplMongo());
		//llamamos a insertar y eliminar usuario
		obj.getInsertarUsuario();
		obj.getEliminarUsuarioByID(1);


	}

}