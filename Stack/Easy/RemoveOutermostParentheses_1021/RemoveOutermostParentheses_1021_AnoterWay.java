public class RemoveOutermostParentheses_1021_AnoterWay {

    public static void main(String[] args) {
        sol2("(()())(())");
    }

    public static String sol2(String s) {

        int opened = 0;
        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length();i++){

            System.out.println("i = " + i);

            if(s.charAt(i)=='('){

                opened++;

                System.out.println("After opened++: " + opened);

                if(opened>1){

                    res.append(""+s.charAt(i));

                    System.out.println("res : " + res.toString());
                }

            }else {

                opened--;

                System.out.println("After opened--: " + opened);


                if(opened>0){

                    res.append(""+s.charAt(i));
                    System.out.println("res: " + res.toString());

                }
            }

            System.out.println("--------------------------------------------------");

        }

        System.out.println("res : " + res.toString());

        return res.toString();
    }
}
