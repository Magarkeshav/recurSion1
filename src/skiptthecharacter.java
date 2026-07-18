public class skiptthecharacter {

    public static String  skip(String ns , String cs){
        if(cs.isEmpty()){

            return "";

        }
        char ch = cs.charAt(0);

        if(ch=='a' || ch=='A'){
           return skip(ns,cs.substring(1));
        }else{
           return ch + skip(ns+ch,cs.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "ckdssalmsaAlv";
        String str1 = "";
        String str2 = skip(str1,str);
        System.out.println(str2);
    }
}
