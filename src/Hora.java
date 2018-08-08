import java.util.Scanner;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;

	// Source --> generate constructor and field 
	public Hora(int hora, int minuto, int segundo) { // contructor

		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}

		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		} else {
			this.minuto = 0;
		}
		if (minuto >= 0 && minuto < 60) {
			this.segundo = segundo;
		} else {
			this.segundo = 0;
		}

	}
	
	// Source --> generate Getter y Setter
	public int getHora() { // Mostrar el contenido de cada uno
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else {
			System.out.println("Valor Erroneo");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {

		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		} else {
			System.out.println("Valor Erroneo");
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		} else {
			System.out.println("Valor Erroneo");
		}
	}

	public static int segundo(int hora, int min, int seg) {

		int segundos = 0;
		segundos = seg + (min * 60) + (hora * 60 * 60);

		return segundos;

	}

}
