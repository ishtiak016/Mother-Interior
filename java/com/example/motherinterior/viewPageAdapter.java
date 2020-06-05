package com.example.motherinterior;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class viewPageAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<String>imageUrl;
    String s;
    ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;

    viewPageAdapter(Context context, ArrayList<String> imageurl){
        this.context=context;
        this.imageUrl=imageurl;
    }
    @Override
    public int getCount() {
        return imageUrl.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
         imageView=new ImageView(context);

        Picasso.with(context)
                .load(imageUrl.get(position))
                .fit()
                .centerInside()
                .into(imageView);
        container.addView(imageView);
        s=imageUrl.get(position);
        Intent intent=new Intent(context,DetailsActivity.class);
        intent.putExtra("download", imageUrl.get(position));
        return imageView;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }

}
