package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    RectF r1,r2;
    {
        r1 = new RectF(180,185,580,585);
        r2 = new RectF(160,160,560,560);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
//        画扇形,六个扇形
        paint.setColor(Color.RED);
        canvas.drawArc(r2,-180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(r1,-60,60,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(r1,5,10,true,paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(r1,20,10,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(r1,35,40,true,paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(r1,80,100,true,paint);

        //扇形标注
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(160,100);
        path.lineTo(260,100);
        path.lineTo(300,160);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        canvas.drawText("哈哈哈",50,100,paint);




    }
}
