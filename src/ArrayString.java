import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayString {
    private ArrayList<String> list = new ArrayList<>();
    private Scanner read = new Scanner (System.in);
    public void setList(){
        boolean run = true;
        do{
            System.out.println("Введите строку или 'e' для выхода");
            String string = read.nextLine();
            if(string.equals("e")){
                run = false;
            }
            else list.add(string);
        }while(run);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (int i=0;i<list.size();i++){
            if(list.get(i).contains("a")){
                String tmp=list.get(i).replace("a","");
                list.set(i, tmp);
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void remDoubs (){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(list);
        System.out.println(hashSet);
    }
}