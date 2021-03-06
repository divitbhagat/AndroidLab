// Generated by view binder compiler. Do not edit!
package com.example.droidcafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.droidcafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView donut;

  @NonNull
  public final TextView donutDescription;

  @NonNull
  public final ImageView froyo;

  @NonNull
  public final TextView froyoDescription;

  @NonNull
  public final ImageView iceCream;

  @NonNull
  public final TextView iceCreamDescription;

  @NonNull
  public final TextView textintro;

  private ContentMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView donut,
      @NonNull TextView donutDescription, @NonNull ImageView froyo,
      @NonNull TextView froyoDescription, @NonNull ImageView iceCream,
      @NonNull TextView iceCreamDescription, @NonNull TextView textintro) {
    this.rootView = rootView;
    this.donut = donut;
    this.donutDescription = donutDescription;
    this.froyo = froyo;
    this.froyoDescription = froyoDescription;
    this.iceCream = iceCream;
    this.iceCreamDescription = iceCreamDescription;
    this.textintro = textintro;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.donut;
      ImageView donut = rootView.findViewById(id);
      if (donut == null) {
        break missingId;
      }

      id = R.id.donut_description;
      TextView donutDescription = rootView.findViewById(id);
      if (donutDescription == null) {
        break missingId;
      }

      id = R.id.froyo;
      ImageView froyo = rootView.findViewById(id);
      if (froyo == null) {
        break missingId;
      }

      id = R.id.froyo_description;
      TextView froyoDescription = rootView.findViewById(id);
      if (froyoDescription == null) {
        break missingId;
      }

      id = R.id.ice_cream;
      ImageView iceCream = rootView.findViewById(id);
      if (iceCream == null) {
        break missingId;
      }

      id = R.id.ice_cream_description;
      TextView iceCreamDescription = rootView.findViewById(id);
      if (iceCreamDescription == null) {
        break missingId;
      }

      id = R.id.textintro;
      TextView textintro = rootView.findViewById(id);
      if (textintro == null) {
        break missingId;
      }

      return new ContentMainBinding((ConstraintLayout) rootView, donut, donutDescription, froyo,
          froyoDescription, iceCream, iceCreamDescription, textintro);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
