import java.util.Scanner;

public class git_figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int lado ;
			int base;
			int altura;
			
			
			char opc;
			do {
			System.out.println("Selecciona el arrea a calcular");
			System.out.println("a) Area del Triangulo");
			System.out.println("b) Area del Cuadrado");
			System.out.println("c) Area del Rectangulo");
			
			System.out.println("d) Salir ");
			opc = sc.next().charAt(0);
			
			switch (opc){
			
			case 'a' :
				System.out.println("Introduce la Base");
				base = sc.nextInt();
				System.out.println("Introduce la Altura");
				altura = sc.nextInt();
				int area = base*altura/2;
				System.out.println("El area es "+ area);
				
				
			case 'b' : //lado*lado
			case 'c' : //base*altura
			case 'd' : System.out.println ("Saliste"); break;
			default : System.out.println ("Selcciona una opcion correcta"); break;
				
			}
			}while (opc == 'e');
			
			sc.close();
		
	}

}
