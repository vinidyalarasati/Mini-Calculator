import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("^_^ Welcome to our calculator ^_^");
		float angka1=0; 
		float sum =0; 
		float kali=0;
		float angka2=0; 
		float selisih =0; 
		float bagi =0; 
		float pangkat=0; 
		String tanda;
		int choose=0;
		
		do {
			System.out.println("\n");
			System.out.println("First try?? Please Choose 0 ");
			System.out.println("Again?? Please Choose 1");
			System.out.println("Stop?? Please Choose 2");
			choose = input.nextInt();
			if(choose==1 || choose==0) {
				
				System.out.print("Please input your first number:");
				angka1= input.nextFloat();
				System.out.print("Please input your operator(ex: '+'):");
				tanda= input.next();	
				System.out.print("Please input your second number:");
				angka2=input.nextFloat();
				input.nextLine();
				
				//jumlah
					if(tanda.equals("+")) { //cara masukin tanda plus nya
						sum= angka1 + angka2;
						System.out.print("Result = ");
						System.out.println(sum);
					}
					
				//ngurang
					else if(tanda.equals("-")) {			
						selisih = angka1-angka2;
						System.out.print("Result = ");
						System.out.println(selisih);
					}
					
				// kali
					else if(tanda.equals("x") || tanda.equals("X") || tanda.equals("*")) {
						kali = angka1 * angka2;
						System.out.print("Result = ");
						System.out.println(kali);
					}
					
				//Bagi
					else if(tanda.equals("/") || tanda.equals(":")) {
						bagi= angka1 / angka2;
						System.out.print("Result = ");
						System.out.println(bagi);
					}
					
					else if(tanda.equals(":")) {
						bagi= angka1 / angka2;
						System.out.print("Result = ");
						System.out.println(bagi);
					}
					
				//Pangkat
					else if(tanda.equals("^")) {	
					//cara cepat
						pangkat= (float) Math.pow(angka1, angka2);
					//cara manual
						//for(int i=0;i<angka2;i++) {
							//pangkat= x * angka1;
							//x = pangkat;
						//}
						System.out.print("Result = ");
						System.out.println(pangkat);
					}
					
					else {
						System.out.println("Out of operator :( ");
					}
				}
			
			else if(choose == 2) {
				System.out.println("Thankyou for using our calculator ^_^");
				System.out.println("See you ^_^");
			}
			
			else if(choose !=1 && choose!=0 && choose !=2) {
				System.out.println("Out of choose");
			}
			
		}while(choose!=2);
		input.close();
	}
}
