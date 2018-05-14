package ihm.restaurant;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.*;

public class MainActivity extends Activity {
    private Fragment fragmentA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        LinearLayout fragmentsLayoutTop = (LinearLayout) findViewById(R.id.layout_top);
        LinearLayout fragmentsLayoutBottom = (LinearLayout) findViewById(R.id.layout_bottom);

        LinearLayout fragTopLeft = new LinearLayout(this);
        LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,
                1.0f

        );
        //params.gravity = Gravity.BOTTOM;
        fragTopLeft.setLayoutParams(params);
        fragTopLeft.setOrientation(LinearLayout.HORIZONTAL);
        int id1 = View.generateViewId();
        fragTopLeft.setId(id1);

        LinearLayout fragTopRight = new LinearLayout(this);
        fragTopRight.setLayoutParams(params);
        fragTopRight.setOrientation(LinearLayout.HORIZONTAL);
        int id2 = View.generateViewId();
        fragTopRight.setId(id2);

        fragmentsLayoutTop.addView(fragTopLeft);
        fragmentsLayoutTop.addView(fragTopRight);

        LinearLayout fragBottomLeft = new LinearLayout(this);
        fragBottomLeft.setLayoutParams(params);
        fragBottomLeft.setOrientation(LinearLayout.HORIZONTAL);
        int id3 = View.generateViewId();
        fragBottomLeft.setId(id3);

        LinearLayout fragBottomRight = new LinearLayout(this);
        fragBottomRight.setLayoutParams(params);
        fragBottomRight.setOrientation(LinearLayout.HORIZONTAL);
        int id4 = View.generateViewId();
        fragBottomRight.setId(id4);

        fragmentsLayoutBottom.addView(fragBottomLeft);
        fragmentsLayoutBottom.addView(fragBottomRight);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragmentA = new FragmentA();
        Fragment fragmentB = new FragmentA();
        Fragment fragmentC = new FragmentA();
        Fragment fragmentD = new FragmentA();
        //Fragment fragmentBack = new FragmentStream();
        //fragmentTransaction.add(android.R.id.content, fragmentBack);

        fragmentTransaction.add(fragTopLeft.getId(), fragmentA, String.valueOf(id1));
        fragmentTransaction.add(fragTopRight.getId(), fragmentB, String.valueOf(id2));
        fragmentTransaction.add(fragBottomLeft.getId(), fragmentC, String.valueOf(id3));
        fragmentTransaction.add(fragBottomRight.getId(), fragmentD, String.valueOf(id4));

        fragmentTransaction.commit();


    }
}
