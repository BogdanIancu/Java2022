package ro.ase.java;

import java.io.*;
import java.util.Scanner;

import ro.ase.java.classes.Product;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write name= ");
		String name = scanner.nextLine();
		System.out.println("Write quantity= ");
		int quantity = scanner.nextInt();
		System.out.println("Write price= ");
		double price = scanner.nextDouble();
		
		Product a = new Product(name , quantity, price);
		System.out.println(a);
		
		scanner.close();
		
		try {
			FileOutputStream fileOutputStream = 
					new FileOutputStream("Product.txt");
			OutputStreamWriter writer =
					new OutputStreamWriter(fileOutputStream);
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write(name);
			
			buffer.write(System.lineSeparator());
			buffer.write(Integer.toString(quantity));
			
			buffer.write(System.lineSeparator());
			buffer.write(Double.toString(price));
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		BufferedReader reader = null;
		try {
			FileInputStream inputFile = new FileInputStream("Product.txt");
			InputStreamReader inputReader = new InputStreamReader(inputFile);
			reader = new BufferedReader(inputReader);
			
			String n = reader.readLine();
			int q = Integer.parseInt(reader.readLine());
			double p = Double.parseDouble(reader.readLine());
			
			Product b = new Product(n, q, p);
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream binaryStream = new FileOutputStream("Product.bin");
			DataOutputStream outputStream = new DataOutputStream(binaryStream);
			outputStream.writeUTF(a.getName());
			outputStream.writeInt(a.getQuantity());
			outputStream.writeDouble(a.getPrice());
			
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream inputStream = new FileInputStream("Product.bin");
			DataInputStream dataInputStream = new DataInputStream(inputStream);
			
			String n = dataInputStream.readUTF();
			int q = dataInputStream.readInt();
			double p = dataInputStream.readDouble();
			
			Product c = new Product(n, q, p);
			System.out.println(c);
			
			dataInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("product.data");
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(a);
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(FileInputStream fileInputStream = new FileInputStream("product.data")) {
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			Product d = (Product)inputStream.readObject();
			System.out.println(d);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
