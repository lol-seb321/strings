public class Username {
    public static int min = 5, max = 10;
    public static int range = 9999;
    public static String[] common;

    public static void startup(){
         common = new String[5];
         common[1] = "Heather";
         common[2] = "Olivia";
         common[3] = "Julia";
         common[4] = "Dencker";
    }

    public static String getUsername() {
        String answer = "";
        while (answer.length() < min) {
            int random_index = (int) (Math.random() * common.length);
            answer = answer + common[random_index];
        }
        if (answer.length() > max) {
        answer = answer.substring(0, max);
        }
        return answer;
    }

    public static String getUsername(String name){
        String answer = name;
        while (answer.length() < min){
            int random_index = (int)(Math.random() * common.length);
            answer += common[random_index];
        }
        if(answer.length() > max){
            answer = answer.substring(0, max);
        }
        return answer;
    }

public static void main(String[] args){
        startup();

        System.out.println(getUsername());
        System.out.println(getUsername());


}}