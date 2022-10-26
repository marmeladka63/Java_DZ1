
//Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Task2{


    /**
     * @param arr
     */
    public void sort(int arr[]) // сборка убывающей пирамиды
        {       
            int n = arr.length;
        
            for (int i = n/2 - 1; i >=0 ; i-- )
            heapify(arr, n, i);
        
        for (int i = n-1; i >=0; i--) 
        {
            int temp = arr[0]; // перемещение текущего корня в конец
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); 
        }

        }
        void heapify( int arr[], int n, int i) //преобразование массива в бинарное  дерево 
        {
            int largest = i ; // Инициализация корня
            int l = 2*i + 1 ; // левая ветка 
            int r = 2*i + 2 ; // правая ветка

            if ( l < n && arr[l] > arr[largest])  // если левый потомок больше корня
            largest =l ;

            if ( r < n && arr[r] > arr[largest])  // если правый потомок больше корня
            largest = r ;

            if (largest != i) // если самый большой элемент не корень
            {
                int swap = arr[i] ;
                arr[i] = arr[largest];
                arr[largest] = swap ;
                heapify(arr, n, largest); // преобразуем в бинарные ветки затронутое поддерево
                
            }
        }

        static void printArray (int arr[]) // Вывод на экран массива
        {
            int n = arr.length;
            for (int i = 0; i < n; i++) 
                System.out.print(arr[i]+" ");
            System.out.println();
                
            }
                
            public static void main(String args[])
            {
                int arr[] ={12, 11, 13, 5, 7, 9};
                Task2 ob = new Task2();
                ob.sort(arr);
                System.out.print("Sorted array is ");
                printArray(arr);
            }
        }





        





        
