package tw.ming.app.helloworid.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private F1Fragment f1;
    private F2Fragment f2;
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private boolean isf2;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = F1Fragment.newInstance();
        f2 = new F2Fragment();

        title = (TextView) findViewById(R.id.title);

        fmgr = getFragmentManager();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container,f1);//將f1放進來
        tran.commit();
    }
    public void change(View view){
        isf2 = !isf2;
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container,isf2?f2:f1);//切換到版面
        tran.addToBackStack(null);//上一頁(back)
        tran.commit();
    }

//    public void f1test1(View view){
//        Log.i("ming","ok");
//    }
public TextView getMainTitle(){return title;}
    public F2Fragment getF2(){
        return f2;
    }
}
