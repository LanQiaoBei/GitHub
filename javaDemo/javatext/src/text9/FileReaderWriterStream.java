package text9;

import java.io.*;

public class FileReaderWriterStream {
	public static void mian(String[] args) throws IOException {
		FileWriter fw;
		fw=new FileWriter(".\\filestream.txt");
		char array[]= {'��','��','��','��','��','��','ʾ','��','��'};
		for(int i=0;i<array.length;i++)
			fw.write(array[i]);
		fw.close();
		FileReader fr;
		fr=new FileReader(".\\filestream.txt");
		int value;
		while((value=fr.read())!=-1)
			System.out.println((char)value);
		fr.close();
	}
}
