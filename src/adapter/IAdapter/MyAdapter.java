package adapter.IAdapter;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    public static final int TYPE_A = 1;
    public static final int TYPE_B = 2;

    private ArrayList<String> dataList = null;

    public MyAdapter(ArrayList<String> dataList) {
        this.dataList = dataList;
    }


    @Override
    public IView drawView(int type, int position, int count) {
        System.out.println(type + " " + position + " " + count);
        return new MyView(type + " " + position + " " + count);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public int getItemType() {
        if (dataList.size() % 2 == 0)
            return TYPE_A;
        else
            return TYPE_B;
    }


    class MyView implements IView {
        private String viewStr;
        MyView(String view) {
            viewStr = view;
        }
        @Override
        public void showView() {
            System.out.println(viewStr);

        }
    }

}
