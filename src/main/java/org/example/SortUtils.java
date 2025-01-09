package org.example;

public class SortUtils {
    // Phương thức quickSort chính
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Tìm chỉ số phân vùng (pivotIndex)
            int pi = partition(array, low, high);

            // Đệ quy sắp xếp hai nửa mảng
            quickSort(array, low, pi - 1);  // Sắp xếp phần bên trái của pivot
            quickSort(array, pi + 1, high); // Sắp xếp phần bên phải của pivot
        }
    }

    // Phương thức phân vùng (partition)
    private static int partition(int[] array, int low, int high) {
        // Chọn pivot là phần tử cuối cùng trong mảng
        int pivot = array[high];
        int i = (low - 1); // chỉ số của phần tử nhỏ hơn pivot

        // Duyệt qua mảng từ low đến high - 1
        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (array[j] <= pivot) {
                i++; // Tăng chỉ số của phần tử nhỏ hơn pivot
                // Hoán đổi array[i] và array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Hoán đổi array[i + 1] và array[high] để đưa pivot vào vị trí đúng
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // trả về chỉ số của pivot sau khi phân vùng
    }
}

