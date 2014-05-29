/*
*		这是用了基于对象的编程方法	
*			
*/

class OO{
	private String name;
	
	public OO(String p){
		this.name=p;
	}
	
	public void eat( String food ){
		System.out.print(name+"正在吃"+food+"\n");
	}
	
	public void sleep( String bed ){
		System.out.print(name+"正在"+bed+"上睡觉"+"\n");
	}
}
public class SleepAndEat {
	public static void main(String[] args) {
		
		OO z3=new OO("张三");
		OO l4=new OO("李四");
			
		z3.eat("土豆");
		z3.sleep("板床");
			
		l4.eat("鲍鱼");
		l4.sleep("白玉床");
	}

}


































