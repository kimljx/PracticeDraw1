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

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    RectF r1, r2, r3, r4, r5, r6, r7, r8, r9;

    {
        r1 = new RectF(210, 500, 280, 600);
        r2 = new RectF(300, 400, 370, 600);
        r3 = new RectF(390, 300, 460, 600);
        r4 = new RectF(480, 200, 550, 600);
        r5 = new RectF(570, 250, 640, 600);
        r6 = new RectF(660, 400, 730, 600);
        r7 = new RectF(750, 300, 820, 600);
        r8 = new RectF(840, 200, 910, 600);
        r9 = new RectF(930, 250, 1000, 600);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        Path path_line = new Path();

        //画坐标系
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);
        path_line.moveTo(100, 50);
        path_line.lineTo(100, 600);
        path_line.lineTo(1000, 600);
        canvas.drawPath(path_line, paint);
        float t = 140;
        float y = 630;

        //画文本
        Paint paint1 = new Paint();
        paint1.setColor(Color.WHITE);
        paint1.setTextSize(25);
//        文字间距
        paint1.setTextScaleX(1);
        //倾斜
        paint1.setTextSkewX((float) -0.5);
//        paint1.setTextLocale();
        canvas.drawText("t1",t,y,paint1);
        canvas.drawText("t2",t+90*1,y,paint1);
        canvas.drawText("t3",t+90*2,y,paint1);
        canvas.drawText("t4",t+90*3,y,paint1);
        canvas.drawText("t5",t+90*4,y,paint1);
        canvas.drawText("t6",t+90*5,y,paint1);
        canvas.drawText("t7",t+90*6,y,paint1);
        canvas.drawText("t8",t+90*7,y,paint1);
        canvas.drawText("t9",t+90*8,y,paint1);
        canvas.drawText("t10",t+90*9,y,paint1);



        //画直方图
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawLine(120, 595, 190, 595, paint);

        paint.setColor(Color.GRAY);
        canvas.drawRect(r1, paint);
        canvas.drawRect(r2, paint);
        canvas.drawRect(r3, paint);
        canvas.drawRect(r4, paint);
        canvas.drawRect(r5, paint);
        canvas.drawRect(r6, paint);
        canvas.drawRect(r7, paint);
        canvas.drawRect(r8, paint);
        canvas.drawRect(r9, paint);


    }
}
