 //找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
 
 public class task2{
	public static void main(String[] args){
		for(int i = 2; i <= 1000; i++){
    		int s = 0;
    		for(int j = 1; j < i; j++){
				//判断j是否能被i整除
    			if(i % j == 0){
    				s += j;
    			}
    		}
    		if(s == i){
        		System.out.println("输出完数：" + i);
        	}
    	}
   }
}