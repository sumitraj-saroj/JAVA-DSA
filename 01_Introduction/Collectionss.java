import java.util.*;

public class Collectionss {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(2, 60);
        a.remove(2);


        for(int i = 0; i <a.size();i++)
        System.out.print(a.get(i) + ",");

        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        };
        
         LinkedList<Integer> b = new LinkedList<>();
    }


}
        //  1. Idher Integer likha kyuki ye class hai kaam int jaisa hi karega, int isliye nhi likha kyuki vo ek primitive data type hai
        //  2. Left side mai likha vo interface per right side mai kabhi bhi interface nhi likhna hai udher class likha hai kyuki --> idher new ke help se object create kar rhe hai object create karne ke liye constructor ko call karna hota hai aur constructor class mai hota hai na ki interface mai.
        //  3. Class ka hi object banata hai object ka interface nhi banta.
        // 4.  agar left side mai interface ka naam naam likhte hai toh right hand side mai uski jinte bhi classes hai usko initialize kar sakte hai.
        // 5 . Agar left side mai class ka naam likha hai toh ushi class ak object usmai initialize karna hoga.
  