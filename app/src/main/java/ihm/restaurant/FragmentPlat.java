package ihm.restaurant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentPlat extends Fragment {
    private View view;
    private int id_plat;
    public static FragmentPlat newInstance(int id_plat) {
        Bundle bundle = new Bundle();
        bundle.putInt("id_plat", id_plat);

        FragmentPlat fragment = new FragmentPlat();
        fragment.setArguments(bundle);

        return fragment;
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            id_plat = bundle.getInt("id_plat");
        }
    }


    @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        readBundle(getArguments());
        view = inflater.inflate(id_plat, container, false);
        return view;
    }
}
