package megadice.awesome;


import megadice.awesome.MainActivity.PlaceholderFragment;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

public class MyFragment extends Fragment{
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	
    	View view = inflater.inflate(R.layout.first_fragment, container, false);
    	
    	( (ImageView) view.findViewById(R.id.imageView1) ).setImageDrawable(new MyDrawable());
    	
        return view;
    }
    
    public class MyDrawable extends Drawable{

		@Override
		public void draw(Canvas canvas) {
			// TODO Auto-generated method stub
			Paint paint = new Paint();
			paint.setColor(Color.BLUE);
			canvas.drawLine(0, 0, 500, 500, paint);
		}

		@Override
		public int getOpacity() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setAlpha(int arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setColorFilter(ColorFilter arg0) {
			// TODO Auto-generated method stub
			
		}
    	
    }
    
}
