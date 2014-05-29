/*
*		这是用了基于过程的编程方法	
*			
*/

//TODO: 不要用GBK作为默认的Encoding,要用UTF-8
public class EatAndSleep {
	/** TODO: 不要把PO的方法放到EatAndSleep类中，所有的静态方法应该有规律的放到一个理所当然的类里面比如：
	 * 在Java的保重有一个Math类，里面基本上都是与Math有关的数学方法
	 */
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
