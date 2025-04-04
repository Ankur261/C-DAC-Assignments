import java.util.Arrays;
class Anagrams{
	static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
		
        if (a.length() != b.length()) 
        {
            return false;
        }
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;
    }
	static void isVowels(String s){
		char[] arrS = s.toCharArray();
		int count=0;
		int n=arrS.length;
		for (int i = 0; i < arrS.length; i++) {
            if (arrS[i]=='a'||arrS[i]=='e'||arrS[i]=='i'||arrS[i]=='o'||arrS[i]=='u'){
                count++;
            }
        }
		int Consonants= n-count;
		System.out.println("Vovels: "+count);
		System.out.println("Consonants: "+ Consonants);
	}
	static void longest(String s) {
        String[] words = s.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
		System.out.println("Longest word: "+longestWord);
	}
	public static void main(String[] args){
		String a="listen";
		String b="silent";
		String s="Practice makes a man perfect";
		boolean result=isAnagram(a,b);
		System.out.println("Are 'listen' and 'silent' anagrams?: "+result);
		longest(s);
		isVowels(s);
	}
}