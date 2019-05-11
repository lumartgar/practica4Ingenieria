package Ejer1;

public class SueldoTest {
	public static void main(String[] args) {

		Sueldo s = new Sueldo();
		System.out.println("Método calcula Bruto. CASOS DE PRUEBA");
		
//		System.out.println("CASO 1");
//		System.out.print("Cod F, Ventas 1000, Sueldo Bruto: esperado 1000, ");
//		System.out.print("real: " + s.calculaBruto('F', 1000));
//		if (s.calculaBruto('F', 1000) == 1000) {
//			System.out.println(" Ok");
//		} else {
//			System.out.println(" Error");
//		}
		
		System.out.println("CASO 1");
		System.out.print("Cod F, Ventas 5000, Sueldo Bruto: esperado 1250, ");
		System.out.print("real: " + s.calculaBruto('F', 5000));
		if (s.calculaBruto('F', 5000) == 1250) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 2");
		System.out.print("Cod F, Ventas 4999, Sueldo Bruto: esperado 1000, ");
		System.out.print("real: " + s.calculaBruto('F', 4999));
		if (s.calculaBruto('F', 4999) == 1000) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 3");
		System.out.print("Cod E, Ventas 3000, Sueldo Bruto: esperado 450, ");
		System.out.print("real: " + s.calculaBruto('E', 3000));
		if (s.calculaBruto('E', 3000) == 450) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 4");
		System.out.print("Cod E, Ventas 5000, Sueldo Bruto: esperado 850, ");
		System.out.print("real: " + s.calculaBruto('E', 5000));
		if (s.calculaBruto('E', 5000) == 850) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 5");
		System.out.print("Cod E, Ventas 6000, Sueldo Bruto: esperado 1100, ");
		System.out.print("real: " + s.calculaBruto('E', 6000));
		if (s.calculaBruto('E', 6000) == 1100) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}

		System.out.println("Método calcula Retención. CASOS DE PRUEBA");

		System.out.println("CASO 1");
		System.out.print("Cod E, Bruto 1000, Retención: esperado 50, ");
		System.out.print("real: " + s.calculaRet('E', 1000));
		if (s.calculaRet('E', 1000) == 50) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 2");
		System.out.print("Cod E, Bruto 1000, Retención: esperado 50, ");
		System.out.print("real: " + s.calculaRet('E', 1000));
		if (s.calculaRet('E', 1000) == 50) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 3");
		System.out.print("Cod F, Bruto 1200, Retención: esperado 120, ");
		System.out.print("real: " + s.calculaRet('F', 1200));
		if (s.calculaRet('F', 1200) == 120) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}
		
		System.out.println("CASO 4");
		System.out.print("Cod F, Bruto 1500, Retención: esperado 225, ");
		System.out.print("real: " + s.calculaRet('F', 1500));
		if (s.calculaRet('F', 1500) == 225) {
			System.out.println(" Ok");
		} else {
			System.out.println(" Error");
		}

	}
}