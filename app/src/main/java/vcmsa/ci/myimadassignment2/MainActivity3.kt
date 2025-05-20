package vcmsa.ci.myimadassignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

abstract class MainActivity3 : AppCompatActivity() , View.OnClickListener {
    private lateinit var textView3: TextView
    private lateinit var trueButton4: Button
    private lateinit var falseButton5: Button
    private lateinit var nqButton9: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView3 = findViewById(R.id.textView3)
        trueButton4 = findViewById(R.id.trueButton4)
        falseButton5 = findViewById(R.id.falseButton5)
        nqButton9 = findViewById(R.id.nqButton9)

        trueButton4.setOnClickListener(this)
        falseButton5.setOnClickListener(this)
        nqButton9.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.trueButton4 -> {
                // The Colosseum is in Rome ,Italy, so "True" is correct.
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            }

            R.id.falseButton5 -> {
                // The Colosseum is in rome , so "False" is incorrect.
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()

            }

            R.id.nqButton9 -> {
                // Create an Intent to navigate to MainActivity4
                val intent = Intent(this, MainActivity4::class.java)
            }
        }
    }
}