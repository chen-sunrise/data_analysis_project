public class forforPrime{
	public static void main(String[] args){
		for(int i=2;i<=100;i++){
			boolean flag = true;
			//只要判断2到该数的平方根即可，因为随着除数的增大商必然减小
			//for(int j =2;j<i;j++){
			for(int j =2;j<=Math.sqrt(i);j++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("i ="+i);
			}
		}
	}
}