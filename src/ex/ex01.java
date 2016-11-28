package ex;
import java.util.Scanner;
import java.util.Random;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random(42);
		Scanner scn=new Scanner(System.in); 
		int data[]=new int[6];
		int n=scn.nextInt();
		rnd.setSeed(n);
		for(int i=0;i<6;i++){
		data[i]=rnd.nextInt(42)+1;
		for(int j=0;j<i;j++){
			if(data[i]==data[j]){
				data[i]=rnd.nextInt(42)+1;
			}
		}
			
		}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
			
		}
			}

		}