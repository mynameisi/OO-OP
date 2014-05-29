/*
*		这是用了基于对象的编程方法	
*			
*/
public class SleepAndEat {

	private String name;
	
	public SleepAndEat(String p){
		this.name=p;
	}
	
	public void eat( String food ){
		System.out.print(name+"正在吃"+food+"\n");
	}
	
	public void sleep( String bed ){
		System.out.print(name+"正在"+bed+"上睡觉"+"\n");
	}
	public static void main(String[] args) {
		
		SleepAndEat z3=new SleepAndEat("张三");
		SleepAndEat l4=new SleepAndEat("李四");
			
		z3.eat("土豆");
		z3.sleep("板床");
			
		l4.eat("鲍鱼");
		l4.sleep("白玉床");
	}

}


































