package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        //            0123456

        String result ="";

        for (int i = 0;i < str.length(); i++ ){ //i: index number of str (starting from 0)

            char ch = str.charAt(i);//ch: each characters of str

        if (str.indexOf(ch) == str.lastIndexOf(ch)){//if thefirst and last index numbers of the charecter are same,then the chracter is unique
            result += ch;
        }
    }
        System.out.println(result);
    }
}
