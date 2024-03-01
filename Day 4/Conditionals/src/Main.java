public class Main {
    public static void main(String[] args) {
//        boolean isMale = false;
//        boolean isMale = true;
//        String name = "Bob";
//        System.out.println("Before if");
//        if(isMale){
//            System.out.println("Mr."+ name);
//        } else {
//            System.out.println("Ms. "+name);
//        }
//        System.out.println("After if");
        boolean seniorCitizen = false;
        boolean isAnAdult = false;
        if (seniorCitizen){
            System.out.println("Hello Senior Citizen");
        }else {
            if(isAnAdult){
                System.out.println("Hello Adult");
            }else{
                System.out.println("Hello Child");
            }
        }
    }
}