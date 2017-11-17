package text9;

import java.io.*;

public class FileReaderWriterStream {
	public static void mian(String[] args) throws IOException {
		FileWriter fw;
		fw=new FileWriter(".\\filestream.txt");
		char array[]= {'文','本','输','入','输','出','示','例','。'};
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
