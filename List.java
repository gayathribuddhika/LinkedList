
package list;

import java.util.LinkedList;
public class List {

    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("Thaki");
        list.add("Keti");
        list.add("Iru");
        list.add("Mangi");
        list.add("Pangi");
        list.addFirst("Beri");
        list.addLast("Pami");
        list.add(2, "viku");
        list.set(2, "KETI");
        /*list.remove("Mangi");
        list.remove(3);
        list.removeFirst();
        list.removeLast();*/
        
        //list.clear();
        System.out.println(list.size() );
        System.out.println(" ");
        for(String x :list)
        System.out.println(x); 
        //System.out.println(list);
    }
    
}
