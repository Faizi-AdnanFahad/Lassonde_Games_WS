package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Venus_12_13 extends AppCompatActivity {
    private TextView textViewExhibitC1andC2_space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus1213);

        // changing from Space Tourism 12 - 13 -> 3 Categories of Space Tourism
        this.textViewExhibitC1andC2_space = findViewById(R.id.textViewExhibitC1andC2_space);
        this.textViewExhibitC1andC2_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Venus_12_13.this, Trans3Cat_12_13.class);
                startActivity(intent);
            }
        });
    }
}