package megadice.awesome;


import megadice.awesome.MainActivity.PlaceholderFragment;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment{
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	
    	View view = inflater.inflate(R.layout.first_fragment, container, false);
    	
    	
    	
        return view;
    }
    
}
