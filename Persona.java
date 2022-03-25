public class Persona {
   private String nombre;
   private int edad;
   private String poblacion;

   public Persona(String nombre,int edad, String poblacion){
      this.nombre = nombre;
      this.edad = edad;	
      this.poblacion = poblacion;
   }
	
   public Persona() {
      this.nombre=null;
      this.poblacion = null;
   }
	 
   public void setNombre(String nom){
      nombre = nom;
   }

   public void setEdad(int ed){
      edad = ed;
   }

   public void setPoblacion(String poblacion){
      this.poblacion = poblacion;
   }

   public String getNombre(){
      return nombre;
   }
   
   public int getEdad(){
      return edad;
   }

   public String getPoblacion(){
        return poblacion;
   }

}//fin Persona
