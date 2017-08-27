package tw.ming.app.helloworid.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F1Fragment extends Fragment {
    public F1Fragment(){
        Log.i("ming","F1Fragment");
    }

    // TODO: Rename and change types and number of parameters
    public static F1Fragment newInstance() {
       F1Fragment f1Fragment = new F1Fragment();
        return f1Fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ming","F1Fragment:onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("ming","onAttach()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("ming","onDetach()");
    }

}
