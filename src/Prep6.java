import java.util.*;
public class Prep6 {

public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Въведи размер на масива");
		int n = kb.nextInt();
		int c[] =new int [n];
		int broiX =0;
		for (int i=0; i<n;i++) {
			System.out.println("Въведи елемент от масива c:"); 
			c[i]=kb.nextInt();
		} 
		System.out.println("Кое число да се търси?");
		double x = kb.nextDouble();
		for(int i=0;i<n;i++) {
			if(c[i]==x){ 
				System.out.println("елемент равен на зададеното число на позиция:"+i);
				broiX++;
			} 
		}
		

}
}
