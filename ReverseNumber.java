import java.util.HashMap;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }

        System.out.println(rev);
//        String name="TYGYGUYTYERETGFJGFJHG";
//        HashMap<Character,Integer> map=new HashMap<>();
//        for (int i=name.length()-1;i>=0;i--){
//            if (map.containsKey(name.charAt(i))){
//                int count=map.get(name.charAt(i));
//                map.put(name.charAt(i),++count);
//            }else
//                map.put(name.charAt(i),1);
//        }
//        System.out.println(map);
    }
}
