/*
*		�������˻��ڶ���ı�̷���	
*			
*/

class OO{
	private String name;
	
	public OO(String p){
		this.name=p;
	}
	
	public void eat( String food ){
		System.out.print(name+"���ڳ�"+food+"\n");
	}
	
	public void sleep( String bed ){
		System.out.print(name+"����"+bed+"��˯��"+"\n");
	}
}
public class SleepAndEat {
	public static void main(String[] args) {
		
		OO z3=new OO("����");
		OO l4=new OO("����");
			
		z3.eat("����");
		z3.sleep("�崲");
			
		l4.eat("����");
		l4.sleep("����");
	}

}


































