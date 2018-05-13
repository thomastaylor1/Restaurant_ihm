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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public class FragmentStream extends Fragment{
    private View view;

    @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.stream_layout, container, false);
        String embedStream = "<html><body>" +
                "<iframe style=\"border: 0; width: 100%; height: 100%; body{margin:0}\" src=\"https://www.youtube.com/embed/p0FN0K3xdOQ\" scrolling=\"no\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowFullScreen></iframe>"
                + "</body></html>";
        WebView streamView = (WebView) view.findViewById(R.id.stream_view);
        streamView.loadData(embedStream, "text/html", "utf-8");
        streamView.clearCache(true);
        streamView.clearHistory();
        streamView.getSettings().setJavaScriptEnabled(true);
        streamView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        return view;
    }
}

