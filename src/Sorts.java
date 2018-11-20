public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int lowPosition = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[lowPosition])
                    lowPosition = j;
            }
            swap(i, lowPosition, arr);
        }
    }

    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ascendingSort(String[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int lowPosition = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j].compareTo(arr[lowPosition]) < 0)
                    lowPosition = j;
            }
            swap(i, lowPosition, arr);
        }
    }

    private static void swap(int indexA, int indexB, String[] arr)
    {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
