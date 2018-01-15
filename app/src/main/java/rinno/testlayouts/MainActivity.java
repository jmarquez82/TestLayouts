package rinno.testlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View viewInflated;
    private ViewStub vsCentro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vsCentro = (ViewStub)findViewById(R.id.vsCentro);

        viewInflated = vsCentro.inflate();

        if(viewInflated != null){

            TextView tv_ = (TextView) viewInflated.findViewById(R.id.tv_);
            Button b_ = (Button) viewInflated.findViewById(R.id.b_);

            tv_.setText("Hola");
            b_.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewInflated.setVisibility(View.GONE);
                }
            });
        }


    }
}
