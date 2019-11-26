import java.util.Arrays;

// https://www.random.org/integer-sets/
// Set 1: -50, -45, -38, -49, 95, -72, 61, -9, 23, -6, -48, 26, -76, -99, -87, -97, 47, 19, 98, -85
// Set 2: -83, -27, 15, 16, -43, -2, -1, -38, -59, 4, 8, 35, -94, -31, 21, -66, -92, -70, 49, 52
// Set 3: -88, -50, -24, -80, -83, 48, 71, -19, 82, 32, -75, -13, -26, 46, 66, -97, -56, 37, 75, 52

public class kientrinhsort {
    public static void main(String[] args) {
		if(args.length < 0){ return; }
		
		// input int array
		int intArray[] = null;
		try{
			String[] results = args[0].split(",");
			intArray = new int[results.length];
			for(int i = 0 ; i < results.length; i++){
				intArray[i] = Integer.parseInt(results[i].trim());
			}
		}catch(Exception e){
			System.out.println("main error: " + e.toString());
		}
		
		// sort
		mySort(intArray);
		
		// output
		System.out.println(Arrays.toString(intArray));
		System.out.println("kientrinh");
    }
	
	private static void mySort(int[] intArray){
		try{
			int temp;
			for(int i = 0; i < (intArray.length - 1); i++){
				for(int j = (i + 1); j < intArray.length; j++){
					if(intArray[i] > intArray[j]){
						temp = intArray[i];
						intArray[i] = intArray[j];
						intArray[j] = temp;
					}
				}
			}
		}catch(Exception e){
			System.out.println("mySort error: " + e.toString());
		}
	}
}