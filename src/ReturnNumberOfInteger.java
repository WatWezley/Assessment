public class ReturnNumberOfInteger {

    public static void main(String[] args) {
        String [] words = new String[]{"Ab1396", "Q2RBS","Q381Ac"};
        System.out.println(findTheNumberOfFigures(words));

    }

    public static int findTheNumberOfFigures(String[] words){
        int count = 0;
        for (String word : words) {
            for (int x = 0; x < word.length(); x++) {
                char data = word.charAt(x);
                if (Character.isDigit(data)){
                    count++;
                }
            }
        }
        return count;
    }
}
