package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Direccion;
import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.ConnectionMgr;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;

public class AppMain {

	public static void main(String[] args) {
		// Levantar el contexto de Spring. Crear el contenedor de beans a partir del archivo applicationContext.xml
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		
		// Punto 4
		Editorial editorial1 = applicationContext.getBean("editorial1", Editorial.class);
		Editorial editorial2 = applicationContext.getBean("editorial2", Editorial.class);
		Editorial editorial3 = applicationContext.getBean("editorial3", Editorial.class);
		Editorial editorial4 = applicationContext.getBean("editorial4", Editorial.class);
		
		Autor autor1 = applicationContext.getBean("autor1", Autor.class);
		Autor autor2 = applicationContext.getBean("autor2", Autor.class);
		Autor autor3 = applicationContext.getBean("autor3", Autor.class);
		
		Libro libro1 = applicationContext.getBean("libro1", Libro.class);
		
		// Esto otro falla pues no encuentra el bean, es posible que sea correcto por ser un bean interno : Direccion direccion2 = applicationContext.getBean("direccion2", Direccion.class);
		Direccion direccion4 = applicationContext.getBean("direccion4", Direccion.class);
		
		// Punto 6
		ConnectionMgr connectionMgr = applicationContext.getBean("connectionMgr", ConnectionMgr.class);
		
		// Punto 8
		LibrosDAO librosDAO = applicationContext.getBean("librosDAO", LibrosDAO.class);
		EditorialesDAO editorialesDAO = applicationContext.getBean("editorialesDAO", EditorialesDAO.class);

		// Punto 4
		System.out.println(editorial1);
		System.out.println(editorial2);
		System.out.println(editorial3);
		System.out.println(direccion4);	
		System.out.println(editorial4);	
		
		System.out.println(autor1);
		System.out.println(autor2);
		System.out.println(autor3);	
		
		System.out.println(libro1);
		
		// Punto 6
		System.out.println(connectionMgr);
		
		// Punto 8
		System.out.println(librosDAO);
		System.out.println(editorialesDAO);		
	}
}
