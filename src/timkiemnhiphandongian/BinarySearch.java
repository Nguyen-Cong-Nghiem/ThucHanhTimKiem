package timkiemnhiphandongian;

public class BinarySearch {
     static int [] list={2,4,7,8,10,11,14,16,19,20,50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] list, int value) {
        int thap = 0;
        int cao = list.length - 1;
        while (cao >= thap) {
            int mid = (cao + thap) / 2;
            if (value < list[mid]) {
                cao = mid - 1;
            } else if (value == list[mid]) {
                return mid;
            } else thap = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Gia tri can tim o vi tri so: " + (binarySearch(list,10)+1));
        System.out.println("Gia tri can tim o vi tri so: " + binarySearch(list,80));
        System.out.println("Gia tri can tim o vi tri so: " + binarySearch(list,79));
        System.out.println("Gia tri can tim o vi tri so: " + binarySearch(list,90));
    }
}
