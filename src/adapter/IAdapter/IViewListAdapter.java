package adapter.IAdapter;

public interface IViewListAdapter {
    public IView drawView(int type, int position, int count);

    public int getItemType();

    public int getCount();

    public int getPosition();

    public interface IView{
        public void showView();
    }
}
