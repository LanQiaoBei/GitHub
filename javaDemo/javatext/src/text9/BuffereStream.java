package text9;

import java.io.*;

public class BuffereStream {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		FileWriter fout=new FileWriter(".\\buffer.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		String str;
		while(true) {
			str=br.readLine();
			if(str.equals("end"))
				break;
			bout.write(str);
			bout.newLine(); //Ð´ÐÐ·Ö¸ô·û
		}
		bout.close();
		FileReader fin=new FileReader(".\\buffer.txt");
		BufferedReader bin=new BufferedReader(fin);
		while((str=bin.readLine())!=null)
			System.out.println(str);
		bin.close();
	}
}

