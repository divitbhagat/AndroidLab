// Generated by view binder compiler. Do not edit!
package com.example.droidcafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.droidcafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addressLabel;

  @NonNull
  public final EditText addressText;

  @NonNull
  public final TextView deliveryLabel;

  @NonNull
  public final Spinner labelSpinner;

  @NonNull
  public final TextView nameLabel;

  @NonNull
  public final EditText nameText;

  @NonNull
  public final RadioButton nextday;

  @NonNull
  public final TextView noteLabel;

  @NonNull
  public final EditText noteText;

  @NonNull
  public final TextView orderTextview;

  @NonNull
  public final TextView phoneLabel;

  @NonNull
  public final EditText phoneText;

  @NonNull
  public final RadioButton pickup;

  @NonNull
  public final RadioButton sameday;

  @NonNull
  public final TextView textView;

  private ActivityOrderBinding(@NonNull ConstraintLayout rootView, @NonNull TextView addressLabel,
      @NonNull EditText addressText, @NonNull TextView deliveryLabel, @NonNull Spinner labelSpinner,
      @NonNull TextView nameLabel, @NonNull EditText nameText, @NonNull RadioButton nextday,
      @NonNull TextView noteLabel, @NonNull EditText noteText, @NonNull TextView orderTextview,
      @NonNull TextView phoneLabel, @NonNull EditText phoneText, @NonNull RadioButton pickup,
      @NonNull RadioButton sameday, @NonNull TextView textView) {
    this.rootView = rootView;
    this.addressLabel = addressLabel;
    this.addressText = addressText;
    this.deliveryLabel = deliveryLabel;
    this.labelSpinner = labelSpinner;
    this.nameLabel = nameLabel;
    this.nameText = nameText;
    this.nextday = nextday;
    this.noteLabel = noteLabel;
    this.noteText = noteText;
    this.orderTextview = orderTextview;
    this.phoneLabel = phoneLabel;
    this.phoneText = phoneText;
    this.pickup = pickup;
    this.sameday = sameday;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_label;
      TextView addressLabel = rootView.findViewById(id);
      if (addressLabel == null) {
        break missingId;
      }

      id = R.id.address_text;
      EditText addressText = rootView.findViewById(id);
      if (addressText == null) {
        break missingId;
      }

      id = R.id.delivery_label;
      TextView deliveryLabel = rootView.findViewById(id);
      if (deliveryLabel == null) {
        break missingId;
      }

      id = R.id.label_spinner;
      Spinner labelSpinner = rootView.findViewById(id);
      if (labelSpinner == null) {
        break missingId;
      }

      id = R.id.name_label;
      TextView nameLabel = rootView.findViewById(id);
      if (nameLabel == null) {
        break missingId;
      }

      id = R.id.name_text;
      EditText nameText = rootView.findViewById(id);
      if (nameText == null) {
        break missingId;
      }

      id = R.id.nextday;
      RadioButton nextday = rootView.findViewById(id);
      if (nextday == null) {
        break missingId;
      }

      id = R.id.note_label;
      TextView noteLabel = rootView.findViewById(id);
      if (noteLabel == null) {
        break missingId;
      }

      id = R.id.note_text;
      EditText noteText = rootView.findViewById(id);
      if (noteText == null) {
        break missingId;
      }

      id = R.id.order_textview;
      TextView orderTextview = rootView.findViewById(id);
      if (orderTextview == null) {
        break missingId;
      }

      id = R.id.phone_label;
      TextView phoneLabel = rootView.findViewById(id);
      if (phoneLabel == null) {
        break missingId;
      }

      id = R.id.phone_text;
      EditText phoneText = rootView.findViewById(id);
      if (phoneText == null) {
        break missingId;
      }

      id = R.id.pickup;
      RadioButton pickup = rootView.findViewById(id);
      if (pickup == null) {
        break missingId;
      }

      id = R.id.sameday;
      RadioButton sameday = rootView.findViewById(id);
      if (sameday == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityOrderBinding((ConstraintLayout) rootView, addressLabel, addressText,
          deliveryLabel, labelSpinner, nameLabel, nameText, nextday, noteLabel, noteText,
          orderTextview, phoneLabel, phoneText, pickup, sameday, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
