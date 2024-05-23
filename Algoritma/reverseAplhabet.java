import java.util.*;

public class reverseAplhabet {
	public static void main(String[] args){
		//1. Terdapat string "NEGIE1", silahkan reverse alphabet nya dengan angka tetap diakhir kata Hasil = "EIGEN1"
		
		//variabel
		String text = "NEGIE1ABC2";
		char [] newText = text.toCharArray();
		char [] toChar = text.toCharArray();
		List<Integer> numberPos = new ArrayList<Integer>();
		
		System.out.println("From: "+text);
		
		for (int i = 0;i < text.length();i++){
			if(48 <= (int)toChar[i] && (int)toChar[i] <=57){
				numberPos.add(i);
			}
		}
		
		for(int x=0;x < numberPos.size();x++){
			int prev = 0;
			if(x!=0) { prev = numberPos.get(x-1)+1;}
			
			//System.out.println("Position at "+numberPos.get(x)+" is "+toChar[numberPos.get(x)]);
			//System.out.println(prev);
			
			for (int i = prev;i < numberPos.get(x); i++){
				//System.out.println(toChar[i]+"	"+numberPos.get(x)+"	"+i+"	"+toChar[numberPos.get(x)-i-1+prev]);
				newText[i] = toChar[numberPos.get(x)-i-1+prev];
			}
			//System.out.println();
		}
		
		System.out.print("To: ");
		System.out.println(newText);
	}
}