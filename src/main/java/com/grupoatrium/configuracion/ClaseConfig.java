package com.grupoatrium.configuracion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Direccion;
import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.ConnectionMgr;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;

@Configuration
@PropertySource("classpath:config/data-source.properties")     
	//curiosamente, no funcionaba esta ruta, supongo que por no colgar de ninguna entrada del classpath: classpath:/src/main/resources/config/data-source.properties
public class ClaseConfig {
	@Autowired
	Environment env;
	private Direccion direccion2;
	
	@Bean
	public Direccion getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(Direccion direccion2) {
		this.direccion2 = direccion2;
	}

	@Bean
	public Editorial editorial1() {
		Editorial editorial = new Editorial();
		editorial.setNif("A10000001");
		editorial.setNombre("Editorial 1");
		return editorial;
	}
	
	// Con Bean interno con nombre:
	@Bean
	public Editorial editorial2() {
		Editorial editorial = new Editorial();
		editorial.setNif("A10000002");
		editorial.setNombre("Editorial 2");
		direccion2 = new Direccion();
		direccion2.setCalle("Paseo de las Delicias");
		direccion2.setCp(28002);
		direccion2.setNumero(2);
		direccion2.setPoblacion("Madrid");
		direccion2.setProvincia("Madrid");
		editorial.setDireccion(direccion2);
		return editorial;
	}
	
	//Bean interno anónimo
	@Bean
	public Editorial editorial3() {
		Editorial editorial = new Editorial();
		editorial.setNif("A10000003");
		editorial.setNombre("Editorial 3");
		editorial.setDireccion(new Direccion("Mayor", 3, "Madrid", 28003, "Madrid"));
		return editorial;
	}
	
	@Bean
	public Direccion direccion4() {
		Direccion direccion = new Direccion();
		direccion.setCalle("Paseo del Prado");
		direccion.setCp(28004);
		direccion.setNumero(4);
		direccion.setPoblacion("Madrid");
		direccion.setProvincia("Madrid");
		return direccion;
	}
	
	// Bean inyectando bean normal
	@Bean
	public Editorial editorial4() {
		Editorial editorial = new Editorial();
		editorial.setNif("A10000004");
		editorial.setNombre("Editorial 4");
		editorial.setDireccion(direccion4());
		return editorial;
	}
	
	@Bean
	public Autor autor1() {
		Autor autor = new Autor();
		autor.setComentarios("Sin comentarios 1.");
		autor.setNacionalidad("España");
		autor.setNombre("nombre autor 1");
		return autor;
	}
	
	@Bean
	public Autor autor2() {
		Autor autor = new Autor();
		autor.setComentarios("Sin comentarios 2.");
		autor.setNacionalidad("España");
		autor.setNombre("nombre autor 2");
		return autor;
	}	
	
	@Bean
	public Autor autor3() {
		Autor autor = new Autor();
		autor.setComentarios("Sin comentarios 3.");
		autor.setNacionalidad("España");
		autor.setNombre("nombre autor 3");
		return autor;
	}	
	
	@Bean
	public Libro libro1() {
		Libro libro = new Libro();
		libro.setIsbn("isbn 1");
		libro.setTitulo("título 1");
		List<Autor> listAutores = new ArrayList<Autor>();
		listAutores.add(autor1());
		listAutores.add(autor2());
		listAutores.add(autor3());
		libro.setAutores(listAutores);
		libro.setEditorial(editorial1());
		libro.setPrecio(11);
		libro.setDescripcion("Descripción 1.");
		libro.setPublicacion(1);
		return libro;
	}
	
	//Punto 6: obtener constantes de fichero de propiedades:
	@Bean
	public ConnectionMgr connectionMgr() {
		ConnectionMgr connectionMgr =  new ConnectionMgr();
		connectionMgr.setDriver(env.getProperty("driver"));
		connectionMgr.setUrl(env.getProperty("url"));
		connectionMgr.setUsuario(env.getProperty("user"));
		connectionMgr.setPassword(env.getProperty("pw"));
		return connectionMgr;
	}
	
	//Punto 7: bean abstracto
	//Esto no se como hacerlo y me da la impresión de que por el momento no merece la pena investigarlo.
	//<bean id="abstractDAO" abstract="true">
	//	<property name="connMgr">
	//	<ref bean="connectionMgr" />
	//	</property>
	//</bean>
//	@Bean
//	public void abstractDAO() {};
	
	//Punto 8:
//	<bean id="librosDAO" parent="abstractDAO" class="com.grupoatrium.persistencia.impl.LibrosDAO"/>
//	<bean id="editorialesDAO" parent="abstractDAO" class="com.grupoatrium.persistencia.impl.EditorialesDAO"/>
	@Bean 
	public LibrosDAO librosDAO() {
		LibrosDAO librosDAO = new LibrosDAO();
		librosDAO.setConnMgr(connectionMgr());
		return librosDAO;
	}
	@Bean
	public EditorialesDAO editorialesDAO() {
		EditorialesDAO editorialesDAO = new EditorialesDAO();
		editorialesDAO.setConnMgr(connectionMgr());
		return editorialesDAO;
	}
	
}
