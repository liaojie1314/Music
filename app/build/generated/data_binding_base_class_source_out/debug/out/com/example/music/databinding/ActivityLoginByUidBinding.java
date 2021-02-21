// Generated by view binder compiler. Do not edit!
package com.example.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.music.R;
import com.example.music.widget.TitleBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginByUidBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final ConstraintLayout clLoginByPhone;

  @NonNull
  public final EditText etUid;

  @NonNull
  public final TitleBarLayout titleBar;

  @NonNull
  public final TextView tvHelp;

  @NonNull
  public final TextView tvLoginByUid;

  private ActivityLoginByUidBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull ConstraintLayout clLoginByPhone, @NonNull EditText etUid,
      @NonNull TitleBarLayout titleBar, @NonNull TextView tvHelp, @NonNull TextView tvLoginByUid) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.clLoginByPhone = clLoginByPhone;
    this.etUid = etUid;
    this.titleBar = titleBar;
    this.tvHelp = tvHelp;
    this.tvLoginByUid = tvLoginByUid;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginByUidBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginByUidBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_by_uid, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginByUidBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = rootView.findViewById(id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.clLoginByPhone;
      ConstraintLayout clLoginByPhone = rootView.findViewById(id);
      if (clLoginByPhone == null) {
        break missingId;
      }

      id = R.id.etUid;
      EditText etUid = rootView.findViewById(id);
      if (etUid == null) {
        break missingId;
      }

      id = R.id.titleBar;
      TitleBarLayout titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }

      id = R.id.tvHelp;
      TextView tvHelp = rootView.findViewById(id);
      if (tvHelp == null) {
        break missingId;
      }

      id = R.id.tvLoginByUid;
      TextView tvLoginByUid = rootView.findViewById(id);
      if (tvLoginByUid == null) {
        break missingId;
      }

      return new ActivityLoginByUidBinding((ConstraintLayout) rootView, btnLogin, clLoginByPhone,
          etUid, titleBar, tvHelp, tvLoginByUid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
