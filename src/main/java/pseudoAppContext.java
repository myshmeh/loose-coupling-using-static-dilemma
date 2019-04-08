import Sort.BubbleSort;
import Sort.SelectionSort;

public class pseudoAppContext {
    public static void main(String[] args) {
        int[] arr = {0, 2, 11, 9, -1, -12, 90};

        System.out.println("\n== great people in society ==");
        Human myshmeh = new Human("myshmeh", new BubbleSort());
        Human hemhsym = new Human("hemhsym", new SelectionSort());
        myshmeh.iCanSort(arr);
        hemhsym.iCanSort(arr);

        System.out.println("\n== now things get weird... ==");
        HumanBotheringOthers douchebag = new HumanBotheringOthers("douchebag", new BubbleSort());
        HumanBotheringOthers needyGirl = new HumanBotheringOthers("needyGirl", new SelectionSort());
        douchebag.iCanSort(arr);
        needyGirl.iCanSort(arr);
    }
}
