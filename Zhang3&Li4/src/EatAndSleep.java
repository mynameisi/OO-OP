/*
*		�������˻��ڹ��̵ı�̷���	
*			
*/

//TODO: ��Ҫ��GBK��ΪĬ�ϵ�Encoding,Ҫ��UTF-8
public class EatAndSleep {
	/** TODO: ��Ҫ��PO�ķ����ŵ�EatAndSleep���У����еľ�̬����Ӧ���й��ɵķŵ�һ��������Ȼ����������磺
	 * ��Java�ı�����һ��Math�࣬��������϶�����Math�йص���ѧ����
	 */
	public static void eat(String name,String food){
		System.out.println(name+"���ڳ�"+food);
	}
	
	public static void sleep(String name,String bed){
		System.out.println(name+"��"+bed+"��˯��");
	}
	
	public static void main(String[] args) {
		eat("����","����");
		sleep("����","�崲");
				
		eat("����","����");
		sleep("����","����");
		}
	
}
