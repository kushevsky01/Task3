public class Main {
    public static void main(String [] args) {
        Node node = new Node();

        node.add(10);
        node.add(20);
        node.add(30);
        node.print();
        System.out.println("Размер списка " + node.size());

    }

}
