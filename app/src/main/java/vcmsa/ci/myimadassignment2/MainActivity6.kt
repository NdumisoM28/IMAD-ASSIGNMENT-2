package vcmsa.ci.myimadassignment2

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

abstract class MainActivity6 : AppCompatActivity() , View.OnClickListener {
    private lateinit var textView6: TextView
    private lateinit var trueButton15: Button
    private lateinit var falseButton16: Button
    private lateinit var nqButton14: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView6 = findViewById(R.id.textView6)
        trueButton15 = findViewById(R.id.trueButton15)
        falseButton16 = findViewById(R.id.falseButton16)
        nqButton14 = findViewById(R.id.nqButton14)

        trueButton15.setOnClickListener(this)
        falseButton16.setOnClickListener(this)
        nqButton14.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.trueButton15 -> {
                //  ,so True" is Incorrect
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
            }

            R.id.falseButton16 -> {
                // the cold war started after world war II, so "False" is correct.
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()

            }

            R.id.nqButton14 -> {
                // Create an Intent to navigate to MainActivity7
                val intent = Intent(this, MainActivity7::class.java)

            }
        }
    }
}

