package ru.hello.world.permutation;

public class Permutation {

    private static int counter = 1;

    public static void main(String[] args) {
        String str = "abcd";
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf, str.length());

    }


    private static void doPerm(StringBuffer str, int index){
        if(index <= 0)
            System.out.println(counter++ + ".\t " + str);
        else{
            doPerm(str, index -1);
            int currPos = str.length() - index;
            for(int i = currPos + 1; i < str.length(); i++){
                swap(str, currPos, i);
                doPerm(str, index - 1);
                swap(str, i, currPos);
            }

        }
    }

    private static  void swap(StringBuffer str, int pos1, int pos2){
        char temp = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, temp);
    }

}
