/**
 * 
 */
package com.example.springboot.app.models.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author bmartinez
 *
 */
public interface IUploadFileService {

	/**
	 * Mostrar la imagen
	 * 
	 * @param filename
	 * @return
	 */
	public Resource load(String filename) throws MalformedURLException ;
	
	/**
	 * Toma la imagen original la copia al directorio
	 * y renombra. Retorna el nuevo nombre para poder 
	 * obtenerla en el controller
	 * 
	 * @param file
	 * @return
	 */
	public String copy(MultipartFile file) throws IOException;
	
	/**
	 * Elimina la img 
	 * 
	 * @param filename
	 * @return
	 */
	public boolean delete(String filename);
	
	/**
	 * Eliminara el directorio de forma recursiva de las imagenes
	 */
	public void deleteAll();
	
	/**
	 * Creará el directorio upload cada vez que arranque el sistema
	 * 
	 * @throws IOException
	 */
	public void init() throws IOException;
	
}
