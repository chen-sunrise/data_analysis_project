public class ArrayCopyTest{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55};
		int[] brr = new int[3];
		//arraycopyΪ�ٷ��ṩ�����鸴�Ƶ�api
		System.arraycopy(arr,1,brr,0,3);
		for(int i=0;i<brr.length;i++){
			System.out.println(brr[i] + "");
		}
	}
}