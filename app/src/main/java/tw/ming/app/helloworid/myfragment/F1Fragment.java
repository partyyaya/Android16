package tw.ming.app.helloworid.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F1Fragment extends Fragment {
    private TextView mesg;
    private View mainView;
    private MainActivity mainActivity;
    private TextView mainTitle;
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
        mainActivity = (MainActivity) getActivity();
        mainTitle = mainActivity.getMainTitle();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO: Rename method, update argument and hook method into UI event
        //Log.i("ming","F1Fragment:onCreateView()");
        //container部等於R.id.container
        if(mainView==null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);
            mesg = (TextView) mainView.findViewById(R.id.f1mesg);
            //若按下按鈕則看自己
            final View f1test1 = mainView.findViewById(R.id.f1test1);
            f1test1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test1();
                }
            });

            final View f1test2 = mainView.findViewById(R.id.f1test2);
            f1test2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test2();
                }
            });
            final View f1test3 = mainView.findViewById(R.id.f1test3);
            f1test3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test3();
                }
            });
        }
        return mainView;
    }
    public void f1test1(){//會叫步道
        mesg.setText(""+(int)(Math.random()*40));
    }

    public void f1test2(){
        //Log.i("ming","f2:ok"+(int)(Math.random()*40));
        mainTitle.setText("TitleChange");
    }

    public void f1test3(){
        TextView f2mesg = mainActivity.getF2().getF2mesg();
        if (f2mesg != null){
            f2mesg.setText("Change by F1");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("ming","F1:onAttach()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("ming","F1:onDetach()");
    }

}
