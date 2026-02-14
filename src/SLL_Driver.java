public class SLL_Driver {
    public static void main(String[] args) {
//        SLL<String> myList = new SLL<String>();
//        String[] cityNames = {"Jubail", "Riyadh", "Abha", "Dammam", "Taif"};
//        for(int i = 0; i < cityNames.length; i++)
//            myList.addToHead(cityNames[i]);
//
//        System.out.println("Original list: " + myList);
//        System.out.println("Element deleted from head: " + myList.deleteFromHead());
//        System.out.println("Modified list: " + myList);
//        System.out.println("It is " + myList.contains("Dammam") + " that the list contains Dammam.");
//
//        SLL<Integer> intList = new SLL<Integer>();
//        intList.addToTail(7);
//        intList.addToTail(5);
//        intList.addToTail(3);
//        intList.addToTail(50);
//        intList.addToTail(7);
//        intList.addToTail(9);
//        System.out.println("Original list: " + intList);
//        intList.insertBefore(4, 20);
//        System.out.println("After inserting 20 before index 4: " + intList);
//        intList.delete(4);
//        System.out.println("After deleting 20: " + intList);
//        intList.insertAfterSecondOccurrence(30,7);
//        System.out.println("After inserting 30: " + intList);
//
//
//
        SLL<String> list = new SLL<>();
        System.out.println(list.isEmpty());
        System.out.println("The size is: " + list.size());
        list.addToHead("RORO");
        list.addToHead("NNN");
        list.addToHead("B");
        list.addToHead("YYYO");
        System.out.println(list);
        list.addToTail("MOH");
        System.out.println(list);

    }
}