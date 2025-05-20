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

abstract class MainActivity4 : AppCompatActivity() , View.OnClickListener {
    private lateinit var TextView4: TextView
    private lateinit var trueButton6: Button
    private lateinit var falseButton7: Button
    private lateinit var nqButton8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        TextView4 = findViewById(R.id.textView4)
        trueButton6 = findViewById(R.id.trueButton6)
        falseButton7 = findViewById(R.id.falseButton7)
        nqButton8 = findViewById(R.id.nqButton8)

        trueButton6.setOnClickListener(this)
        falseButton7.setOnClickListener(this)
        nqButton8.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.trueButton6 -> {
                // The Apartheird system was in South Africa and West Africa ,so True" is correct
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            }

            R.id.falseButton7 -> {
                // The Apartheird system was in South Africa and West Africa, so "False" is incorrect.
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()

            }

            R.id.nqButton8 -> {
                // Create an Intent to navigate to MainActivity5
                val intent = Intent(this, MainActivity5::class.java)
            }
        }
    }
}