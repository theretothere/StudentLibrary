import java.util.Scanner;
public class TestDemo {
    public static String reverse(String str){
        if(str == null){
            return null;
        }
        String string = str;
        //1、字符串转变为字符数组
        char[] ch = string.toCharArray();
        //2、进行逆置操作
        int i = 0;
        char tmp = ' ';
        while(i < ch.length-1-i){
            tmp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = tmp;
            i++;
        }
        for(char a: ch){
            System.out.print(a);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要逆置的字符串");
        String str = sc.nextLine();
        reverse(str);
    }
    public static String reverse2(String str,int i,int j) {
        if(str == null) return null;
        //1、先把字符串转变为数组
        char[] array = str.toCharArray();
        //2、开始逆置
        while (i < j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        return String.copyValueOf(array);
    }
    public String reverseLeftWords(String str, int k) {
        if(str == null) return null;
        int len = str.length();
        if(len == 0 || k <= 0 || k > len) {
            return null;
        }
        str = reverse2(str,0,k-1);//bacdef
        str = reverse2(str,k,len-1);//bafedc
        str = reverse2(str,0,len-1);//efab
        return str;
    }
}
