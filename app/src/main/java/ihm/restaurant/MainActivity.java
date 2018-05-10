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

    private PopupWindow popupMenu;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout) findViewById(R.id.main_layout);
    }

    public void showMenu(View view){
        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popup_menu, null);
        //popupMenu = new PopupWindow(container, 600, 800,true);
        popupMenu = new PopupWindow(container, Toolbar.LayoutParams.MATCH_PARENT, Toolbar.LayoutParams.MATCH_PARENT, true);
        switch(view.getId())
         {
          case R.id.button1:
          popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.TOP, 0, 0);
          break;

          case R.id.button2:
          popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.TOP, 0, 0);
          break;

          case R.id.button3:
          popupMenu.showAtLocation(mainLayout, Gravity.LEFT | Gravity.BOTTOM, 0, 0);
          break;

          case R.id.button4:
               popupMenu.showAtLocation(mainLayout, Gravity.RIGHT | Gravity.BOTTOM, 0, 0);
               break;
         }




       /* container.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                popupMenu.dismiss();
                return true;
            }
        }); */
    }
    /* AUTRE POPUP */
    /* public void showMenu(View sender) {
            Dialog dialogMenu = new Dialog(this);
            dialogMenu.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialogMenu.setContentView(R.layout.popup_menu);
            dialogMenu.setCanceledOnTouchOutside(true);
            android.widget.TextView menu_title = (TextView) dialogMenu
                    .findViewById(R.id.menu_title);
            //menu_title.setText(title);

            /* Button yes = (Button) dialog.findViewById(R.id.alertbox_yes);
            Button no = (Button) dialog.findViewById(R.id.alertbox_no);

            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //code the functionality when YES button is clicked
                }
            });

            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //code the functionality when NO button is clicked
                }
            });

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialogMenu.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        dialogMenu.show();
        dialogMenu.getWindow().setAttributes(lp);
        dialogMenu.show();
    }
    */

}
