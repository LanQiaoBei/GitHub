package text9;

import java.io.*;

public class FileInputOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		fos=new FileOutputStream(".\\filestream.dat");
		
		byte[] array= {1,3,5,7,9,11,13,15,17,19};
		for(int i=0;i<array.length;i++)
			fos.write(array[i]);
		fos.close();
		FileInputStream fis;
		fis=new FileInputStream(".\\filestreamtest.dat");
		int value;
		while((value=fis.read())!=-1) 
			System.out.println(value+" ");
		fis.close();
	}
}

