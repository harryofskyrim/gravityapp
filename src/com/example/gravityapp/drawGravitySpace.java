package com.example.gravityapp;

//import android.app.*;
//import android.os.*;
import android.view.*;
import android.graphics.*;
import android.content.Context;

public class drawGravitySpace extends View {
	
	Paint paint = new Paint();
	
	public drawGravitySpace(Context context) {
        super(context);            
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.DKGRAY);
        paint.setStrokeWidth(3);
        canvas.drawCircle(40, 40, 30, paint);

    }
	
	
}