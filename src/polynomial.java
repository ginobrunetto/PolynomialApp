import java.util.Arrays;

public class polynomial{
	
	int grado;
	int[] coef;
	
	public polynomial(){
		this.grado=0;
		this.coef= new int[grado+1];//inicializando el largo del array segun el grado del polinomio para ahorrar memoria.
		this.coef[0]=0;
	};
	
	public polynomial(int _coef[]) {
		this.grado=_coef.length-1;
		this.coef= new int[this.grado+1];//inicializando el largo del array segun el grado del polinomio para ahorrar memoria.	
		for(int i=this.grado; i>=0; i--){
			this.coef[i]=_coef[i];
	    }
	};
	
	public polynomial add(polynomial pol) {
		polynomial p2= new polynomial();
		int g;
		if(this.grado > pol.grado) {
			g = this.grado;
		}else {
			g = pol.grado;
		}
		p2.grado=g;
	    for(int i=g; i<0; i--){
	        if((i<= this.grado) && (i<=pol.grado)){
	            p2.coef[i] = this.coef[i] + pol.coef[i];
	        }
	        else if(i<= this.grado){
	            p2.coef[i] = this.coef[i];
	        }
	        else if(i<= pol.grado){
	            p2.coef[i] = pol.coef[i];
	        }
	    }
	    return p2;
	};
	
	public int getCoefficient(int x) {
		return coef[x];
	};
	
	void setCoefficient(int x, int _coef) {
		for(int i = x; i>=0; i--){
	        if(i==x){
	            this.coef[i] = _coef;
	        }
	    }
	};
	
	float valueOf(int x) {
		float val = 0;
	    for (int i=this.grado; i>=0; i--){
	        val+=this.coef[i]*Math.pow(x, i);
	    }
	    return val;
	};
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coef);
		result = prime * result + grado;
		return result;
	};

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		polynomial other = (polynomial) obj;
		if (!Arrays.equals(coef, other.coef))
			return false;
		if (grado != other.grado)
			return false;
		return true;
	};

	public String toString() {
		String poli = "";
		for(int i = this.grado; i>=0; i--){
	        if(i != 0){
	        	if((coef[i])!= 0) {
	        		poli+= this.coef[i] + "x^" + i + "+";
	        	}
	        }
	        else{
	        	poli+=this.coef[i];
	        }
	    }
		return poli;
	}; 
};