package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamePage extends AppCompatActivity {
    private Button buttonReturnToAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        // changing from Space Tourism 10 - 11 -> 3 Categories of Space Tourism
        this.buttonReturnToAge = findViewById(R.id.buttonReturnToAge);
        this.buttonReturnToAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GamePage.this, AgePage.class);
                startActivity(intent);
            }
        });
    }
}