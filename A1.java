





import 
;

public class A1 {
    public static void main(String[] args){
        int numElts= args.length;
        int[] a= new int[numElts];
        int [] b = {1,2,3,4};

        for (int i =0; i<numElts;i++){
            a[i]= Integer.parseInt(args[i]);
        }
        int sum= 0;
        for(int elt: a){
            sum += elt;
        }
            System.out.print(sum);

            for(int elt : a){
                System.out.println(elt + " ");
            }
            System.out.println(a == b);
    System.out.println();
}
}
