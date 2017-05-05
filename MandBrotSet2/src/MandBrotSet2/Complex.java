package MandBrotSet2;

import java.lang.Math;
//import java.util.Objects;

public class Complex {
	
	public final double re;
	public final double im;
	

	public Complex(double real, double imag) {
		re =real;
		im = imag;
	}
	
	
	public double abs() {
		
		return Math.hypot(re, im);
	}
	
	public Complex plus(Complex b) {
		Complex a = this;
		double real = a.re + b.re;
		double imag = a.im + b.im;
		Complex Z = new Complex(real, imag);
		return Z;
	}
	

	public Complex sq() {
		double real = re*re -im*im;
		double imag = 2*re*im;
		Complex Z = new Complex(real,imag);
		return Z;
	}
	
//	public static void main(String[] ars) {
//		//Complex Z = new Complex(-4,13);
//		//Complex C = new Complex(1,1);
//		//System.out.println(Z.sq().abs()+" "+Z.abs());
//	}

}