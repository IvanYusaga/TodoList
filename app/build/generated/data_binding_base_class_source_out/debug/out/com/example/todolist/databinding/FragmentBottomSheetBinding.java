// Generated by view binder compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todolist.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBottomSheetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout bottomSheet;

  @NonNull
  public final MaterialButton btnSave;

  @NonNull
  public final TextInputEditText edtDescription;

  @NonNull
  public final TextInputEditText edtTitle;

  @NonNull
  public final LinearLayout llForm;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvTime;

  private FragmentBottomSheetBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout bottomSheet, @NonNull MaterialButton btnSave,
      @NonNull TextInputEditText edtDescription, @NonNull TextInputEditText edtTitle,
      @NonNull LinearLayout llForm, @NonNull TextView tvDate, @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.bottomSheet = bottomSheet;
    this.btnSave = btnSave;
    this.edtDescription = edtDescription;
    this.edtTitle = edtTitle;
    this.llForm = llForm;
    this.tvDate = tvDate;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout bottomSheet = (ConstraintLayout) rootView;

      id = R.id.btn_save;
      MaterialButton btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.edt_description;
      TextInputEditText edtDescription = ViewBindings.findChildViewById(rootView, id);
      if (edtDescription == null) {
        break missingId;
      }

      id = R.id.edt_title;
      TextInputEditText edtTitle = ViewBindings.findChildViewById(rootView, id);
      if (edtTitle == null) {
        break missingId;
      }

      id = R.id.ll_form;
      LinearLayout llForm = ViewBindings.findChildViewById(rootView, id);
      if (llForm == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      return new FragmentBottomSheetBinding((ConstraintLayout) rootView, bottomSheet, btnSave,
          edtDescription, edtTitle, llForm, tvDate, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
