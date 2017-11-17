package text6;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int k,baka[]=new int[11],a[]= {19,22,15,13,1,0,10,8,2,4,36};
		System.out.println("\t\t排序前a数组各元素为:");
		for(k=0;k<a.length;k++) {
			System.out.print(a[k]+"\t");
			baka[k]=a[k];
		}
		
		System.out.println();
		Arrays.sort(a);
		System.out.println("\t\t完全排序后a数组各元素为:");
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+"\t");
			System.out.println();
			
			int key=Arrays.binarySearch(a, 10);
			System.out.println("排序前,10位于a数组的"+key+"个元素");
			
			for(k=0;k<baka.length;k++) {
				a[k]=baka[k];
			}
			Arrays.sort(a,3,8);
			System.out.println("部分(第3个至第7个元素)排序后a数组各元素为:");
			for(k=0;k<a.length;k++)
				System.out.print(a[k]+"\t");
			System.out.println();
	}

}
