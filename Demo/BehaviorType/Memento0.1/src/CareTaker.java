import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private EmpMemento empMemento;
    private List<EmpMemento> emps=new ArrayList<>();

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
