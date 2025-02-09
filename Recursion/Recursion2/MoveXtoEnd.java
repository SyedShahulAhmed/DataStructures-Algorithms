package Recursion.Recursion2;

public class MoveXtoEnd {
    public static void MoveX(String str, int idx, int cout, String res){
        if(idx == str.length()){
            while(cout > 0){
                res += 'x';
                cout --;
            }
            System.out.println(res);
            return;
        }
        char curchar = str.charAt(idx);
        if(curchar == 'x'){
            cout += 1;
            MoveX(str, idx+1, cout, res);
        }else{
            res += curchar;
            MoveX(str, idx+1, cout, res);
        }
    }
    public static void main(String[] args) {
        String str = "abdscxsdxxfgx";
        // StringBuilder res  = new StringBuilder();
        // int count = 0;
        // for(int i = 0 ; i < str.length()-1 ; i++){
        //     if(str.charAt(i) == 'x'){
        //         count = count + 1;
        //     }else{
        //         res.append(str.charAt(i));
        //     }
        // }
        // while (count >= 0) {
        //     res.append('x');
        //     count--;
        // }
        // System.out.println(res);
        MoveX(str, 0, 0, "");
    }
}
