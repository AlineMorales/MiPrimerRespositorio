package principal;

import ClaseAbstracta.Abogado;
import ClaseAbstracta.Medico;

public class Principal {

	public static void main(String[] args) {
		
		//intanciar 
		Abogado abogado =  new Abogado("Ricardo", "Jimenez", 30, 41643447, "UNAM", 6, "Litigante", "bufete no 2", 2500);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//intanciar medico 
		Medico medico =  new Medico("Julio", "Gomez", 32, 564945, "buap", 9, "Medico Familiar", "el ahorro", 1200);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
		
		
		
		
		
		
	}

}
