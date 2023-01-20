package com.hibernate.introduction;

import com.hibernate.introduction.modelo.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotatedClassType;
import org.hibernate.cfg.Configuration;

public class App {
     int c = 9;

public static void main ( String [ ] args ) {
       // Crear objeto para el manejo de la sesión de la BD
       SessionFactory secionFactory = new Configuration()
       .configure(resource:"cfg.xml")     
       .addAnnotatedClass (annotatedClass: Usuarios.class )
       .buildSessionFactory();
System.out.println (x:" Hola mundo") ;




       System.out.println(" Hola mundo");




   }

}