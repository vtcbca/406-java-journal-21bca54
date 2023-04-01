import java.util.*;
class StudentDetail{
    public static void main(String args[]){
        // String[] StdName=new String[10];
        // int[] age=new int[10];
        String StdName[]={"Yash","Divyang","Kaushik","Ajay","Kamlesh","Shivraj","Abhay","Chetan","Vivek","Brijesh"};
        int age[]={18,18,18,18,19,19,19,19,18,18};
        int n=9;
        String temp;
        for (int i=0; i<=n;i++) {
            for (int j=i+1;j<=n;j++){               
                // to compare one string with other strings
                if (StdName[i].compareTo(StdName[j]) > 0) {
                    // swapping
                    temp = StdName[i];
                    StdName[i] = StdName[j];
                    StdName[j] = temp;
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                //to set the age in descnding order
                int temp1;
                if(age[i]>age[j]){
                    temp1=age[i];
                    age[i]=age[j];
                    age[j]=temp1;
                }
            }
        }
        System.out.println("Names & Age in descnding order.");
        System.out.println("Names\t\t\tAge");
        System.out.println("====================  \t====================");
        for (int i = n; i >=0; i--) {
            System.out.println(StdName[i]+"\t\t\t"+age[i]);
        }

    }
}