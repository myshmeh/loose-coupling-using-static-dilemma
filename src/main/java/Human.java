import Sort.Sort;

public class Human {
    private Sort sort;
    private String name;
    public Human(String name, Sort sort) {
        this.sort = sort;
        this.name = name;
        System.out.println(this.name + " is born with " + this.sort.getClass());
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
