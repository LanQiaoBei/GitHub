package houzifentao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().ft(0);
		}
	
	static int ts=0;
	static int fs=1;
	static int hs=5;
	static int tsscope=5000;
	public int ft(int t) {
		if(t==tsscope) {  //当桃子数大于范围时,取消递归
			System.out.println("结束");
			return 0;
			} else {
				if((t-1)%hs==0 && fs<=hs) {
					if(fs==hs) System.out.println("总数为"+ts);
					fs=fs+1;
					return ft((t-1)/5*4); //返回剩下的桃子总数
					} else {
						fs=1; //分的次数重置为1
						return ft(ts+=1);  //桃子数加1
						}
				}
		}
	}
