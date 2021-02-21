// Generated by view binder compiler. Do not edit!
package com.example.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.music.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutOpenSourceItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvLicense;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvUrl;

  private LayoutOpenSourceItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView tvLicense, @NonNull TextView tvName, @NonNull TextView tvUrl) {
    this.rootView = rootView;
    this.tvLicense = tvLicense;
    this.tvName = tvName;
    this.tvUrl = tvUrl;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutOpenSourceItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutOpenSourceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_open_source_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutOpenSourceItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvLicense;
      TextView tvLicense = rootView.findViewById(id);
      if (tvLicense == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvUrl;
      TextView tvUrl = rootView.findViewById(id);
      if (tvUrl == null) {
        break missingId;
      }

      return new LayoutOpenSourceItemBinding((ConstraintLayout) rootView, tvLicense, tvName, tvUrl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
