package com.example.smartreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class PdfAdapter extends RecyclerView.Adapter<PdfReview> {
    private Context context;
    private List<File> pdfFiles;

    public PdfAdapter(Context context, List<File> pdfFiles) {
        this.context = context;
        this.pdfFiles = pdfFiles;
    }

    @NonNull
    @Override
    public PdfReview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PdfReview(LayoutInflater.from(context).inflate(R.layout.element_main,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PdfReview holder, int position) {
        holder.tvName.setText(pdfFiles.get(position).getName());
        holder.tvName.setSelected(true);

    }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }
}
