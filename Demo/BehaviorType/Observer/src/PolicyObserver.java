public class PolicyObserver implements MyObserver{

    @Override
    public void update(String str) {
        System.out.println("["+str+"]不是敏感话题");
    }
}
