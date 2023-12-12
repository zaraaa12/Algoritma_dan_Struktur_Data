public class Genap {
    public static void main(String[] args) {
        deretGenap(0);
    }

    static void deretGenap(int i){
        if(i<=20){
            System.out.println(i + " ");
            deretGenap(i += 2);
    
        }
    }
}  

