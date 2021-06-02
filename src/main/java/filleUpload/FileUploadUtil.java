package filleUpload;
import java.io.*;

import org.springframework.core.io.Resource;
import java.nio.file.*;
import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;

public class FileUploadUtil {

	     
	    public static void saveFile(String uploadDir, String fileName,
	            MultipartFile multipartFile) throws IOException {
	        Path uploadPath = Paths.get(uploadDir);
	         
	        if (!Files.exists(uploadPath)) {
	            Files.createDirectories(uploadPath);
	        }
	         
	        try (InputStream inputStream = multipartFile.getInputStream()) {
	            Path filePath = uploadPath.resolve(fileName);
	            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
	        } catch (IOException ioe) {        
	            throw new IOException("Could not save image file: " + fileName, ioe);
	        }      
	    }
	    
	    
	    /// cette test existance de fichier 
	        public static boolean loadFileAsResource(String fileName,String uploadDir) throws Exception {
	        	   Path uploadPath = Paths.get(uploadDir);
	            try {
	                Path filePath = uploadPath.resolve(fileName).normalize();
	                Resource resource = new UrlResource(filePath.toUri());
	                if(!resource.exists()) {
	                    return true;
	                } else {
	                    throw new FileNotFoundException("File not found " + fileName);
	                }
	    
	            } catch (MalformedURLException ex) {
	            throw new FileNotFoundException("File not found " + fileName);
	   
	            }
	 
	        }
}
