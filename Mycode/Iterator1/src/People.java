/**
 * Author：Z&J
 * E-mail: 320647879@qq.com
 * 版本：1.0
 * 创建日期：2019/11/4 11:10
 * 类描述-Description：
 */
public class People
{
    private String name;
    private String sex;
    private int age;
    public People(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name+sex+age;
    }
}
