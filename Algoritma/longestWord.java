import java.util.*;

public class longestWord {
	public static void main(String[] args){
		//2. Diberikan contoh sebuah kalimat, 
		//silahkan cari kata terpanjang dari kalimat tersebut,
		//jika ada kata dengan panjang yang sama silahkan ambil salah satu
		
		String text = "Saya sangat senang mengerjakan soal algoritma";
		int biggest = 0;
		int longCharPos = 0;
		char [] toChar = text.toCharArray();
		List<Integer> spacePos = new ArrayList<Integer>();
		
		for (int i = 0;i < text.length();i++){
			if((int)toChar[i] == 32){
				spacePos.add(i);
			}
		}
		System.out.println(text);
		for(int x=1;x < spacePos.size();x++){
			
			int start = spacePos.get(x-1)+1;
			int longChar = spacePos.get(x) - start;
			//System.out.println("Text Start at:"+start+"("+longChar+" Character Long)");
			if (longChar < spacePos.get(0)) {
				start = 0;
				longChar = spacePos.get(0);
			}
			
			if (longChar >= biggest) {
				biggest = longChar;
				longCharPos = start;
				//System.out.println("Biggest: "+biggest+"	"+longChar+"	"+(longChar > biggest));
			}
		}
		for(int x=longCharPos ; x <= longCharPos+biggest ; x++) {
			System.out.print(toChar[x]);
		}
		System.out.print(": "+biggest+" Long Character");
	}
}