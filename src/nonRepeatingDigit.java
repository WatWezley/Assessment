public class nonRepeatingDigit {

    public static void main(String[] args) {

    }

    public static int nonRepeatingValue(int [] numbers){
        for(int x = 0; x<numbers.length;x++){
            int count = 0;
            for(int y = x+1; y< numbers.length;y++){
                if(numbers[x] != numbers[y]){
                    count++;}
                if (count == numbers.length) {
                    System.out.println(x);
                    break;

                }
    }

}
