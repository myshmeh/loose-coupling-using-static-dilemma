import Sort.Sort;

public class HumanBotheringOthers {
    private static Sort sort;
    private String name;
    public HumanBotheringOthers(String name, Sort sort_) {
        sort = sort_;
        this.name = name;
        System.out.println(this.name + " is born with " + sort.getClass());
    }

    public void iCanSort(int[] arr) {
        System.out.println(name + " can sort using " + sort.getClass() + "!");
        displayArray(arr, "sorting: ");

        sort.sort(arr);

        displayArray(arr, "sorted:  ");
    }

    private void displayArray(int[] arr, String prefix) {
        String res = prefix;
        for(int i=0; i<arr.length; i++) {
            res += arr[i] + ", ";
        }
        System.out.println(res);
    }
}
