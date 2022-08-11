package fundamentos;

public class Variaveis {
    public static void main(String[] args) {
        byte by = 127;
        short sh = 1;
        int i = 10000;
        long lo = 100000;
        
        by = (byte) sh;
        
        i = sh;
        
        double doub = 100;
        float fl = 5.2F;
        
        char ch = 'a';
        
        boolean bo = 3 > 1;
        
        System.out.println(bo);
        
        //exemplo de inferência de tipo
        int y;
        y = 4;
        
        var x = 10;
        x = 10;
        System.out.println(x);
    }
}
