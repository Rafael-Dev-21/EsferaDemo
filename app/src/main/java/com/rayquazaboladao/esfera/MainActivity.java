package com.rayquazaboladao.esfera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DemoView(this));

    }
    
    private static class DemoView extends View {
      private static Paint paint;
    
      public DemoView(Context context) {
        super(context);
        
        paint = new Paint();
      }
      
      public void onDraw(Canvas canvas) {
        
        final float base = (float)(Math.sqrt(2) - 1);
        
        float offset = 0.0f;
        int tone = 0;
      
        for(int i = 255; i > 0; i--) {
          tone = 255 - i;
          offset = tone * base;
          
          paint.setColor(Color.rgb(tone, tone, tone));
          canvas.drawCircle(getWidth() / 2 + offset, getHeight() / 2 - offset, i, paint);
        }
      }
    }

}
