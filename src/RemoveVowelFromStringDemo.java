public class RemoveVowelFromStringDemo {

    public static void main(String[] args) {
        String input = "Hi my name is Nikhil!";
        StringBuilder result = new StringBuilder(); // creating empty string using string builder
        for(int i=0; i<input.length(); i++){ // iterating whole string
            char ch = input.charAt(i); // storing each character of a string in character ch
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){ // comparing each character in a string with vowels
                continue; // if condition is true then continue
            }
            else {
                result.append(ch); // else append remaining character of a string into empty string
            }
        }
        System.out.println(result);
    }
}
