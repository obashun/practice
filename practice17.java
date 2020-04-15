package practice7;

import java.util.Scanner;


public class practice17 {

	//末尾からの線形探索
	//失敗の場合は-1を返す。
	static int LinearSearchR(int[] a,int key) {

		int i;

		for(i=a.length-1; i>0;i--) {
			if(a[i]==key)
				return i;	//探索成功
		}
		return -1;	//探索失敗(i==-1)
	}

	public static void main(String[] args) {

		Scanner stdIn=new Scanner(System.in);

		System.out.print("要素数：");
		int num=stdIn.nextInt();
		int []x=new int[num];

		for(int i=0;i<x.length;i++) {
			System.out.print("x["+i+"]：");
			x[i]=stdIn.nextInt();
		}

		System.out.print("探す値：");
		int ky=stdIn.nextInt();

		int ans=LinearSearchR(x,ky);

		if(ans!=-1)
			System.out.println("その値はx["+ans+"]にあります。");
		else
			System.out.println("その値は存在しません。");


	}

}
