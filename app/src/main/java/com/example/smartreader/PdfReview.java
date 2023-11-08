package com.example.smartreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PdfReview extends RecyclerView.ViewHolder {
    public TextView tvName;
    public CardView container;

    public PdfReview(@NonNull View itemView) {
        super(itemView);

        tvName= itemView.findViewById(R.id.pdfName);
        container= itemView.findViewById(R.id.con);
    }
}
