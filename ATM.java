public class ATM {
    public int countBanknotes(int sum){
        int count = 0;
        int[] arr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        do {
            count += sum / arr[i];
            sum %= arr[i];
            i++;
        } while (sum != 0);
        return count;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(547));
    }
}
