package com.clearminds.tests;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager pm;
		try {
			
			pm = new PersonaManager();
			pm.insertarPersona(new Persona("Danny Alexander",
					"Martinez Narvaez", 29));
		} catch (InstanceException e) {
			e.printStackTrace();
			e.getMessage();
		}		
		System.out.println("fin del programa");
	}
}
