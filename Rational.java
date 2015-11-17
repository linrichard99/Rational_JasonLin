public class Rational {
   
    private int numer;
    private int denom;

    public Rational() {
	numer = 0;
	denom = 1;
    }

    public Rational(int n, int d) {
	numer=n;
	denom=d;
    }

    public String toString() {
	return numer + "/" + denom;
    }

    public double floatValue() {
	return numerf/denom;
    }

    public void multiply(Rational factor) {
    }
	
	
    
