package th.ac.su.cp.speedrecords;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class AddUserActivity extends AppCompatActivity {

    private EditText mTotal,mdistance,mduration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

      /*  mdistance = findViewById(R.id.distance_edit_Text);
        mduration = findViewById(R.id.duration_edit_Text);
        mdistance.setInputType(InputType.TYPE_NULL);
        mduration.setInputType(InputType.TYPE_NULL);*/

        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String distance;
               // String duration;
                final TextView text = (TextView) findViewById(R.id.textView2);
                final TextView text2 = (TextView) findViewById(R.id.textView3);

                final EditText distance = (EditText) findViewById(R.id.distance_edit_Text);
                final EditText time = (EditText) findViewById(R.id.duration_edit_Text);
                String idDis = distance.getText().toString();
                String idTime = time.getText().toString();
                double i = Double.parseDouble(idTime);
                double ii = Double.parseDouble(idDis); double sum=(ii*60*6)/(i*100);


                        // text2.setText(""+(ii*60*6)/(i*100));
                        String str = String.format(
                                Locale.getDefault(), "%.2f", sum
                        );
                        text.setText(str+" KM/H");

                      /*  if((ii/i)>80){
                            //show cow

                        }*/



                    }






        });

    }
}