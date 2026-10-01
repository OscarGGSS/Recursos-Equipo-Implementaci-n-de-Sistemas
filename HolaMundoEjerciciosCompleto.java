import java.util.*;


//1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!"

public class HolaMundoEjercicios{

	public static void main(String[] args){
	
		System.out.println("¡Hola Lizeth!");
		
	}
	
}


//2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
	
		System.out.println("Hola \nMundo");
		
	}
}


//3. Añade un comentario sobre lo que hace cada linea del programa.

public class HolaMundoEjercicios{  //Creación de la clase llamada "HolaMundoEjercicios"

	public static void main(String[] args){ //Creación del metodo para que se puede ejecutar el programa
		
		System.out.println("Hola \nMundo"); //Se imprime la linea de Hola mundo en dos lineas.
	}
}

//4. Crea un comentario de varias lineas

/*

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
	
		System.out.println("BTS para el siguente añio");
		
	}
}
*/


//5. Imprime tu edad, tu color favorito y tu ciudad.

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
		
		System.out.println("Tengo veinte años");
		System.out.println("Mi color favorito es el verde");
		System.out.println("Vivo en la Ciudad de México, Coyoacan");
		
	}
}

//6. Explorar los diferentes System.xxx.println(); más alla de "out"


//print

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
	
		System.out.print("Hola, soy Lizeth. ");
		System.out.print("Me gusta BTS, los tacos y los elotes");
	}
}


//println

public class HolaMundoEjercicios{

	public static void main(String[] args){	
		
		System.out.println("Hola, soy Lizeth. ");
		System.out.println("Me gusta BTS, los tacos y los elotes");
		
	}
}


//printf

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
		
		String nombre = "Lizeth";
		int edad = 20;
		String nacionalidad = "Mexicana";
		String bts = "RM";
		
		System.out.printf("Hola, me llamp %s, tengo %d y soy de nacionalidad %s. Me gusta BTS y mi integrante favorito es %s", nombre, edad, nacionalidad, bts);
	}
}

//7. Utiliza varios println para imprimir una frase

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
		
		System.out.println("Incluso");
		System.out.println("si");
		System.out.println("no");
		System.out.println("estás");
		System.out.println("en");
		System.out.println("el");
		System.out.println("camino");
		System.out.println("perfecto, ");
		System.out.println("cualquier");
		System.out.println("camino");
		System.out.println("es");
		System.out.println("mejor");
		System.out.println("que");
		System.out.println("estar");
		System.out.println("perdido.");
		System.out.println("- RM");
		
	}
}

//8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos)

public class HolaMundoEjercicios{
	
	public static void main(String[] args){
		
		System.out.println("************************");
		System.out.println("****     *****      ****");
		System.out.println("***       ***        ***");
		System.out.println("***        *         ***");
		System.out.println("****                ****");
		System.out.println("*****              *****");
		System.out.println("******            ******");
		System.out.println("*******          *******");
		System.out.println("********        ********");
		System.out.println("*********      *********");
		System.out.println("**********    **********");
		System.out.println("***********  ***********");
		System.out.println("************************");
	}
}

//9. Intenta ejecutar el programa sin el método main y observa el resultado

public class HolaMundoEjercicios{
	
}

//Comentario: No deja ejecutarlo al no tener el metodo main (el cual ayuda para compilar el programa)

//10. Intenta cambial el nombre del archivo a uno diferente del de la clase

public class HolaMundo{
	
	public class static main(String[] args){
	
		System.out.println("Hola Mundo!");
		
	}
}

//ComentariO: No deja compilarlo, ya que no es el mismo nombre como nombrambros el archivo
