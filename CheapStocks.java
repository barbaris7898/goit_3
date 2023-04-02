public class CheapStocks {
    public static String getCheapStocks(String[] stocks){
        for (String stock:stocks){
            String[] stoc = stock.split(" ");
            String name = stoc[0];
            int number = Integer.parseInt(stoc[1]);
            if(number<200) return name;
        }
        return null;
    }
    public static void main(String[] args) {
        CheapStocks shop = new CheapStocks();

        System.out.println(getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}));
    }

}
