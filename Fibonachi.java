package Day6PracticeProblemLogicalProgramming;

public class Fibonachi {
    public static void main(String[] args) {
        int first = 0;
        int second =1;
//1,2,3,5,8,13,21,34,55,89,
        for(int i = 1;i<=10;i++){
           int next = first+second;
            first = second;
            second = next;
            System.out.print(next + ",");
        }

    }
}
