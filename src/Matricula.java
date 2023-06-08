
public class Matricula {
	
	final static String nombreModuloUno = "Bases de datos"; 
	final static String nombreModuloDos = "Lenguaje de marcas";
	final static String nombreModuloTres = "Programación";
	final static int importeModulo = 50;
	
	
	boolean matriculaModuloUno;
	boolean matriculaModuloDos;
	boolean matriculaModuloTres;
	String nombreAlumno;
	
	
	public Matricula (){
		
		this.nombreAlumno = " ";
		this.matriculaModuloUno = false;
		this.matriculaModuloDos = false;
		this.matriculaModuloTres = false;
		
	}
	
	
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	
	public void setMatriculaModuloUno (boolean matriculaModuloUno) {
		
		this.matriculaModuloUno = matriculaModuloUno;
	}
	public boolean getmatriculaModuloUno () {
		
		return this.matriculaModuloUno;
	}
	
	
	
	public void setMatriculaModuloDos(boolean matriculaModuloDos) {
		this.matriculaModuloDos = matriculaModuloDos;
	}
	
	public boolean getMatriculaModuloDos() {
		return matriculaModuloDos;
	}
	
	

	public void setMatriculaModuloTres(boolean matriculaModuloTres) {
		this.matriculaModuloTres = matriculaModuloTres;
	}
	public boolean getMatriculaModuloTres() {
		return matriculaModuloTres;
	}
	
	
	public boolean viabilidadMatricula (boolean matriculaModuloUno, boolean matriculaModuloDos, boolean matriculaModuloTres) {
		
		if (matriculaModuloUno == true || matriculaModuloDos == true || matriculaModuloTres == true) {
			
			return true;
		}
		
		else {
			
			return false;
		}

	}
	
	public int calculaImporteMatricula () {
		
		    if (this.matriculaModuloUno && this.matriculaModuloDos && this.matriculaModuloTres) {
		    	
		        return 150;
		        
		    } else if (this.matriculaModuloUno && this.matriculaModuloDos) {
		    	
		        return 100;
		        
		        
		    }else if (this.matriculaModuloUno && this.matriculaModuloTres) {
		    	
		        return 100;  
		        
		    }else if (this.matriculaModuloTres&& this.matriculaModuloDos) {
			    	
			    return 100;    
		        
		        
		    } else if (this.matriculaModuloUno) {
		    	
		        return 50;
		        
		        
		    } else if (this.matriculaModuloDos) {
		    	
		        return 50;   
		        
		    } else if (this.matriculaModuloTres) {
		    	
		        return 50; 
		    
		    } else {
		    	
		    	return 0;
		    }

	}
	
}
