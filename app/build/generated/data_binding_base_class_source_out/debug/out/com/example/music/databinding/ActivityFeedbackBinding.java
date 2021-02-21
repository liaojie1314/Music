// Generated by view binder compiler. Do not edit!
package com.example.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.music.R;
import com.example.music.widget.TitleBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFeedbackBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnUpload;

  @NonNull
  public final EditText etContact;

  @NonNull
  public final EditText etFeedback;

  @NonNull
  public final LinearLayout llMain;

  @NonNull
  public final TitleBarLayout titleBar;

  private ActivityFeedbackBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnUpload,
      @NonNull EditText etContact, @NonNull EditText etFeedback, @NonNull LinearLayout llMain,
      @NonNull TitleBarLayout titleBar) {
    this.rootView = rootView;
    this.btnUpload = btnUpload;
    this.etContact = etContact;
    this.etFeedback = etFeedback;
    this.llMain = llMain;
    this.titleBar = titleBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUpload;
      Button btnUpload = rootView.findViewById(id);
      if (btnUpload == null) {
        break missingId;
      }

      id = R.id.etContact;
      EditText etContact = rootView.findViewById(id);
      if (etContact == null) {
        break missingId;
      }

      id = R.id.etFeedback;
      EditText etFeedback = rootView.findViewById(id);
      if (etFeedback == null) {
        break missingId;
      }

      id = R.id.llMain;
      LinearLayout llMain = rootView.findViewById(id);
      if (llMain == null) {
        break missingId;
      }

      id = R.id.titleBar;
      TitleBarLayout titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }

      return new ActivityFeedbackBinding((ConstraintLayout) rootView, btnUpload, etContact,
          etFeedback, llMain, titleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
