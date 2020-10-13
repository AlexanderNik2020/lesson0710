public class Main {

    public static void main(String[] args) {
        String text;

        for(int i = 1; i <= 100; i++){
            text = "";
            if(i % 3 == 0){
                text = "Fizz";
            }
            if(i % 5 == 0){
                text = text + "Buzz";
            }
            if(text.equals("")){
                System.out.println(i);
            } else {
                System.out.println(text);
            }
        }
    }

}
