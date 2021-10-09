package observer2;

import observer2.peso_arg_observador;
import observer2.peso_mx_observador;
import observer2.sol_observador;
import observer2.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new sol_observador(subject);
		new peso_arg_observador(subject);
		new peso_mx_observador(subject);
		
		System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 d�lares obtendr� : ");
		subject.setEstado(100);
	}
}
