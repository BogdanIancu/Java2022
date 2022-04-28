package ro.ase.java.classes;

import ro.ase.java.interfaces.BinaryOperator;

public class Sum implements BinaryOperator {

	@Override
	public double compute(double a, double b) {
		return a+b;
	}
	
}
