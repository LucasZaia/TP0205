package Class;

public class Principal {

	public static void main(String[] args) {
		
		Iimposto imp = new ImpostoImplement();
		
		System.out.println("<--------Calculadora de impostos-------> ");
		System.out.println("--------Valor Original: " + imp.calcularImposto() + "--------");
		System.out.println("---------------------------------------");
		
		Iimposto impA = new ImpostoA(imp);
		
		System.out.println("<-------- O imposto A calcula sobre o Bruto ---->");
		System.out.println("--------Valor: " + impA.calcularImposto() + "-----------");
		System.out.println("---------------------------------------");
		
		Iimposto impB = new ImpostoB(impA);
		
		System.out.println("<-------- O imposto B calcula sobre o valor original menos o imposto A ---->");
		System.out.println("--------Valor: " + impB.calcularImposto() + "-----------");
		System.out.println("---------------------------------------");
		
		Iimposto impC = new ImpostoC(impB);
		
		System.out.println("<-------- O imposto C calcula sobre o bruto ---->");
		System.out.println("--------Valor: " + impC.calcularImposto() + "-----------");
		System.out.println("---------------------------------------");
		
		Iimposto impD = new ImpostoD(impB);
		
		
		
		System.out.println("<-------- O imposto D calcula sobre o bruto menos o imposto B, menos o imposto C ---->");
		System.out.println("--------Valor: " +  (impD.calcularImposto() - impC.calcularImposto()) + "---->");
		System.out.println("---------------------------------------");


	}

}
