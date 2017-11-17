package text8;

import java.awt.event.*;

import javax.swing.*;

public class UseMenu {
	public static void main(String[] args) {
		final JFrame frm=new JFrame("使用菜单");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//创建提示标签用于显示菜单的标题
		final JLabel lb1=new JLabel("显示菜单标题");
		lb1.setBounds(150, 100, 300, 30);
		frm.add(lb1);
		
		//创建菜单栏并添加到窗体顶部
		JMenuBar mbar=new JMenuBar();
		frm.setJMenuBar(mbar);
		
		//创建3个下拉式菜单并添加到菜单栏
		JMenu m1=new JMenu("用户管理");
		JMenu m2=new JMenu("成绩管理");
		JMenu m3=new JMenu("系统状态");
		mbar.add(m1);
		mbar.add(m2);
		mbar.add(m3);
		
		//创建菜单项并添加到相应的菜单下
		JMenuItem mi11=new JMenuItem("基本信息管理");
		JMenuItem mi12=new JMenuItem("修改密码");
		//JMenuItem mi13=new JMenuItem("系统退出");
		m1.add(mi11);
		m1.add(mi12);
		m1.add("系统退出");
		
		//获取到直接添加的菜单相并注册鼠标动作,输出菜单项标题
		final JMenuItem mi13=m1.getItem(2);
		mi13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText(mi13.getText());
				mi13.setText("退出");
			}
		});
		
		JMenuItem mi21=new JMenuItem("学生基本信息录入");
		JMenuItem mi22=new JMenuItem("成绩录入");
		JMenuItem mi23=new JMenuItem("成绩查询");
		mi23.setEnabled(false);
		m2.add(mi21);
		m2.add(mi22);
		m2.add(mi23);
		
		//单选菜单项组成一组
		ButtonGroup btnGroup=new ButtonGroup();
		JRadioButtonMenuItem mi31=new JRadioButtonMenuItem("显示背景");
		JRadioButtonMenuItem mi32=new JRadioButtonMenuItem("显示录入界面");
		btnGroup.add(mi31);
		btnGroup.add(mi32);
		mi32.setSelected(true);
		JCheckBoxMenuItem mi33=new JCheckBoxMenuItem("显示状态栏");
		final JCheckBoxMenuItem mi34=new JCheckBoxMenuItem("显示登录信息");
		mi33.setSelected(true);
		m3.add(mi31);
		m3.add(mi32);
		m3.addSeparator();
		m3.add(mi33);
		m3.add(mi34);
		//m3.add(m1);
		
		//创建一个弹出式菜单并注册鼠标事件,即右击窗体事件
		final JPopupMenu pm=new JPopupMenu("绘图");
		pm.add("画点");
		pm.add("画线");
		//pm.add(m2);
		
		//为最后一个菜单项定义单击动作
		mi34.addActionListener(new ActionListener() {

			@Override
				public void actionPerformed(ActionEvent e) {
					lb1.setText(mi34.getText());
				}
		});
		
		//为弹出式菜单定义显示位置
		frm.addMouseListener(new MouseAdapter() { //用鼠标适配器
			public void mouseClicked(MouseEvent e) {
				int mods=e.getModifiers();
				if((mods & InputEvent.BUTTON3_MASK)!=0)
					pm.show(frm, e.getX(), e.getY());
			}
		});
		frm.setBounds(400, 200, 450, 200);
		frm.setVisible(true);
	}
}
