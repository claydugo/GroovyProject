// from https://www.bbminfo.com/groovy/ds/sort/quick-sort.php

class QuickSortExample {

    public void quickSort(arr, low, high) {
        if(low < high) {
            def pivot = this.partition(arr, low, high)
            this.quickSort(arr, low, pivot)
            this.quickSort(arr, pivot + 1, high)
        }
    }

	public int partition(arr, low, high) {
		def pivot = arr[low]
		def i = low
		def j = high

		while(i < j) {
			while(arr[i] <= pivot && i < high) {
				i++
			}

			while(arr[j] > pivot && j > low) {
				j--
			}

			if(i < j) {
                def temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
		}

		arr[low] = arr[j]
		arr[j] = pivot

		return j
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
        def obj = new QuickSortExample()
            
        def arr = [15, 3, 12, 6, -9, 9, 0].toArray()
        print("Before Sorting: ")
        obj.printArray(arr)

        obj.quickSort(arr, 0, arr.length - 1)
        print("After Sorting: ")
        obj.printArray(arr)
    }
}
