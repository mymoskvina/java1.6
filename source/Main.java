public class Main {
    public static void main(String[] args ){
        int balance = 100;
        int income = 1_100;
        int limit = 1_000;
        int newBalance;
        if (income > limit){
            newBalance = balance + income + (income / 100);
        }
        else {
            newBalance = balance + income;
        }
        System.out.println(newBalance);
    }
}