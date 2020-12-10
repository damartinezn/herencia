package com.clearminds.tests;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager pm = new PersonaManager();
		pm.insertarPersona(new Persona("Danny Alexander archivos", "Martinez Narvaez", 29));
	}
}
