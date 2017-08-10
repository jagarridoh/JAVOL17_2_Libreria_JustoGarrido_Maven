package com.grupoatrium.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.grupoatrium.modelo.Autor;

public class TestAutor {
	static private Autor a1;
	static private Autor a2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Dentro de setUpBeforeClass. Esto se debería ejecutar al principio solo.");
		a1 = new Autor();
		a2 = new Autor("Jose", "España", "Comentario Jose");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Dentro de tearDownAfterClass. Esto se debería ejecutar al final solo.");
		a1 = null;
		a2 = null;
	}

	@Before
	public void setUp() throws Exception {
		//setUp() method, which runs before every test invocation.
		System.out.println("Dentro de setUp. Esto se debería ejecutar antes de cada test.");
	}

	@After
	public void tearDown() throws Exception {
		//tearDown() method, which runs after every test method.
		System.out.println("Dentro de tearDown. Esto se debería ejecutar después de cada test.");
	} 

	@Test
	public final void testAutor() {
		System.out.println("Dentro de testAutor. Vamos a testear el constructor Autor sin parámetros");
		Autor a = new Autor();
		//pongo un assert cualquiera...
		org.junit.Assert.assertNotNull(a);
	}

	@Test
	public final void testAutorStringStringString() {
		System.out.println("Dentro de testAutor. Vamos a testear el constructor Autor con parámetros");
		Autor a = new Autor("Maria", "España", "Comentarios");
		//pongo un assert cualquiera...
		org.junit.Assert.assertNotNull(a);
		org.junit.Assert.assertEquals("Error en nombre", "Maria", a.getNombre());
		org.junit.Assert.assertEquals("Error en nacionalidad", "España", a.getNacionalidad());
		org.junit.Assert.assertEquals("Error en comentarios", "Comentarios", a.getComentarios());
	}

	@Test
	public final void testGetNombre() {
		System.out.println("Dentro de testAutor.");
		org.junit.Assert.assertEquals("Error en nombre", "", a1.getNombre());
		org.junit.Assert.assertEquals("Error en nombre", "Jose", a2.getNombre());
	}

	@Test
	public final void testSetNombre() {
		System.out.println("Dentro de testAutor.");
		a1.setNombre("Marta");
		a2.setNombre("Juan");
		org.junit.Assert.assertEquals("Error en nombre", "Marta", a1.getNombre());
		org.junit.Assert.assertEquals("Error en nombre", "Juan", a2.getNombre());
		a1.setNombre("");
		a2.setNombre("Jose");
		org.junit.Assert.assertEquals("Error en nombre", "", a1.getNombre());
		org.junit.Assert.assertEquals("Error en nombre", "Jose", a2.getNombre());
	}

	@Test
	public final void testToString() {
		System.out.println("Dentro de testAutor.");
		//este que falle:
		org.junit.Assert.assertEquals("Error en toString", "Texto cualquiera", a1.toString());
	}

	@Ignore("Este método aún no está definido")
	@Test
	public final void testIniciarMetodo() {
		System.out.println("Dentro de testAutor.");
		fail("Not yet implemented"); // TODO
	}

	@Ignore("Este método aún no está definido")
	@Test
	public final void testDestruirMetodo() {
		System.out.println("Dentro de testAutor.");
		fail("Not yet implemented"); // TODO
	}

}
