package com.clearminds.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;
	Properties p = new Properties();

	public PersonaManager() throws InstanceException {
		try {			
			Class<?> clase = Class.forName(obtenerClass());
			serv = (ServicioPersona) clase.newInstance();
		} catch ( Exception  e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	private String obtenerClass() throws FileNotFoundException, IOException{
		p.load(new FileReader("config.properties"));
		return p.getProperty("forName");
	}

}
