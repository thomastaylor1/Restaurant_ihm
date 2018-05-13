package ihm.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class StreamActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_layout);
        String embedStream = "<html><body>" +
                "<iframe style=\"border: 0; width: 100%; height: 100%; body{margin:0}\" src=\"https://www.youtube.com/embed/p0FN0K3xdOQ\" scrolling=\"no\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowFullScreen></iframe>"
                + "</body></html>";
        WebView streamView = (WebView) findViewById(R.id.stream_view);
        streamView.loadData(embedStream, "text/html", "utf-8");
        streamView.clearCache(true);
        streamView.clearHistory();
        streamView.getSettings().setJavaScriptEnabled(true);
        streamView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

    }
}
