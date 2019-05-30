package adapter.ClassAdapter;

public class PsAdapter extends Ps implements PsB  {
    @Override
    public boolean ps2Ready() {
        return true;
    }
}
