/**
 * Author：Z&J
 * E-mail: 320647879@qq.com
 * 版本：1.0
 * 创建日期：2019/11/4 11:28
 * 类描述-Description：
 */
public class Client
{
    public static void main(String[] args)
    {
        People[] peoples={new People("张三","男",19),new People("李四","女",18),
                          new People("王五","女",20)};
        Classes c=new Classes();
        for(People p: peoples)
            c.addPeople(p);
        for(People p:c)
            System.out.println(p);
    }
}