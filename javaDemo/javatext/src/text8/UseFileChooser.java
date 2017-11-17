package text8;

import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class UseFileChooser {
	public static void main(String[] args) {
		final JFrame frm=new JFrame("使用文件对话框");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//创建文件对话框并设置文件过滤器,只选择.txt文件
		JFileChooser fc=new JFileChooser();
		TxtFileFilter myff=new TxtFileFilter(".txt");
		fc.setFileFilter(myff);
		fc.showOpenDialog(frm);
		System.out.println("选中的文件为:"+fc.getSelectedFile().getName());
		fc.setDialogType(JFileChooser.SAVE_DIALOG);
		fc.showDialog(frm, "保存txt文件");
		fc.showSaveDialog(frm);
		frm.setBounds(400, 200, 450, 300);
		frm.setVisible(true);
	}
}

class TxtFileFilter extends FileFilter {
	String conditon="";
	public TxtFileFilter(String condition) {
		this.conditon=condition;
	}

	@Override
	public boolean accept(File arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
