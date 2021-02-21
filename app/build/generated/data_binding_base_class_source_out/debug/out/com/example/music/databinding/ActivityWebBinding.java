// Generated by view binder compiler. Do not edit!
package com.example.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.music.R;
import com.example.music.widget.TitleBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWebBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TitleBarLayout titleBar;

  @NonNull
  public final WebView webView;

  private ActivityWebBinding(@NonNull ConstraintLayout rootView, @NonNull TitleBarLayout titleBar,
      @NonNull WebView webView) {
    this.rootView = rootView;
    this.titleBar = titleBar;
    this.webView = webView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWebBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWebBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_web, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWebBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.titleBar;
      TitleBarLayout titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }

      id = R.id.webView;
      WebView webView = rootView.findViewById(id);
      if (webView == null) {
        break missingId;
      }

      return new ActivityWebBinding((ConstraintLayout) rootView, titleBar, webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
