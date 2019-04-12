package annotations.a2;

import sun.font.BidiUtils;

import javax.xml.ws.BindingType;

public class BIndModel {


    public Button getBt1() {
        return bt1;
    }

    public void setBt1(Button bt1) {
        this.bt1 = bt1;
    }

    public Button getBt2() {
        return bt2;
    }

    public void setBt2(Button bt2) {
        this.bt2 = bt2;
    }

    @BIndView(value = 1)
    private Button bt1;

    @BIndView(value = 2)
    private Button bt2;

    public Button setBt(int i){
        return new Button("按钮",i);
    }

}
