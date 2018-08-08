import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nacho
 *
 */
public class PruebaHora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int hora, min, seg;
		
		
		System.out.println("Introduce la hora");
		hora=teclado.nextInt();
		System.out.println("Introduce los minutos");
		min = teclado.nextInt();
		System.out.println("Introce los segundos");
		seg = teclado.nextInt();

		teclado.close();
		Hora miHora = new Hora(hora,min,seg);
		System.out.println(Hora.class);	//	System.out.println(miHora);
	//	System.out.println(miHora.getHora() + ":" + miHora.getMinuto() + ":" + miHora.getSegundo());
		
		System.out.printf("%02d:%02d:%02d \n",miHora.getHora(),miHora.getMinuto(),miHora.getSegundo());
		
		// si ponemos en el constructor de la clase hora public, nos deja leerlo normal
		//System.out.println(miHora.hora + ":" + miHora.minuto + ":" + miHora.segundo); 
	//	System.out.println(miHora.toString());
		
		
		System.out.println("Los segundos transcurridos son " + miHora.segundo(hora, min, seg));
		
		
		
	}
	
	

}
