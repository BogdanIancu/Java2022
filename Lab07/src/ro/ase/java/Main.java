package ro.ase.java;

import ro.ase.java.classes.Sum;
import ro.ase.java.interfaces.BinaryOperator;
import ro.ase.java.interfaces.Displayable;
import ro.ase.java.interfaces.Printable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(new String("abcd").toUpperCase());
		//anonymous object
		
		BinaryOperator op = new Sum();
		System.out.println(op.compute(2,3));
		
		BinaryOperator binaryOperator = new BinaryOperator() {
			
			//anonymous class through interface
			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		
		System.out.println(binaryOperator.compute(2, 3));
		
		// anonymous functions -> lambda expressions
		
		binaryOperator = (a, b) -> a-b; // we can delete the types (double a, double b)
		System.out.println(binaryOperator.compute(3, 3));
		
		binaryOperator = (a,b) -> {
			double result = Math.pow(a, b);
			return result; //if we have {} it's mandatory to say return
			
		};
		
		System.out.println(binaryOperator.compute(2, 3));
		
		Displayable d = () -> System.out.println("Hello world");
		d.display();
		
		Printable p = m -> System.out.println("Message " + m);
		p.print("Mesaj1"); // the () are not mandatory -> if we have a single parameter (m) or m
		
		//streams -> processing data in the memory
		
		List <Integer> list = Arrays.asList(1,2,3,1,2,3,6,7,8,2);
		long number = list.stream().distinct().count();
		System.out.println(number);
				
		//filtering -> lambda expressions + streams
		
		long result = list.stream().filter(a -> (a < 6)).count();
		System.out.println(result);
		
		List <Integer> subList = list.stream().distinct().filter(a -> a % 2 == 0).sorted().collect(Collectors.toList());
		for(int i =0; i< subList.size(); i++) {
			System.out.println(subList.get(i));
		}
		
		//mapping
		
		list.stream().map(a -> a*a).forEach(a -> System.out.println(a));
		
		System.out.println(list.stream().reduce((a,b)-> a+b).get()); //optional of[] = that value might be null if we don t call .get()
		
		
		//collecting + filter
		List<String> strings = Arrays.asList("Hamburger", "Pizza", "Fries", "Pasta");
		String b = strings.stream().filter(s -> s.startsWith("P")).collect(Collectors.joining(", ")); 
		System.out.println(b);
		
		
		//method reference
		strings.stream().filter(s -> s.length() > 5).forEach(System.out::println);
		
		//System.out.println(list.stream().reduce(op::compute).get()); it works on a list of doubles
	}

}
