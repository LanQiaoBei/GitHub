package text9;

import java.io.*;

public class DataInputOutputStream {
	public static void main(String[] args) throws IOException {
		char c='A';
		int i=3721;
		long l=123456;
		float f=3.14f;
		double d=3.1415926535;
		String str="基本类型数据输入输出示例";
		DataOutputStream output=new DataOutputStream(new FileOutputStream("c:\\datastream.dat"));
		output.writeChar(c);
		output.writeInt(i);
		output.writeLong(l);
		output.writeFloat(f);
		output.writeDouble(d);
		output.writeUTF(str);
		output.close();
		DataInputStream input=new DataInputStream(new FileInputStream("c:\\datastream.dat"));
		char cc=input.readChar();
		int ii=input.readInt();
		long ll=input.readLong();
		float ff=input.readFloat();
		double dd=input.readDouble();
		String sstr=input.readUTF();
		input.close();
		System.out.println(cc+"\n"+ii+"\n"+ll+"\n"+ff+"\n"+dd+"\n"+sstr);
	}
}
