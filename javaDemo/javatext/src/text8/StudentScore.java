package text8;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class StudentScore {
	public static void main(String[] args) {
		LoginDialog dlg=new LoginDialog();
		dlg.setVisible(true);
	}
}

class MainWindow extends JFrame {
	static JLabel submit;
	
	MainWindow() {
		setTitle("学生成绩录入系统");
		setBounds(400,200,200,120);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		createMenu();
		submit=new JLabel();
		submit.setBounds(5,5,400,20);
		add(submit);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitSystem();
			}
		});
	}
	void exitSystem() {
		int ret=JOptionPane.showConfirmDialog(this, "退出系统吗?","退出系统吗?",JOptionPane.YES_NO_OPTION);
		if(ret==JOptionPane.YES_OPTION) 
			System.exit(0);
	}
	
	void createMenu() {
		//创建菜单栏并添加到窗体顶部
		JMenuBar mbar=new JMenuBar();
		setJMenuBar(mbar);
		
		//创建两个下拉式菜单并添加到菜单栏
		JMenu m1=new JMenu("系统管理");
		JMenu m2=new JMenu("成绩管理");
		mbar.add(m1);
		mbar.add(m2);
		
		//创建菜单项并添加到相应的菜单下
		JMenuItem mi11=new JMenuItem("基本信息管理");
		JMenuItem mi12=new JMenuItem("修改密码");
		JMenuItem mi13=new JMenuItem("退出系统");
		mi11.setEnabled(false);
		mi12.setEnabled(false);
		m1.add(mi11);
		m1.add(mi12);
		m1.add(mi13);
		//为退出系统菜单项添加事件
		mi13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				exitSystem();	
			}
		});
		
		JMenuItem mi21=new JMenuItem("成绩录入");
		JMenuItem mi22=new JMenuItem("成绩查询");
		mi22.setEnabled(false);
		m2.add(mi21);
		m2.add(mi22);
		
		//为成绩录入菜单添加事件
		mi21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inputScores();	
			}
		});
	}
	
	void inputScores() {
		InputScoresDialog isd=new InputScoresDialog();
		isd.setVisible(true);
	}
	static void setSubmit(String str) {
		submit.setText(str);
	}
}//结束MainWindow类

class InputScoresDialog extends JDialog {
	JComboBox name;
	JTextField maths;
	JComboBox english;
	
	InputScoresDialog() {
		setTitle("成绩录入");
		setBounds(500,250,240,180);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setLayout(null);
		setModal(true);
		createGUIElements();
	}
	
	void createGUIElements() {
		JLabel namelbl=new JLabel("姓名:");
		namelbl.setBounds(10, 20, 60, 25);
		add(namelbl);
		JLabel mathslbl=new JLabel("数学:");
		mathslbl.setBounds(10, 50, 60, 25);
		add(mathslbl);
		JLabel englishlbl=new JLabel("英语:");
		englishlbl.setBounds(10, 80, 80, 25);
		add(englishlbl);
		name=new JComboBox();
		name.setBounds(100, 20, 120, 25);
		name.addItem("孙文轩");
		name.addItem("孙文迪");
		add(name);
		maths=new JTextField();
		maths.setBounds(100, 50, 120, 25);
		maths.setText("100");
		add(maths);
		String[] ranks= {"优秀","良好","中等","及格","不及格"};
		english=new JComboBox(ranks);
		english.setBounds(100, 80, 120, 25);
		add(english);
		
		JButton submitBtn=new JButton("提交");
		submitBtn.setBounds(20, 120, 80, 25);
		add(submitBtn);
		JButton cancelBtn=new JButton("放弃");
		cancelBtn.setBounds(130, 120, 80, 25);
		add(cancelBtn);
		//遍历容器中的所有组件,设置字体
		for(int i=0;i<this.getContentPane().getComponentCount();i++) {
			Component comp=this.getContentPane().getComponent(i);
			comp.setFont(new Font("宋体",Font.BOLD,20));
		}
		//添加提交成绩事件
		submitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String str="姓名:"+name.getSelectedItem().toString()+";数学:"+maths.getText()+";英语:"+english.getSelectedItem().toString();
				MainWindow.setSubmit(str);/*调用主窗体的静态方法显示,此处可改为存入数据库中*/
			}
		});
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose(); //撤销成绩录入对话框,返回主窗体
			}
			
		});
	}
}

class LoginDialog extends JDialog {
	JLabel usernamelbl;
	JLabel passwordlbl;
	JComboBox username;
	JPasswordField password;
	JButton loginBtn;
	JButton cancelBtn;
	
	LoginDialog() {
		createGUIElements();
	}
	
	void createGUIElements() {
		//设置登录对话框并设置位置及大小、模态等
		setTitle("登录系统");
		setBounds(500,250,200,120);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setLayout(null);
		setModal(true);
		//创建用户名与密码标签
		usernamelbl=new JLabel("用户名:");
		usernamelbl.setBounds(20, 10, 50, 20);
		this.add(usernamelbl);
		passwordlbl=new JLabel("密码:");
		passwordlbl.setBounds(20, 32, 50, 20);
		this.add(passwordlbl);
		
		//创建用户名与密码输入组件并赋值
		username=new JComboBox();
		username.addItem("administrator");
		username.addItem("whitesun");
		username.setBounds(75, 10, 105, 20);
		this.add(username);
		password=new JPasswordField("123456");
		password.setBounds(75, 33, 105, 20);
		password.setEchoChar('*');
		this.add(password);
		
		//创建"登录"与"退出"按钮并添加事件
		loginBtn=new JButton("登录");
		loginBtn.setBounds(25, 60, 60, 20);
		add(loginBtn);
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}

		});
		cancelBtn=new JButton("退出");
		cancelBtn.setBounds(110, 60, 60, 20);
		add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				logout();
			}
			
		});
	}
	
	void login() {
		String account=username.getSelectedItem().toString();
		String pwd=new String(password.getPassword());
		
		//如果用户名与密码正确,则隐藏登录对话矿,显示主窗体
		if(account.equals("administrator") && pwd.equals("123456")) {
			setVisible(false); //只隐藏存在潜在问题,可用dispose()彻底销毁
			showMainWindow();//显示主窗体
		} else {
			JOptionPane.showMessageDialog(this, "用户名是"+account+",密码是"+pwd);
		}
	}
	
	void logout() {
		int ret=JOptionPane.showConfirmDialog(this, "选择是,取消登录。","取消登录",JOptionPane.YES_NO_OPTION);
		if(ret==JOptionPane.YES_OPTION) {
			dispose();
		}
	}
	
	void showMainWindow() {
		MainWindow frm=new MainWindow();
		frm.setVisible(true);
	}
}
