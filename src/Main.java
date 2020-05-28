public class Main {
	public static void main(String[] args) {
		
		//Probando construcotr polynomial que inicializa en 0 .
		polynomial b = new polynomial();
		System.out.println("Polinimio b inicializado en 0: " + b.toString());
		
		
		//Probando constructor polynomial(int _coef[]) y metodo setCoefficient.
		int[] aa= {7,8,1,1};
		polynomial c = new polynomial(aa);
		c.setCoefficient(2, 50);
		System.out.println("Probando setCoefficient, valor 50 en el grado 2: " + c.toString());
		
		//Seteando dos polinomios para prueba de motodo equals.
		int[] cc= {4,2,1,5,6};
		polynomial e = new polynomial(cc);
		polynomial eprimo = new polynomial(cc);
		
		//Probando metodo add.
		int[] bb= {2,3,0,5};
		polynomial d = new polynomial(bb);
		d.add(e);
		System.out.println("Probando sumar polinomios d y e: " + d.toString());
		
		//Probando metodo getCoefficient.
		int f=d.getCoefficient(3);
		System.out.println("Probando getCoefficient del polinomio f en el grado 3: " + f);
		
		//Probando metodo valueOf
		float g=d.valueOf(5);
		System.out.println("Probando valueOf en el polinomio d valuando x en 5: " +g);
		
		//Probando metodo equals tanto false, como true.
		System.out.println("Probando equals si el polinomio c es igual al d:  " + c.equals(d));
		System.out.println("Probando equals si el polinomio e es igual al eprimo:  " + e.equals(eprimo));
	};
};