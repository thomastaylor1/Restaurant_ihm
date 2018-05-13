package ihm.restaurant;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public class FragmentA extends Fragment{
    private View view;

    @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        setRetainInstance(true);
        view = inflater.inflate(R.layout.fragment_layout, container, false);
        //Instancier vos composants graphique ici (faîtes vos findViewById)
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMenu nextFrag = new FragmentMenu();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(Integer.parseInt(getTag()), nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}

