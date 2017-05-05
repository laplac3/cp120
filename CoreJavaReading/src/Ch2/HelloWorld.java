package Ch2;

public class HelloWorld {


	public static void main(String[] args) {
		
		String[] strings = new String[3];
		strings[0] = "Hello World";
		strings[1] = "using a loop to print these out";
		strings[2] = "is fun";
		
		for (String a : strings ) {
			System.out.println(a);
		}
		String con = strings[0] + strings[1];
		System.out.println(con.length());
		boolean a = strings[0].equals(con);
		if (a) { 
			System.out.println("strings[0] was equal to con");
		} else {
			System.out.println("they were not equal");
			System.out.print("a= ");
			System.out.print(a);
		}
	}

}
