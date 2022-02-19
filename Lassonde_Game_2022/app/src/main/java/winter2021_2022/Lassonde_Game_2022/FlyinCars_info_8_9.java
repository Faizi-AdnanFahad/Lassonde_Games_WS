package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FlyinCars_info_8_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyin_cars_info89);

        final RadioGroup radio = (RadioGroup) findViewById(R.id.radio_group_1);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            private View radioButton3;

            @SuppressLint("WrongConstant")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                View radioButton = radio.findViewById(checkedId);
                int index = radio.indexOfChild(radioButton);

                switch (index) {
                    case 0: // first button
                    case 1: // second button
                        Toast.makeText(getApplicationContext(), "Incorrect! Please read further.", 500).show();
                        break;
                    case 2: // third button
                        Toast.makeText(getApplicationContext(), "Bravo! Enjoy the game.", 500).show();

                        // changing from correct Answer 8 - 9 -> Game
                        this.radioButton3 = findViewById(R.id.radio_button3);
                        radioButton3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(FlyinCars_info_8_9.this, GamePage.class);
                                startActivity(intent);
                            }
                        });
                        break;
                }
            }
        });
    }

    /* this mutator sets the output label */
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }
}