public class generic {
    <T> void  genericprint(T t)
    {
        System.out.println(t);
    }
    public static void main(String[] args){
        generic obj=new generic();
        obj.genericprint(101);
        obj.genericprint("hello world");
        obj.genericprint(4.234);
    }
}
