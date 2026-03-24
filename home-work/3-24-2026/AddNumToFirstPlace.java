public class AddNumToFirstPlace {

    static int addToFirst(int num){
        int temp = num, sum = 0, count = 1;
        while(temp!=0){
            sum += temp % 10;
            temp/= 10;
            count *= 10;
        }
        sum *= count;
        sum += num;
        return sum;
    }


    public static void main(String[] args) {
        int num = 555;
        System.out.println(addToFirst(num));
        
    }
}
