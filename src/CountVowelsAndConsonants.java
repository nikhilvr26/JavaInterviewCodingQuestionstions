public class CountVowelsAndConsonants {

    static void countVowelsAndConsonants(String str){
        int countVowel = 0, countConsonants = 0;
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(c>='a' && c<='z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countVowel++;
                } else {
                    countConsonants++;
                }
            }
        }
        System.out.println("Total counts for vowels is: "+countVowel+ " and consonants is: "+countConsonants);
    }
    public static void main(String[] args) {
        String str = "Vowel check";
        countVowelsAndConsonants(str);
    }
}
