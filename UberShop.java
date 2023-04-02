import java.util.*;
import java.util.stream.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }
    public int[] findMinMaxPrices(int[] prices){
        Arrays.sort(prices);
        if(prices.length == 0) {
            return new int[]{};
        }if(prices[0] == prices[prices.length-1]){
            return new int[]{prices[0]};
        }
        return new int[]{prices[0], prices[prices.length - 1]};
    }
    public int getMinPriceCount(int[] prices){
        int count = 0;
        if(prices.length == 0) return count;
        int min = prices[0];
        for(int price:prices){
            if(price<min){
                min=price;
                count++;
            }
            if(price==min){
                count++;
            }
        } return count;
    }
    public int[] removePrice(int[] prices, int toRemove){
        int [] arr = new int[prices.length];
        int i = 0;
        for (int price: prices) {
            if (price != toRemove) {
                arr[i] = price;
                i++;
            }
        }return Arrays.copyOf(arr,i);
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        if(showcaseStocks.length == 0 || warehouseStocks.length==0)return new String[]{};
        String[] arr = new String[showcaseStocks.length
                + warehouseStocks.length];
        int count= 0;
        for(int i=0; i<showcaseStocks.length; i++){
            arr[i]=showcaseStocks[i];
            count++;
        }
        for(int j=0; j<warehouseStocks.length; j++){
            arr[count++]=warehouseStocks[j];
        }return arr;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int count = 0;
        for(int price:prices){
            if(price>=minPrice && price <=maxPrice){
                count +=price;
            }
        }return count;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}