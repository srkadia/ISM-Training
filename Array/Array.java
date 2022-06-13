class Array{
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = new int[10];
        // int arr1[];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        System.out.println("\n");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}