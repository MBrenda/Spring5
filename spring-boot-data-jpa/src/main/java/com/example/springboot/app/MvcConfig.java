package com.example.springboot.app;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	/*private final Logger log = LoggerFactory.getLogger(getClass());
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		super.addResourceHandlers(registry);
		
		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
		log.info(resourcePath);
		
		// asi agrego la carpeta uploads como un recurso publico
		registry.addResourceHandler("/uploads/**").addResourceLocations(resourcePath);

	}*/

//	ESTA ES UNA CLASE PARA PODER GUARDAR LAS IMAGENES FUERA DEL PROYECTO
//	creamos y registramos un directorio /upload el cual esta mapeado a un recurso
// el cual tiene un lugar fisico dentro del servidor (resourcePath)

}
