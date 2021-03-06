// Generated by view binder compiler. Do not edit!
package com.example.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.music.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExampleBannerLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivBackground;

  private ExampleBannerLayoutBinding(@NonNull CardView rootView, @NonNull ImageView ivBackground) {
    this.rootView = rootView;
    this.ivBackground = ivBackground;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ExampleBannerLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExampleBannerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.example_banner_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExampleBannerLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivBackground;
      ImageView ivBackground = rootView.findViewById(id);
      if (ivBackground == null) {
        break missingId;
      }

      return new ExampleBannerLayoutBinding((CardView) rootView, ivBackground);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
