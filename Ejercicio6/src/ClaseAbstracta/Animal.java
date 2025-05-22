package ClaseAbstracta;



	
	
	public abstract class Animal {
	    public abstract void hacerSonido();
	}

	public class Perro extends Animal {
	    @Override
	    public void hacerSonido() {
	        System.out.println("Guau");
	    }
	}
	
	
	
	
	

