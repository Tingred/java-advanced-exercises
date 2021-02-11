package anonymous;

public class MenuItem {

    final String label;
    final int number;
    CallBack callBack;

    public MenuItem(String label, int number) {
        this.label = label;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }
    public void setCallBack(CallBack callBack){
        this.callBack = callBack;
    }

    public void process(){
        if (callBack != null){
            callBack.aciton();
        }
    }
}
