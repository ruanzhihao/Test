public class Test1 {
    public static void main(String[] args) {
        //s1 = s1 + 1,与s1+=1的区别
        short s1=1;
      /*  s1=(short)(s1+1);
        System.out.println(s1);*/
        s1+=1;
        System.out.println(s1);
        //switch中条件不能为Long型 required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
        int  a=0;
        switch(a=1) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周er");
                break;
            default:
                System.out.println("error");
                break;
        }
        final  int ad=9;
        final StringBuilder sb=new StringBuilder("addad");
        System.out.println(sb.hashCode());
        System.out.println(sb.toString());
        System.out.println(sb.getClass().getName()+"@"+Integer.toHexString(sb.hashCode()));
        sb.append("我变了");
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb.hashCode());
        System.out.println(sb.getClass().getName()+"@"+Integer.toHexString(sb.hashCode()));
    }
}
