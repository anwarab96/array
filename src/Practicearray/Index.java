package Practicearray;

public class Index {
	public static int index(int[] numbers)throws Exception{
		
	
	int endIndex = numbers.length - 1;
	int startIndex = 0;
	int sumLeft = 0;
	int sumRight = 0;
	while(true){
		if(sumLeft>sumRight){
			sumRight+= numbers[endIndex--];
		}
		else{
			sumLeft+= numbers[startIndex++];
		}
		if(startIndex>endIndex){
			if(sumLeft == sumRight){
				break;
				
			}else{
				throw new Exception("please pass proper array to match the requirment");
			}
		}
	}
	
	return endIndex;
}

public static void main(String a[]){
	int[] num = { 2, 4, 4, 5, 4, 1};
	try {

	} catch (Exception e) {
		// TODO Auto-generated catch block

	}
		

}
}