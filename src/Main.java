public class Main{
    public static void main(String[]args){


        int [] num = {3,7,1,9,4};

        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];

            }

        }
        System.out.println(max);
    }

}
