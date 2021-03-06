public class Client1 {
    public static void main(String[] args){
        // construct 2 lists
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // add 1, 82, 97 to list1
        list1.add(1);
        list1.add(82);
        list1.add(97);

        // add 7, -8 to list2
        list2.add(7);
        list2.add(-8);

        // report results
        System.out.println("list1 =" + list1);
        System.out.println("list2 =" + list2);

        System.out.println("size = " + list1.size());
        System.out.println(list1.indexOf(0));
        list1.remove(1);
        list2.remove(1);
        System.out.println(list1);
        System.out.println(list2);
        list1.add(2, 223);
        System.out.println(list1);
    }
}
