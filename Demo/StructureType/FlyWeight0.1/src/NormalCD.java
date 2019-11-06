public class NormalCD implements CD{
    private String name;
    private String birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public void show() {
        System.out.println(name+birthDay);
    }
}
