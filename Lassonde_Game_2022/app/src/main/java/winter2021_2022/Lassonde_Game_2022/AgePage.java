package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgePage extends AppCompatActivity {
    private Button age_8_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_page);

        // changing from IntroPage -> AgePage
        this.age_8_9 = findViewById(R.id.button8_9);
        this.age_8_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgePage.this, TranspSpace8_9.class);
                startActivity(intent);
            }
        });
    }


}
