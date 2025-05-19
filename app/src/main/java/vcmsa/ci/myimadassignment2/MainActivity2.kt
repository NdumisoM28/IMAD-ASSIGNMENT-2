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

abstract class MainActivity2 : AppCompatActivity() , View.OnClickListener {
    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        questionTextView = findViewById(R.id.textView2)
        trueButton = findViewById(R.id.truebutton2)
        falseButton = findViewById(R.id.falsebutton3)
        nextButton = findViewById(R.id.NQbutton10)

        trueButton.setOnClickListener(this)
        falseButton.setOnClickListener(this)
        nextButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.truebutton2 -> {
                // Nelson Mandela was NOT imprisoned in Alcatraz in 1956, so "True" is incorrect.
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
            }

            R.id.falsebutton3 -> {
                // Nelson Mandela was NOT imprisoned in Alcatraz in 1956, so "False" is correct.
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            }
            R.id.NQbutton10 -> {
                    // Create an Intent to navigate to MainActivity3
                    val intent = Intent(this, MainActivity3::class.java)
            }
        }

    }
}