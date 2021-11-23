package SLAP;

public class Slap {
    public static void main(String[] args) {

        getDetailsAndMail();
    }

//    public
//    {
//        //code to fetch details from database
//        System.out.println("Fetching details from database");   this is the before applying SLAP
//
//        //code to mail the details to user
//        System.out.println("mailing details to user");
//    }

    public static void getDetailsAndMail()     // code after applying SLAP
    {
        //code to fetch details from database
       System.out.println("Fetching details from database");
       String details="Details";
       mailTOUSer(details);
    }

    public static void mailTOUSer(String details){
        //code to mail the details to user
        System.out.println("mailing details to user "+details);
    }
}
