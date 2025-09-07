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
    static void countConsonantsAndVowels(String str){
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int vowel = 0, consonants = 0;
        for(char c : ch){
            if(c >= 'a' && c <= 'z'){
                if("aeiou".indexOf(c) != -1){
                    vowel++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowel + " and Consonants : "+consonants);

    }
    public static void main(String[] args) {
        String str = "Vowel check";
        countVowelsAndConsonants(str);
    }
}
