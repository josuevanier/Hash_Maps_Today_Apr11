import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
   static class Student{
        int rollNo;
        String name, address;

        public Student(int rollNo, String name, String address) {
            this.rollNo = rollNo;
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }


    }
    static class SortByRoll implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.rollNo - o2.rollNo;
        }
    }
    public static void main(String[] args) {


        TreeMap<Student, Integer> map = new TreeMap<Student, Integer>(new SortByRoll());
        //Mapping String values int keys
        map.put(new Student(1,"s","2"),2);
        map.put(new Student(6,"a","2"),4);
        map.put(new Student(2,"b","1"),3);

        System.out.println("Tree Map:" + map);

    }
}
