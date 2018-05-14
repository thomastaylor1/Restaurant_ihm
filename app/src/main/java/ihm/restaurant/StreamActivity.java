package ihm.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class StreamActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_layout);

        Bundle b = getIntent().getExtras();
        String ip = "";
        if(b != null) {
            ip = b.getString("ip");
        }
        /*String embedStream = "<html><body>" +
                "<iframe style=\"border: 0; width: 100%; height: 100%; body{margin:0}\" src=\"https://www.youtube.com/embed/live_stream?channel=UCghRtNAbZYPS8q2NkLiqlNA\" scrolling=\"no\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowFullScreen></iframe>"
                + "</body></html>";*/
        /*String embedStream = "<html><body>" +
                "<iframe style=\"border: 0; width: 100%; height: 100%; body{margin:0}\" src=\"http://192.168.0.14:8080\" scrolling=\"no\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowFullScreen></iframe>"
                + "</body></html>";*/
        WebView streamView = (WebView) findViewById(R.id.stream_view);
        //streamView.loadData(embedStream, "text/html", "utf-8");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        streamView.setLayoutParams(params);
        streamView.loadUrl("http://"+ip);
        streamView.clearCache(true);
        streamView.clearHistory();
        streamView.getSettings().setJavaScriptEnabled(true);
        streamView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

    }
}
