import java.io.*;
import java.io.BufferedReader;
public class pi {

	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b= new BufferedReader(r);
		
		double pie=0;
		int mother, a= 10000;
		double sign =1.0;
		for(;;){
			System.out.println("계산 횟수 입력:");
		try{
			String str = b.readLine();
			a=Integer.parseInt(str);
			
			for(mother=1;mother < a;mother+=2){
				pie += (1.0/mother)*sign;
				sign = -sign;
			}
			pie=pie*4;
			System.out.println("pie= " +pie);
		}
		catch(java.io.IOException e){
			System.out.println("Input Error");
		}
		pie=0f;

		}

	}

}
