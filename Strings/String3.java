package Strings;

public class String3 {
    public static void main(String[] args) {
        //String Builders
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //setCharAt
        sb.setCharAt(0, 'y');
        System.out.println(sb);

        //insert
        sb.insert(0, 'p');
        System.out.println(sb);

        //delete
        sb.delete(0, 1);  //end index is Non Inclusive
        System.out.println(sb);

        //append
        sb.append('W');
        System.out.println(sb);  //adding at the end

        //length

        System.out.println(sb.length());

        //Reverse
        for(int i = sb.length()-1 ; i > 0; i--){
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        
        //OR

        StringBuilder sb1 = new StringBuilder("Hello");
        for(int i =0; i < sb1.length()/2; i++){
            int front = i;
            int back = sb1.length() - 1 - i;
            char cfront = sb1.charAt(front);
            char cback = sb1.charAt(back);

            sb1.setCharAt(front, cback);
            sb1.setCharAt(back, cfront);
        }
        System.out.println(sb1);
    }
}
