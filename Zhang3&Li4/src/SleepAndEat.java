/*
*		�������˻��ڶ���ı�̷���	
*			
*/
public class SleepAndEat {

	private String name;
	
	public SleepAndEat(String p){
		this.name=p;
	}
	
	public void eat( String food ){
		System.out.print(name+"���ڳ�"+food+"\n");
	}
	
	public void sleep( String bed ){
		System.out.print(name+"����"+bed+"��˯��"+"\n");
	}
	public static void main(String[] args) {
		
		SleepAndEat z3=new SleepAndEat("����");
		SleepAndEat l4=new SleepAndEat("����");
			
		z3.eat("����");
		z3.sleep("�崲");
			
		l4.eat("����");
		l4.sleep("����");
	}

}


































