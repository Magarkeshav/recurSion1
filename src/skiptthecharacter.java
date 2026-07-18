public class skiptthecharacter {

    public static  void skip(String ns , String cs){
        if(cs.isEmpty()){
            System.out.println(ns);
            return;

        }
        char ch = cs.charAt(0);

        if(ch=='a' || ch=='A'){
            skip(ns,cs.substring(1));
        }else{
            skip(ns+ch,cs.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "ckdssalmsaAlv";
        String str1 = "";
        skip(str1,str);
    }
}
