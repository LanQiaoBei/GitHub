package text6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentScore1 {
	public static void main(String[] args) throws IOException {
		int k,count=5;
		double score[] = new double[count];
		boolean contiGo=true;
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		for(k=0;k<count;k++) {
			while(contiGo) {
				System.out.print("请输入第"+(k+1)+"个学生的成绩:");
				str=buf.readLine();
				score[k]=Double.parseDouble(str);
				if(0>score[k] || 100 < score[k]) 
					System.out.println("成绩应该介于0到100之间，请重新输入。");
				else 
					break;
				}
		}
		//采用冒泡法，对成绩排序
		double[] scoreCopy = new double[count+1];
		double temp=0;
		System.arraycopy(score, 0, scoreCopy, 1, score.length);
		
		for(k=1;k<count;k++) 
			for(int m=1;m<=count-k;m++) 
				if(scoreCopy[m]>scoreCopy[m+1]) {
					temp=scoreCopy[m];
					scoreCopy[m]=scoreCopy[m+1];
					scoreCopy[m+1]=temp;
				}
		System.out.println("这"+score.length+"个同学的成绩如下:");
		for(int j=0;j<score.length;j++) 
			System.out.print(score[j]+"\t");
		System.out.println("\n这"+score.length+"个同学的成绩从低到高排序如下:");
		for(int j=1;j<scoreCopy.length;j++) 
			System.out.print(scoreCopy[j]+"\t");
	}

}
