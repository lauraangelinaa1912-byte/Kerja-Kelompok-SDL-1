package kerkomsdl;

public class KerkomSDL {

    public static void main(String[] args) {
       
        
         // a. Deklarasi array integer sebanyak 10
        int[] angka = {1,2,3,4,5,6,7,8,9,10};

        int jumlah = 0;

        // b. Menghitung jumlah
        for(int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

    }
    
}
