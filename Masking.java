import java.util.Scanner;
public class Masking {

	public static void main(String[] args) {
		byte a,b,c;
    System.out.println("Enter the values of a and b");
    Scanner sc=new Scanner(System.in);
    a=sc.nextByte();
    b=sc.nextByte();
		c=(byte)(a<<4);
		c=(byte)(c|b);
		System.out.println((c&0b11110000)>>4);
		System.out.println(c&0b00001111);
	}
	

}
