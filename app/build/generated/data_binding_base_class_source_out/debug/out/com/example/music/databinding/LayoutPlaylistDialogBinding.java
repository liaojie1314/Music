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

public final class LayoutPlaylistDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clSong;

  @NonNull
  public final TextView tvArtist;

  @NonNull
  public final TextView tvName;

  private LayoutPlaylistDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clSong, @NonNull TextView tvArtist, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.clSong = clSong;
    this.tvArtist = tvArtist;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutPlaylistDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutPlaylistDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_playlist_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutPlaylistDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout clSong = (ConstraintLayout) rootView;

      id = R.id.tvArtist;
      TextView tvArtist = rootView.findViewById(id);
      if (tvArtist == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new LayoutPlaylistDialogBinding((ConstraintLayout) rootView, clSong, tvArtist, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
