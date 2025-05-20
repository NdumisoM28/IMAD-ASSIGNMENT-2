package vcmsa.ci.myimadassignment2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

abstract class MainActivity5 : AppCompatActivity() , View.OnClickListener {
    private lateinit var TextView5: TextView
    private lateinit var trueButton12: Button
    private lateinit var falseButton11: Button
    private lateinit var nqButton13: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        TextView5 = findViewById(R.id.textView5)
        trueButton12 = findViewById(R.id.trueButton12)
        falseButton11 = findViewById(R.id.falseButton11)
        nqButton13 = findViewById(R.id.nqButton13)

        trueButton12.setOnClickListener(this)
        falseButton11.setOnClickListener(this)
        nqButton13.setOnClickListener(this)
    }
}