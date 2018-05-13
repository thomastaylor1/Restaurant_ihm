package ihm.restaurant;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class FragmentMenu extends Fragment {
    private View view;
    @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.popup_menu, container, false);

        ImageButton backButton = (ImageButton) view.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                FragmentA nextFrag = new FragmentA();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(Integer.parseInt(getTag()), nextFrag, getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button entree_voir1 = (Button) view.findViewById(R.id.entree_voir1);
        entree_voir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentPlat nextFrag = FragmentPlat.newInstance(R.layout.salade_chevre);
                getActivity().getFragmentManager().beginTransaction()
                        .replace(Integer.parseInt(getTag()), nextFrag, getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}
