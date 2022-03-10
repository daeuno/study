import java.util.Arrays;

public class Array_copy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
//		배열의 복사: System.out.println(orginArr, offset(어디서부터카피할것인가), tagerArr, offset(어디서부터복사할것인가), length);
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		
//----------------------
		
		newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		System.out.println( Arrays.toString(newStrArray));
//		for(int i=0; i<newStrArray.length; i++) {
//			System.out.println(newStrArray[i] + ", ");
//		}
	
	}
}
