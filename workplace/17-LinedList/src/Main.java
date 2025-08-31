import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);

        removeElements(placesToVisit);


    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        System.out.println("addFirst : Darwin" + list);
        list.addLast("Hobart");
        System.out.println("addLast : Hobart" + list);
        // queue methods
        list.offer("Melbourne"); // same as last method
        System.out.println("offer : Melbourne" + list);
        list.offerFirst("Brisbane");
        System.out.println("offerFirst : Brisbane" + list);
        list.offerLast("Toowoomba");
        System.out.println("offerLast : Toowoomba" + list);
        // stack methods
        list.push("Alice Springs");
        System.out.println("push : Alice Springs" + list);
        list.push("Sydney");
        System.out.println("push : Sydney" + list);
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        System.out.println("remove 4" + list);

        list.remove("Brisbane");
        System.out.println("remove Brisbane" + list);

        String s1 = list.remove();
        System.out.println(s1 + "\" was removed\""+ list);
        System.out.println();

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");
        // queue/deque poll methods
        String p1 = list.poll();
        System.out.println(".poll " + p1 +" is removed");
        String p2 = list.pollFirst();
        System.out.println( ".pollFirst" + p2 + " was removed");

        list.push("Mohammad");
        list.push("Brisbane");
        list.push("Ali");
        System.out.println(list);
        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }
}