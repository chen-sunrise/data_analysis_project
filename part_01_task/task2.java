 //�ҳ� 1000 ���ڵ�������������ӡ������ ��ν��������һ����ǡ�õ�����������֮�ͣ��磺6=1��2��3
 
 public class task2{
	public static void main(String[] args){
		for(int i = 2; i <= 1000; i++){
    		int s = 0;
    		for(int j = 1; j < i; j++){
				//�ж�j�Ƿ��ܱ�i����
    			if(i % j == 0){
    				s += j;
    			}
    		}
    		if(s == i){
        		System.out.println("���������" + i);
        	}
    	}
   }
}