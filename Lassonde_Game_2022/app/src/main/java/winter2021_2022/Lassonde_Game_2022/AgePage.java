package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgePage extends AppCompatActivity {
    private Button age_8_9;
    private Button age_10_11;
    private Button age_12_13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_page);

        // changing from Age Page 8 - 9 -> Transportation and Space tourism
        this.age_8_9 = findViewById(R.id.button8_9);
        this.age_8_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgePage.this, TranspSpace8_9.class);
                startActivity(intent);
            }
        });

        // changing from Age Page 10 - 11 -> Transportation and Space tourism
        this.age_10_11 = findViewById(R.id.button10_11);
        this.age_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgePage.this, TranspSpace10_11.class);
                startActivity(intent);
            }
        });

        // changing from Age Page 10 - 11 -> Transportation and Space tourism
        this.age_12_13 = findViewById(R.id.button12_13);
        this.age_12_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgePage.this, TranspSpace12_13.class);
                startActivity(intent);
            }
        });
    }


}
