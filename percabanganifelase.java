public class percabanganifelase {
    public static void main(String[] args) {
        double totalbelanja = 53000;
        double uangdidompet = 23000;

        if(uangdidompet<totalbelanja){
            System.out.println("Uang Kurang, Kurangani Belanjaan anda");
        }else if(uangdidompet>totalbelanja){
            double angsulan = uangdidompet - totalbelanja;
            System.out.println("Uang Cukup, angsulan : "+angsulan);
        }else {
            System.out.println("Uang Pas..Makasih..");
        }
    }
}
