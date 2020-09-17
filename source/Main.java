public class Main {
    public static void main(String[] args ){
        int balance = 100;
        int income = 1100;
        int limit = 1_000;

        if (income > limit){
            int new_balance = balance + income + (income / 100);
            System.out.println(new_balance);
        }
        else {
            int new_balance = balance + income;
            System.out.println(new_balance);
        }
    }
}
