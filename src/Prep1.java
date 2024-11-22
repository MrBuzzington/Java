import java.util.*; 
public class Prep1 { 
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
		
	//СУМИРАНЕ;
	double sum=0;
		for(int i=0;i<n;i++) {
			sum = sum + m[i];
		}
		System.out.println ("Сборът на числата е " + sum);
		
	// КОЛКО ЕЛЕМЕНТА СА ПОЛОЦИТЕЛНИ И БРОЯТ ИМ
	double pos=0;
		for(int i=0;i<n;i++) {
			if (m[i]>0) {
				pos++;
			}
		}
		System.out.println ("Бройката положителни елементи е " + pos);
		
	// СУМАТА НА ЕЛЕМЕНТИТЕ НА ЧЕТНА ПОЗИЦИЯ
	double chet=0;
		for(int i=2;i<n;i+=2) {
			chet = chet + m[i];
		}
	 	System.out.println ("Сумата на четните по позиция числа е " + chet);
	
	// ОТПЕЧАТВАНЕ НА КОЛКО ПЪТИ СЕ СРЕЩА ПРОИЗВОЛНО ЧИСЛО В МАСИВ
	double x;
	int broiX = 0;
		System.out.println("Въведи, кое число да се търси ");
		x=kb.nextDouble();
		for (int i=0;i<n;i++) {
			if(x==m[i]) {
				broiX++;
			}
		}
		System.out.println("Числото ви се среща " + broiX + " пъти");
		
	//НАЙ-НИСКА СТОЙНОСТ
	double min = m[0];
		for(int i=0;i<n;i++) {
			if (m[i] < min) {
				min = m[i];
			}
		}
		System.out.println("Най-ниската стойност е " + min);
}
}
