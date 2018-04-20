public class MyListTest {
    public static void main(String[] args) {
        MyList listNmber = new MyList();
        listNmber.add(4);
        listNmber.add(2);
        listNmber.add(7);
        for (int i = 0; i < listNmber.size() && listNmber.get(i) != null ; i++) {
            System.out.print(listNmber.get(i) + " ");
        }
    }
}
