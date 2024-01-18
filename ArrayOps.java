public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 6};
        System.err.println(findMissingInt(array));

        int [] array2 =  {1, 2, 3, 4, 5};
         System.err.println(secondMaxValue(array2));
                  System.err.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
                  System.out.println(isSorted(new int[] {3,2,1}));

            //       int[][] testCases = {
            //         {1, 2, 3, 4, 5},
            //         {2, 8, 3, 7, 8},
            //         {1, -2, 3, -4, 5},
            //         {-202, 48, 13, 7, 8},
            //         // Add more test cases as needed
            // };
    
            // int result = ArrayOps.secondMaxValue(testCases[inputNumber - 1]);
            // System.out.println(result);
    }
    
    public static int findMissingInt (int [] array) {
        int length = array.length;
        int ESum = length * (length + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i<array.length; i++) {
            actualSum += array[i];
        }

        return ESum - actualSum;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondmax = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] > secondmax && array[i] < max) {
                secondmax = array[i];
            }
        }
        if(towbignum(array,max))
        return max;
        else
        return secondmax;
    }
    public static boolean towbignum(int array[],int max) {
        boolean numexist=false;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;
        }
    }
        if(count>1)
        numexist=true;
        else
        numexist=false;

        return numexist;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean contains1=false;
        boolean contains2=false;
                for(int i=0; i < array2.length; i++)
                {
                    contains1=false;
                    for(int j=0; j < array1.length; j++)
                    {
                        if(array2[i]==array1[j])
                        contains1=true;
                    }
                    if(contains1==false)
                    return false;
                }
                for(int i=0; i < array1.length; i++)
                {
                    contains2=false;
                    for(int j=0; j < array2.length; j++)
                    {
                        if(array1[i]==array2[j])
                        contains2=true;
                       
                    }
                    if(contains2==false)
                    return false;
                }
                if(contains1=contains2)
                return true;
                else
                return false;
    }

    public static boolean isSorted(int [] array) {
        boolean Rising = true;
        boolean Descending = true;
    
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) 
            {
                Rising = false;
            }
        }
    
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
            {
                Descending = false;
            }
        }
    
        return Rising || Descending;
        }
    }

