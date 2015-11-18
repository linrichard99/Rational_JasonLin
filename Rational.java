public class Rational {
   
    private int numer;
    private int denom;

    public Rational() {
	numer = 0;
	denom = 1;
    }

    public Rational(int n, int d) {
	this();
	if (d == 0) {
	    System.out.println("Invalid. Setting to 0/1");
	}
	else {
	    numer=n;
	    denom=d;
	}
    }

    public String toString() {
	return numer + "/" + denom;
    }

    public double floatValue() {
	return ((double)numer)/denom;
    }

    public void multiply(Rational factor) {
	numer *= factor.numer;
	denom *= factor.denom;
    }

    public void divide(Rational factor) {
	denom *= factor.numer;
	numer *= factor.denom;
    }

}
	
	
    
