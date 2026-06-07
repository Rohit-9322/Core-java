// package Day2_loop;

public class Vote {
    public static void main(String[] args) {
        
        // 1} Check eligibility to vote
        // int no = 17;
        // if (no >= 18) {
        //     System.out.println("can Vote");
        // }
        // else{
        //     System.out.println("Cannot Vote");
        // }

        // 2] Check eligibility to vote

        int age = 19;
        boolean iscitizen = true;

        boolean eligibal = (age >= 18) && iscitizen;

        String result = eligibal ? "Can vote " : " Can not vote";
        System.out.println(result);

    }
    
}
