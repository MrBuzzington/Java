import java.util.*;
public class Prep5 {

public static void main(String[] args) {
	int n,indexMin=0,indexMax=0;
		Scanner kb=new Scanner(System.in); 
		do{ 
			System.out.println("Въведи размерност за масива с:"); 
			n=kb.nextInt(); 
		}while(n<=0||n>100); 
		double c[]=new double[n];
		for(int i=0;i<n;i++){ 
			System.out.println("Въведи елемент от масива c:"); 
			c[i]=kb.nextDouble();
		} 
		double max=c[0],min=c[0]; 
		for(int i=0;i<n;i++){  
			if(c[i]>max){ 
				max=c[i]; 
				indexMax=i;
			} 
			if(c[i]<min){
				min=c[i]; 
				indexMin=i;
			} 
		} 
		System.out.println("max=:"+max+"\t position:"+indexMax); 
		System.out.println("min=:"+min+"\t position:"+indexMin);

	}

}
