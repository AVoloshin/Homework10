import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Persons {
    public ArrayList<Person> setMen() {
        ArrayList <Person> men = new ArrayList<Person>();
        Scanner fio = new Scanner(System.in);
        char c;
        do{
            System.out.println("Введите мужское имя");
            String name = fio.nextLine();
            System.out.println("Введите отчество");
            String secondName = fio.nextLine();
            System.out.println("Введите фамилию");
            String surname = fio.nextLine();
            Person person = new Person(name, secondName,surname);
            men.add(person);
            System.out.println("Введите любой символ, чтобы продолжить, 'e' чтобы выйти");
            c=fio.next().charAt(0);
            fio.nextLine();
        }while (c!='e');
        System.out.println(men);
        return men;
    }
    public ArrayList<Person> setWomen() {
        ArrayList <Person> women = new ArrayList<Person>();
        Scanner fio = new Scanner(System.in);
        char c;
        do{
            System.out.println("Введите женское имя");
            String name = fio.nextLine();
            System.out.println("Введите отчество");
            String secondName = fio.nextLine();
            System.out.println("Введите фамилию");
            String surname = fio.nextLine();
            Person person = new Person(name, secondName,surname);
            women.add(person);
            System.out.println("Введите любой символ, чтобы продолжить, 'e' чтобы выйти");
            c=fio.next().charAt(0);
            fio.nextLine();
        }while (c!='e');
        System.out.println(women);
        return women;
    }
    public HashMap setHashmap(ArrayList<Person> men,ArrayList<Person> women){
        HashMap persons = new HashMap();
        persons.put("man", men);
        persons.put("woman", women);

        System.out.println(persons.entrySet());
        return persons;
    }
    public void getFio (HashMap <String, ArrayList<Person>> persons){
        Scanner choose = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите кого вам отоборазить: 'муж' или 'жен'");
        if (choose.nextLine().equals("муж")){
            ArrayList<Person> man = persons.get("man");
            int num = rnd.nextInt(man.size());
            System.out.println(man.get(num).name+" "+man.get(num).secondName+" "+man.get(num).surname);
        }
        if (choose.nextLine().equals("жен")){
            ArrayList<Person> woman = persons.get("woman");
            int num = rnd.nextInt(woman.size());
            System.out.println(woman.get(num).name+" "+woman.get(num).secondName+" "+woman.get(num).surname);
        }

    }
}
