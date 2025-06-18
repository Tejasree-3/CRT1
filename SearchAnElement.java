public class SearchAnElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int elementToSearch = 30;
        int index = searchElement(arr, elementToSearch);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int searchElement(int[] arr, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i; 
            }
        }
        return -1; 
    }
}