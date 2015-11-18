public class Rational {
   
    private int numer;
    private int denom;

    // Default Setting
    public Rational() {
	numer = 0;
	denom = 1;
    }

    public Rational(int n, int d) {
	this();
	// denominator cannot be zero
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

    // returns the most precise float version of the rational
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

    public void add(Rational factor) {
	numer = numer*factor.denom + denom*factor.numer;
	denom *= factor.denom;
    }
	
    public void subtract(Rational factor) {
	numer = numer*factor.denom - denom*factor.numer;
	denom *= factor.denom;
    }

    public int gcd(int p, int q) {
        while (q != 0) {
	    int temp = q;
	    q = p % q;
	    p = temp;
	}
	return Math.abs(p);
    }

    public void reduce() {
	int gcdVal = 0;

	if (numer > denom) {
	    gcdVal = gcd(numer, denom);
	}
	else {
	    gcdVal = gcd(denom, numer);
	}

	numer /= gcdVal;
	denom /= gcdVal;
    }

    public static int gcd(int p, int q) {
        while (q != 0) {
	    int temp = q;
	    q = p % q;
	    p = temp;
	}
	return Math.abs(p);
    }

    public static void main(String[] args) {
	Rational r = new Rational (2,3);
	Rational s = new Rational (1,2);
	Rational t = new Rational (4,0);

	System.out.println("Testing floatValue()");
	System.out.println("s: " + s.floatValue());
	System.out.println("r: " + r.floatValue());

	System.out.println("Testing toString()");
	System.out.println("s:" + s);
	System.out.println("r:" + r);
	System.out.println("t:" + t);

	System.out.println("Testing multiply()");
	r.multiply(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	System.out.println("Testing divide()");
	r.divide(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	System.out.println("Testing add()");
	r.add(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	System.out.println("Testing subtract()");
	r.subtract(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	System.out.println("Testing reduce()");
	r.reduce();
	s.reduce();
	System.out.println("s:" + s);
	System.out.println("r:" + r);
	
    }


}
	
	
    
