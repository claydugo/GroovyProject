class InsertionSortExample {

    public void insertionSort(arr) {
        def lastIndex = arr.length - 1
        for (i in 0..lastIndex) {
            def temp = arr[i]
            def holePosition = i

            while(holePosition > 0 && arr[holePosition - 1] > temp) {
                arr[holePosition] = arr[holePosition - 1]
                holePosition--
            }
            
            arr[holePosition] = temp
        }
    }

    public void printArray(arr) {
        def lastIndex = arr.length - 1
        for (i in 0..lastIndex) {
            def num = arr[i]
            print(num + " ")
        }
        println("")
    }

    public static void main(String[] args) {
        def obj = new InsertionSortExample()
            
        def arr = [15, 3, 12, 6, -9, 9, 0].toArray()
        print("Before Sorting: ")
        obj.printArray(arr)

        obj.insertionSort(arr)
        print("After Sorting: ")
        obj.printArray(arr)
    }

}
