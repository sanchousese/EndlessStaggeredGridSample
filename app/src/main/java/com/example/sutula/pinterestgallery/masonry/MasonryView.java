package com.example.sutula.pinterestgallery.masonry;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.sutula.pinterestgallery.R;
import com.squareup.picasso.Picasso;

import java.awt.font.TextAttribute;

/**
 * Created by Sutula on 11.04.16
 */
public class MasonryView extends RecyclerView.ViewHolder implements View.OnClickListener {

    public static final String TAG = "MasonryView";

    Context context;

    String id;

    ImageView imageView;

    public MasonryView(View itemView, Context context) {
        super(itemView);
        this.context = context;
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "id: " + id);
    }

    public void setItem(String id) {
        this.id = id;
        Picasso.with(context).load(id).into(imageView);
    }
}
