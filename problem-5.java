import java.util.*;  
class DiffieHellmanAlgorithm{  
    public static void main(String[] args)  
    {  
        long P, G, x, a, y, b, ka, kb;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Both the users should be agreed upon the public keys G and P");  
        System.out.println("Enter value for public key G:");  
        G = sc.nextLong();  
        System.out.println("Enter value for public key P:");  
        P = sc.nextLong();  
        System.out.println("Enter value for private key a selected by user1:");  
        a = sc.nextLong();  
        System.out.println("Enter value for private key b selected by user2:");  
        b = sc.nextLong();  
        x = calculatePower(G, a, P);  
        y = calculatePower(G, b, P); 
        ka = calculatePower(y, a, P);  
        kb = calculatePower(x, b, P);  
        System.out.println("Secret key for User1 is:" + ka);  
        System.out.println("Secret key for User2 is:" + kb);  
    }   
    private static long calculatePower(long x, long y, long P)  
    {  
        long result = 0;          
        if (y == 1){  
            return x;  
        }  
        else{  
            result = ((long)Math.pow(x, y)) % P;  
            return result;  
        }  
    }     
}