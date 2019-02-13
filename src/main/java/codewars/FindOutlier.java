package codewars;


//[2, 4, 0, 100, 4, 11, 2602, 36]
//Should return: 11 (the only odd number)
//
//[160, 3, 1719, 19, 11, 13, -21]
//Should return: 160 (the only even number)

public class FindOutlier{

    static int find(int[] integers){

        int i=0;
        int oddIndex=0;
        int evenIndex=0;

        int [] odd = new int[integers.length];
        int [] even = new int[integers.length];
        int result = 0;
        while (i < integers.length){

            if(integers[i]%2 == 0){
                even[evenIndex] = integers[i];
                evenIndex++;
            }else{
                odd[oddIndex] = integers[i];
                oddIndex++;
            }

            if (evenIndex != 0 && oddIndex !=0 && evenIndex != oddIndex){
                if (evenIndex > oddIndex){
                    result = odd[oddIndex-1];
                }else{
                    result = even[evenIndex-1];
                }
                break;
            }
            i++;
        }

        return result;
    }
}