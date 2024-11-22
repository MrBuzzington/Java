import java.util.*; 
public class Prep4 { 
public static void main(String[] args) { 
	int i,j,r,c; 
	Scanner kb=new Scanner(System.in); 
		int arr[][]=new int[100][100]; 
	do{ System.out.println("number of rows:"); 
	r=kb.nextInt(); 
	System.out.println("number of columns:"); 
	c=kb.nextInt(); 
	}while(r<=0||r>100||c<=0||c>100); 
	for(i=0;i<r;i++) 
		for(j=0;j<c;j++){  
			System.out.println("element arr["+i+"]["+j+"]="); 
			arr[i][j]=kb.nextInt();  
		}  
	//СБОР НА КОЛОНИТЕ
double sum[]=new double[c]; 
	for(i=0;i<r;i++){ 
		sum[i]=0;
		for(j=0;j<c;j++) 
			sum[i]= sum[i] + arr[i][j]; 
	} 
	for(i=0;i<c;i++) { 
		System.out.println("Сбор на колониете["+i+"]="+sum[i]); 
	}
	//СРЕДНО АРИТМЕТИЧНОТО ПО ВСЯКА КОЛОНА
double average[]=new double[c];
double sumz[]= new double[c];
	for(i=0;i<r;i++){
		sumz[i]=0;
		for(j=0;j<c;j++) {
			sumz[i]= sumz[i] + arr[i][j];
		}
		average[i]= sumz[i]/c;
	}
	for(i=0;i<c;i++) { 
		System.out.println("Средно аритметично["+i+"]="+average[i]); 
	}
	//НАЙ-MАЛКОТО ЧИСЛО ВЪВ ВСЯКА КОЛОНА
double min [] = new double [r];
	 for( i=0; i<r;i++) {
		 	min[i] = arr[i][0];
		 for( j=0; j<c;j++) {
			 if(arr[i][j]<min[i]) {
				 min[i]=arr[i][j];
			 }
		 }
	 }
	 for(i=0;i<r;i++) 
		 System.out.println("min["+i+"]="+min[i]); 

}
}