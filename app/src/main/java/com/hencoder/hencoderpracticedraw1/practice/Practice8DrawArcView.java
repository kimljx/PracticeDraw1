package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.MainActivity;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();

        canvas.drawArc(MainActivity.rectF,-20,10,true,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(MainActivity.rectF,-110,80,true,paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(MainActivity.rectF,20,140,true,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(MainActivity.rectF,-180,50,false,paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(MainActivity.rectF,0,20,false,paint);

    }
}
