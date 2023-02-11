import java.util.Scanner;

public class Real {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many password do you want to generated?  ");
    int totalPassword= scanner.nextInt();
        System.out.println("how many length of password do you want to generated?  ");
        int totalLength=scanner.nextInt();
        securityOfPassword(totalLength);
        //'0'-'9'-> 48-57 in ASCII
        //'A'-'Z '->65-90 in ASCII
        //'a'->'z' ->97-122 in  ASCII
        String[] PasswordArr=new String[totalPassword];
        for (int i = 0; i <totalPassword ; i++) {
            String password="";
            for (int j = 0; j < totalLength; j++) {
                password=password+randomCharacter();


            }
            PasswordArr[i]=password;



        }

        printPassword(PasswordArr);
        }
        public static void printPassword(String[] arr){
            for (String st:arr) {
                System.out.println(st);

            }



        }


    public static char randomCharacter(){
        int rand =(int)(Math.random()*62);
        if(rand<=9){
            int asciiValue=rand+48;
            return (char) (asciiValue);
        } else if (9<rand && rand<=35) {
            int asciiValue=rand+55;
            return (char)asciiValue;
        }else {
            int asciiValue=rand+61;
            return (char) asciiValue;
        }


}
        public  static void  securityOfPassword(int securityLength) throws ArrayIndexOutOfBoundsException{
        if (securityLength<5){
            throw new ArrayIndexOutOfBoundsException("bad security");

        }

        }
}
