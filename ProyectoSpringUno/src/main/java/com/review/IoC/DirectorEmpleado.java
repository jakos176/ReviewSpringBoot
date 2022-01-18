package com.review.IoC;

import com.review.DI.CreacionInformes;

public class DirectorEmpleado implements Empleados {
	
	//Creation of field of type "CreacionInformes"(interface)
	private CreacionInformes informeNuevo;
	
	//Dependency Injection
	public DirectorEmpleado(CreacionInformes informenuevo) {
		this.informeNuevo = informenuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		return "Informe creado por el Director: "+ informeNuevo.getInforme();
	}

}
