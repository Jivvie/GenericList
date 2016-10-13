package ListPackage.gjvon;

public class Main {

    public static void main(String[] args) {
        GeneralList<Integer> mine = new GenericList();
        mine.add(5);
        mine.add(3);
        mine.add(5);
        System.out.println(mine.toString());
    }
}
