package hjp.edu.csi.course.hw;

public class TaskOne {
	
	public static void main(String[] args) {
/*		System.out.print("Hi, ");
		System.out.print(args[2]);
		System.out.print(", ");
		System.out.print(args[1]);
		System.out.print(" and ");
		System.out.println(args[0]);*/
		
		testDemo();
		
	}
	
	public static void testDemo() {
		String str = "abc456";
		int m = 0;
		while(m < 6) {
			if (!Character.isLetter(str.charAt(m)))
				System.out.print(Character.toUpperCase(str.charAt(m)));
			m++;
		}
	}

}
