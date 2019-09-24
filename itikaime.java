//フーリエ、逆フーリエ
import java.util.Scanner;

public class itikaime {

	static double[] hurie(double[] F,double[] K) {

		double sum=0;
		for(int i=0;i<F.length;i++) {
			sum+=F[i]*K[i];
		}

		sum=sum/4.0;

		for(int i=0;i<K.length;i++) {
			K[i]=K[i]*sum;
		}
		return K;
	}

	static double[] gyaku(double[] A,double[] B,double[] C,double[] D) {

		double[] SUM=new double[4];

		for(int i=0;i<SUM.length;i++) {
			SUM[i]=A[i]+B[i]+C[i]+D[i];
		}

		return SUM;

	}


	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		double [] x=new double [4];

		do {
		System.out.println("ｘ入力、好きな数字を4つ入力");

		retry=100;

		for(int i=0;i<x.length;i++) {
			x[i]=stdIn.nextDouble();
		}

		double [] A= {1.0,1.0,1.0,1.0,};
		double [] B= {1.0,1.0,-1.0,-1.0,};
		double [] C= {1.0,-1.0,-1.0,1.0,};
		double [] D= {1.0,-1.0,1.0,-1.0,};

		System.out.printf("x=(%3.1f,%3.1f,%3.1f,%3.1f)\n",x[0],x[1],x[2],x[3]);

		System.out.print("A=(1,1,1,1)とフーリエ変換:");
		A=hurie(x,A);
		System.out.println(A[0]+","+A[1]+","+A[2]+","+A[3]);

		System.out.print("B=(1,1,-1,-1)とフーリエ変換:");
		B=hurie(x,B);
		System.out.println(B[0]+","+B[1]+","+B[2]+","+B[3]);

		System.out.print("C=(1,-1,-1,1)とフーリエ変換:");
		C=hurie(x,C);
		System.out.println(C[0]+","+C[1]+","+C[2]+","+C[3]);

		System.out.print("D=(1,-1,1,-1)とフーリエ変換:");
		D=hurie(x,D);
		System.out.println(D[0]+","+D[1]+","+D[2]+","+D[3]);

		x=gyaku(A,B,C,D);
		System.out.printf("逆フーリエ変換\nx=(%3.1f,%3.1f,%3.1f,%3.1f)",x[0],x[1],x[2],x[3]);

		while(retry!=1 && retry!=0) {
		System.out.print("もう一度しますか？　（1:はい/0:いいえ）");
		retry=stdIn.nextInt();
		System.out.println("");
		}
		}while(retry==1);


	}

}
