package _array_pratice;

public class CountZerosOnes {

    public static void main(String[] args) {
        int[] array={1,1,0,1,0,1,1};
        int zero=0;
        int one=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                zero++;
            } else if (array[i]==1) {
                one++;
            }



        }
        System.out.println("count of the zero "+zero);
        System.out.println("count of the one  "+one);
}
}
