package text6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentScore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int k,count =10;
		double score[] = new double[count];
		double doubleSum = 0.0,doubleAver = 0.0,maxScore = 0.0;
		boolean contiGo = true;
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		for(k=0;k<count;k++) {
			while(contiGo) {
				System.out.print("请输入第"+(k+1)+"个学生的成绩:");
				str=buf.readLine();
				score[k]=Double.parseDouble(str);
				if(0 > score[k] || 100 < score[k])
					System.out.println("成绩应该介于0到100之间，请重新输入。");
				else 
					break;
				}
			doubleSum += score[k];
			if(score[k] > maxScore) 
				maxScore = score[k];
		}
		doubleAver = doubleSum/count;
		System.out.println("这"+count+"个同学的平均成绩是:"+doubleAver);
		System.out.println("这"+count+"个同学的最好成绩是:"+maxScore);
	}
}
