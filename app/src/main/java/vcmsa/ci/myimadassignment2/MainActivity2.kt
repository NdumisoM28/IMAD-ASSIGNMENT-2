package vcmsa.ci.myimadassignment2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private var userScore: Int = 0
    private val correctAnswer: Boolean = false // Nelson Mandela was NOT imprisoned in Alcatraz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2) // Your second XML layout

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Retrieve the score passed from the previous activity
        userScore = intent.getIntExtra("USER_SCORE", 0)

        val trueButton: Button = findViewById(R.id.trueButton2)
        val falseButton: Button = findViewById(R.id.falseButton3)
        val nextQuestionButton: Button = findViewById(R.id.NQbutton10) // Note: ID in XML is NQButton10

        // Disable next button until an answer is chosen
        nextQuestionButton.isEnabled = false

        trueButton.setOnClickListener {
            checkAnswer(true)
            disableAnswerButtons(trueButton, falseButton)
            nextQuestionButton.isEnabled = true
        }

        falseButton.setOnClickListener {
            checkAnswer(false)
            disableAnswerButtons(trueButton, falseButton)
            nextQuestionButton.isEnabled = true
        }

        nextQuestionButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("USER_SCORE", userScore) // Pass the updated score
            startActivity(intent)
            finish() // Finish this activity so user can't go back with back button
        }
    }




    private fun checkAnswer(userAnswer: Boolean) {
        if (userAnswer == correctAnswer) {
            userScore++
            Toast.makeText(this, R.string.correct_answer_message, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, R.string.incorrect_answer_message, Toast.LENGTH_SHORT).show()
        }
    }

    private fun disableAnswerButtons(button1: Button, button2: Button) {
        button1.isEnabled = false
        button2.isEnabled = false
    }
}

class MainActivity3 {

}





