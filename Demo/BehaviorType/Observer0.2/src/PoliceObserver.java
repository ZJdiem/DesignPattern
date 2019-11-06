public class PoliceObserver implements Observer {
    @Override
    public void Update(String str) {
        if(str.contains("敏感")) System.out.println("他们在讨论敏感话题:"+str);
        else System.out.println("他们在瞎聊"+str);

    }
}
