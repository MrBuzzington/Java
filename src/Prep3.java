import java.util.Scanner; 
public class Prep3 { 
public static void main(String[] args) { 
	
	//СЪЗДАВАНЕ НА МАСИВ
	int n;
	Scanner kb=new Scanner(System.in);  
		do{ 
			System.out.println("Задай размер на масива"); 
			n=kb.nextInt(); 
		}while(n<=0||n>100); 
	double m[]=new double[n]; 
		for(int i=0;i<n;i++) {
			System.out.println("Въведи стойности за масива"); 
			m[i]=kb.nextDouble(); 
		} 
		
	//КРАТНИ НА 3;
	double kratni=0;
		for(int i=0;i<n;i++) {
			if(m[i]%3==0 && m[i]>0) {
			kratni++;
			}
		}
		System.out.println ("Кратните на 3 са общо " + kratni);
		
	//ПРОИЗВЕДЕНИЕ НА ПОЗИТИВНИ ЧИСЛА
	double proiz=0;
		for(int i=0;i<n;i++) {
			if (m[i]>0) {
				proiz = proiz * m[i];
			}
		}
		System.out.println ("Произведението на положителните числа " + proiz);
		
	// ОТПЕЧАТВАНЕ НА КОЛКО ЧИСЛА СА ПО-ГОЛЕМИ ОТ X
	double x;
	int pogX = 0;
		System.out.println("Въведи, кое число да се търси ");
		x=kb.nextDouble();
		for (int i=0;i<n;i++) {
			if(x<m[i]) {
				pogX++;
			}
		}
		System.out.println("Числата по-големи от " + x + " са " + pogX + " на брой");
		
	//НАЙ-ГОЛЯМА СТОЙНОСТ
	double max = m[0];
		for(int i=0;i<n;i++) {
			if (m[i] > max) {
				max = m[i];
			}
		}
		System.out.println("Най-високата стойност е " + max);
	//СУМИРАНЕ;
	double sum=0;
		for(int i=0;i<n;i++) {
			sum = sum + m[i];
		}
		System.out.println ("Сборът на числата е " + sum);
}
}