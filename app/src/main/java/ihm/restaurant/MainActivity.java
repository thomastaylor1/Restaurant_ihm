package ihm.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.app.Dialog;


public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private LinearLayout mainLayout;
    private Button top_left;
    private Button bottom_left;
    private Button top_right;
    private Button bottom_right;

    private Button btnVoir1;

    private String current_menu;

    private PopupWindow popupMenu;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout) findViewById(R.id.main_layout);


    }

    public void showMenu(View view) {
        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popup_menu, null);
        popupMenu = new PopupWindow(container, 600, 800, true);
        //popupMenu = new PopupWindow(container, Toolbar.LayoutParams.MATCH_PARENT, Toolbar.LayoutParams.MATCH_PARENT, true);
        switch (view.getId()) {
            case R.id.button1:
                popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.TOP, 0, 0);
                btnVoir1 = (Button) container.findViewById(R.id.entree_voir1);
                btnVoir1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View view){
                        popupMenu.dismiss();
                        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.salade_chevre, null);
                        popupMenu = new PopupWindow(container, 600, 800, true);
                        popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.TOP, 0, 0);
                        System.out.println(current_menu);
                    }
                });
                current_menu = "top_left";
                break;

            case R.id.button2:
                popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.TOP, 0, 0);
                current_menu = "top_right";
                break;

            case R.id.button3:
                popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.BOTTOM, 0, 0);
                current_menu = "bottom_left";
                break;

            case R.id.button4:
                popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.BOTTOM, 0, 0);
                current_menu = "bottom_right";
                break;
        }
    }

    public void showPlat(View view) {
        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        switch (view.getId()) {
            case R.id.entree_voir1:
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.salade_chevre, null);
                popupMenu = new PopupWindow(container, 600, 800, true);
                switch (current_menu) {
                    case "top_left":
                        popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.TOP, 0, 0);
                        System.out.println(current_menu);
                        break;
                    case "top_right":
                        popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.TOP, 0, 0);
                        break;
                    case "bottom_left":
                        popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.BOTTOM, 0, 0);
                        break;
                    case "bottom_right":
                        popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.BOTTOM, 0, 0);
                        break;
                }

                break;

            case R.id.button2:


            case R.id.button3:


            case R.id.button4:

        }
    }
}
