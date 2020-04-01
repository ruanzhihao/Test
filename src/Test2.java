public class Test2 {
    /**
     * 测试this和super
     */
    private String username;
    private String password;

    public Test2 (String username){
        this.username=username;
    }
    public Test2 (String username,String password){
        //Call to 'this()' must be first statement in constructor body
        this(username);
        this.password=password;
    }

    public static void main(String[] args) {
        /**
         * 可以在外面的循环语句前定义一个标号，
         * 然后在里层循环体的代码中使用带有标号的break 语句，即可跳出外层循环。
         */
        ok:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("i=" + i + ",j=" + j);
                    if (j == 3) {
                        break ok;
                    }
                }
            }
        }
    }

