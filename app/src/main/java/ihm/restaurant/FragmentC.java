package ihm.restaurant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentC extends Fragment {
    private View view;
    @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_layout, container, false);
        //Instancier vos composants graphique ici (faîtes vos findViewById)
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMenu nextFrag= new FragmentMenu();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(Integer.parseInt(getTag()), nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}
