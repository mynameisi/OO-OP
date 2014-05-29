/*
*		这是用了基于过程的编程方法	
*			
*/
public class EatAndSleep {

	public static void eat(String name,String food){
		System.out.println(name+"正在吃"+food);
	}
	
	public static void sleep(String name,String bed){
		System.out.println(name+"在"+bed+"上睡觉");
	}
	
	public static void main(String[] args) {
		eat("张三","土豆");
		sleep("张三","板床");
				
		eat("李四","鲍鱼");
		sleep("李四","白玉床");
				
	}

}
