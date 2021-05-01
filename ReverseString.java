package Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str= "gaming check";
		ReverseString r= new ReverseString();
		System.out.println(r.reverse(str));

	}
	
	public String reverse(String value) {
		String rev="";
		
		if(value.length()<2) {
			return value;
		}else {
			String[] arr= new String[value.length()];
			
			for(int i=0; i<arr.length; i++) {
				arr[i]= String.valueOf(value.charAt(i));
			}
			
//			arr= value.split("");
			
			for(int j=arr.length-1; j>=0; j--) {
				rev = rev+ arr[j];
			}
		}
		return rev;
	}

}
